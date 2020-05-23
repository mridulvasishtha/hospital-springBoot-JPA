package com.mridul.hospital.hospitalmutimodule.testController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome general public</h1>";
    }

    @GetMapping("/user")
    public String welcomeUser(){
        return "<h1>Welcome User</h1>";
    }

    @GetMapping("/admin")
    public String welcomeAdmin(){
        return "<h1>Welcome Admin</h1>";
    }
}
