package com.message.otp.service;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;

@Service
public class TwilioService {

    public static final String ACCOUNT_SID = "ACd345b000fb44cd6334b93f0abfb3c886";
    public static final String AUTH_TOKEN = "6ecbb028f660014066e731f9ec7b05db";

    public void sendMessage(String phoneMessage,String sendingMessage){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+91"+phoneMessage),
                        new com.twilio.type.PhoneNumber("+16592575233"),
                        sendingMessage)
                .create();

        System.out.println(message.getSid());
    }


}
