package com.practice.bservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    CService cService;

    @Autowired
    BService bService;

    @Override
    public String callTest() {
        String testB = bService.callTest();
        int testC = cService.callTest();
        String response = new StringBuilder("This is A with ")
                .append(testB)
                .append(" - ")
                .append(testC)
                .toString();
        return response;
    }
}
