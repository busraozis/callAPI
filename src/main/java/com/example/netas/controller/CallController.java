package com.example.netas.controller;

import com.example.netas.exception.InvalidFieldException;
import com.example.netas.exception.MissingRequestParameterException;
import com.example.netas.model.Call;
import com.example.netas.model.CallResponse;
import com.example.netas.service.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CallController {

    @Autowired
    private CallService callService;

    @PostMapping("/call")
    public ResponseEntity<CallResponse> makeCall(@RequestBody Call call) throws Exception{

        if(call.getCaller() == null || call.getCallee() == null || call.getCallType() == null){
            throw new MissingRequestParameterException("Request parameter is missing.");
        }

        String callType = call.getCallType();
        if(!(callType.equalsIgnoreCase(Call.ANONYMOUS_VALUE) || callType.equalsIgnoreCase(Call.REGULAR_VALUE))){
            throw new InvalidFieldException("Call Type is not valid.");
        }

        return new ResponseEntity<>(callService.makeCall(call), HttpStatus.OK);
    }

}
