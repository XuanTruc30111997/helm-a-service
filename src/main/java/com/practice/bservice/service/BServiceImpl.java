package com.practice.bservice.service;

import com.practice.bservice.constants.PathConstants;
import com.practice.bservice.properties.EndpointProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class BServiceImpl implements BService {
    @Autowired
    EndpointProperties endpointProperties;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String callTest() {
        String url = new StringBuilder(endpointProperties.getBHost())
                .append(PathConstants.SLASH)
                .toString();
        log.info("Start calling with url: {}", url);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);

        log.info("End calling with response {}", response);
        return response.getBody();
    }
}
