package org.techer.track.exception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import org.techer.track.error.ErrorDetailResponse;

@RestControllerAdvice
public class UserTrackAdvice {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDetailResponse validateErrorResponse(HttpServletRequest request, UserNotFoundException ex){
        ErrorDetailResponse errorDetailResponse = new ErrorDetailResponse(ex.getMessage(),HttpStatus.NOT_FOUND.value() , request.getRequestURI());
        return errorDetailResponse;
    }

}
