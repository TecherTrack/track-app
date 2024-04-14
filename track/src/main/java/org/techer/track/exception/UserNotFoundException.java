package org.techer.track.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String errMsg) {
        super(errMsg);
    }
}
