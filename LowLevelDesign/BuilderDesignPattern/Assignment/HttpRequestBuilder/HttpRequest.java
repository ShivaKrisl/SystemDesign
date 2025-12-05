package SystemDesign.LowLevelDesign.BuilderDesignPattern.Assignment.HttpRequestBuilder;

import java.util.HashMap;

public class HttpRequest{

    // Required fields
    private final RequestMethodsEnum method;
    private final String absoleteUrl;
    
    // Optional fields with default values
    private final HashMap<String, String> headers;
    private final String body;
    private final int timeout;

    private HttpRequest(Builder builder){
        this.method = builder.method;
        this.absoleteUrl = builder.absoleteUrl;
        this.headers =  builder.headers == null ? null : new HashMap<>(builder.headers); // Defensive copy
        this.body = builder.body == null ? null : new String(builder.body); // Defensive copy
        this.timeout = builder.timeout;
    }

    public static class Builder{
        // Required fields
        private RequestMethodsEnum method;
        private String absoleteUrl;
        
        // Optional fields with default values
        private HashMap<String, String> headers = null;
        private String body = null;
        private int timeout = 10;

        Builder setRequestMethod(String method){
            String methodUpper = method.toUpperCase();
            // Validate and set the request method
            if (!RequestMethodsEnum.isValid(methodUpper)) {
                throw new IllegalArgumentException("Invalid HTTP method: " + method);
            }
            this.method = RequestMethodsEnum.valueOf(methodUpper);
            return this;
        }

        Builder setAbsoleteUrl(String url){
            // check for valid URL format (basic check)
            if (url == null || (!url.startsWith("http://") && !url.startsWith("https://"))) {
                throw new IllegalArgumentException("Invalid URL: " + url);
            }
            this.absoleteUrl = url;
            return this;
        }

        Builder headers(HashMap<String, String> headers){
            this.headers = new HashMap<>(headers); // Defensive copy
            return this;
        }

        Builder addHeader(String key, String value){
            if (this.headers == null) {
                this.headers = new HashMap<>();
            }
            this.headers.put(key, value);
            return this;
        }

        Builder body(String body){
            // add defensive copy
            this.body = new String(body);
            return this;
        }

        Builder timeoutInSeconds(int timeoutInSeconds){
            this.timeout = timeoutInSeconds;
            return this;
        }

        HttpRequest build(){
            // validate Required fileds
            validateRequiredFields();
            
            // validate Business Requirements
            validateBusinessRequirements();

            return new HttpRequest(this);
        }

        private void validateRequiredFields(){
            if (this.method == null) {
                throw new IllegalStateException("Request method is required.");
            }
            if (this.absoleteUrl == null || this.absoleteUrl.isEmpty()) {
                throw new IllegalStateException("Absolete URL is required.");
            }
        }

        private void validateBusinessRequirements(){
            // Example: If method is POST or PUT, body should not be null
            if ((this.method == RequestMethodsEnum.POST || this.method == RequestMethodsEnum.PUT || this.method == RequestMethodsEnum.PATCH) && (this.body == null || this.body.isEmpty())) {
                throw new IllegalStateException("Body is required for POST, PUT, and PATCH requests.");
            }

            // for GET and DELETE, body should be null
            if ((this.method == RequestMethodsEnum.GET || this.method == RequestMethodsEnum.DELETE) && this.body != null) {
                throw new IllegalStateException("Body should be null for GET and DELETE requests.");
            }

            // Timeout should be positive
            if (this.timeout <= 0) {
                throw new IllegalStateException("Timeout should be a positive integer.");
            }
        }
    }

    @Override
        public String toString() {
            return "HttpRequest.Builder{" +
                    "method=" + method +
                    ", absoleteUrl='" + absoleteUrl + '\'' +
                    ", headers=" + headers +
                    ", body='" + body + '\'' +
                    ", timeout=" + timeout +
                    '}';
        }
}