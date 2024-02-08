package com.message.otp.controller;


import com.message.otp.service.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TwilioController {
    @Autowired
    private TwilioService twilioService;

    @GetMapping("/send")
    public String sendOtp(@RequestParam String phoneNumber,@RequestParam String message){
        twilioService.sendMessage(phoneNumber,message);
        return "Sent";
    }
}
