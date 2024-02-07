package com.java.mailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.java.mailsender.service.impl.MailServiceImpl;

@RestController
@RequestMapping("/home")
public class MailController {

	@Autowired
	private MailServiceImpl mailService;
	
	@PostMapping("/send")
	public String sendEmail(@RequestParam(value = "file",required = false)MultipartFile[] file) {
		
	}
	
}
