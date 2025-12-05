package SystemDesign.LowLevelDesign.BuilderDesignPattern.Assignment.HttpRequestBuilder;

public enum RequestMethodsEnum {
    GET,
    POST,
    PUT,
    DELETE,
    PATCH;

    public static boolean isValid(String method) {
        for (RequestMethodsEnum m : RequestMethodsEnum.values()) {
            if (m.name().equals(method)) {
                return true;
            }
        }
        return false;
    }
}