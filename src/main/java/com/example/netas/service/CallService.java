package com.example.netas.service;

import com.example.netas.model.Call;
import com.example.netas.model.CallResponse;
import org.springframework.stereotype.Service;

@Service
public class CallService {

    public CallResponse makeCall(Call call){

        CallResponse callResponse = new CallResponse();
        String callType = call.getCallType();
        if(callType.equalsIgnoreCase(Call.ANONYMOUS_VALUE)){
            callResponse.setResponse("This is an anonymous call.");
        }else if(callType.equalsIgnoreCase(Call.REGULAR_VALUE)){
            callResponse.setResponse("This is a regular call.");
        }

        return callResponse;
    }
}
