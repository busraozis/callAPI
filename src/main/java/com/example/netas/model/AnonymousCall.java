package com.example.netas.model;

public class AnonymousCall implements CallResponse{

    private String response = "This is an anonymous call.";

    @Override
    public String getResponse() {
        return this.response;
    }

}
