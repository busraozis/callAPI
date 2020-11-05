package com.example.netas.model;


public class Call {

    public static final String ANONYMOUS_VALUE = "Anonymous";
    public static final String REGULAR_VALUE = "Regular";

    private String callType;
    private String caller;
    private String callee;

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }
}
