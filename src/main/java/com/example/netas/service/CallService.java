package com.example.netas.service;

import com.example.netas.model.AnonymousCall;
import com.example.netas.model.Call;
import com.example.netas.model.CallResponse;
import com.example.netas.model.RegularCall;
import org.springframework.stereotype.Service;

@Service
public class CallService {

    public CallResponse makeCall(Call call){

        CallResponse callResponse = null;
        String callType = call.getCallType();
        if(callType.equalsIgnoreCase(Call.ANONYMOUS_VALUE)){
            callResponse = new AnonymousCall();
        }else if(callType.equalsIgnoreCase(Call.REGULAR_VALUE)){
            callResponse = new RegularCall();
        }

        return callResponse;
    }
}
