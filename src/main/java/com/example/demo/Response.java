package com.example.demo;

public class Response {
    private boolean isValid;

    public Response(boolean isValid){
        this.isValid = isValid;
    }

    public boolean getIsValid(){
        return isValid;
    }

    public void setIsValid (boolean isValid){
        this.isValid = isValid;
    }
}
