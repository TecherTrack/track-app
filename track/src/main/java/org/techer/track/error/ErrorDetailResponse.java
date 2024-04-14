package org.techer.track.error;

public class ErrorDetailResponse {

    private String errorMessage;
    private int statusCode ;
    private String url;

    public ErrorDetailResponse(String errorMessage, int statusCode, String url) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
        this.url = url;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
