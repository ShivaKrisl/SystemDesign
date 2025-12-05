package SystemDesign.LowLevelDesign.BuilderDesignPattern.Assignment.HttpRequestBuilder;

public class Main {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest.Builder()
                .setRequestMethod("POST")
                .setAbsoleteUrl("https://www.google.com")
                .addHeader("Content-Type", "application/json")
                .body("{\"key\":\"value\"}")
                .timeoutInSeconds(30)
                .build();
        System.out.println("Request created successfully -> " + request.toString());

        HttpRequest getRequest = new HttpRequest.Builder()
                .setRequestMethod("GET")
                .setAbsoleteUrl("https://www.example.com")
                .build();
        System.out.println("Request created successfully -> " + getRequest.toString());
    }
}
