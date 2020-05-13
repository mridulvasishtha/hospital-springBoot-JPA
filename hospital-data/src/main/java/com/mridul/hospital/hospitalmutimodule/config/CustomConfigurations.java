package com.mridul.hospital.hospitalmutimodule.config;

import com.mridul.hospital.hospitalmutimodule.model.ProfileData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomConfigurations {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    @Profile({"local","default"})
    public ProfileData getMe(){
        ProfileData profileData=new ProfileData();
        profileData.setHostAddress("http://localhost:8081/");
        return profileData;
    }

}
