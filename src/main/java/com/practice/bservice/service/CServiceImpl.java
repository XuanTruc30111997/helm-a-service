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
public class CServiceImpl implements CService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    EndpointProperties endpointProperties;

    @Override
    public int callTest() {
        String url = new StringBuilder(endpointProperties.getCHost())
                .append(PathConstants.SLASH)
                .toString();

        log.info("Start calling with url {}", url);
        ResponseEntity<Integer> response = restTemplate.exchange(url, HttpMethod.GET, null, Integer.class);

        log.info("End calling with response {}", response);
        return response.getBody();
    }
}

