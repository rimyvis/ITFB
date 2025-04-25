package com.example.inn;

public class Response {
    private String organization;

    public Response (String organization){
        this.organization = organization;
    }

    public String getOrganization(){
        return organization;
    }

    public void setOrganization(String organization){
        this.organization = organization;
    }
}
