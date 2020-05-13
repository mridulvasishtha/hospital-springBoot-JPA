package com.mridul.hospital.hospitalmutimodule.config;

import com.mridul.hospital.hospitalmutimodule.model.ProfileData;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class ExternalCall<T> {
    HttpEntity<T> entity;
    private RestTemplate restTemplate;
    private ProfileData profileData;

    public ExternalCall(RestTemplate restTemplate, ProfileData profileData) {
        this.restTemplate = restTemplate;
        this.profileData = profileData;
    }

    public String postVerbRequest(T instance,String url) {
        setEntity(instance);
        ResponseEntity<String> s = restTemplate.exchange(profileData.getHostAddress() + url, HttpMethod.POST, entity, String.class);
        System.out.println(s.getBody());
        return s.getBody();
    }

    private void setEntity(T instance) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        entity = new HttpEntity<>(instance, headers);
    }
}
