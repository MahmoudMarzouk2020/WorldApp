package org.tech.world.exception;

import java.time.LocalDateTime;

public class APIErrorResponse {
    
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String errorCode;
    private String message;
    
    public APIErrorResponse() {
    }
    
    public APIErrorResponse(LocalDateTime timestamp, Integer status, String error, String errorCode, String message) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.errorCode = errorCode;
        this.message = message;
    }
    
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getError() {
        return error;
    }
    
    public void setError(String error) {
        this.error = error;
    }
    
    public String getErrorCode() {
        return errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
}
