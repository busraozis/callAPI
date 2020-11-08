package com.example.netas.model;

public class RegularCall implements CallResponse{

    private String response = "This is a regular call.";

    @Override
    public String getResponse() {
        return this.response;
    }

}
