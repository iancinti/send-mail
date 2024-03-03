package com.mail.send.controller


import com.mail.send.model.EmailResponse
import com.mail.send.service.SendEmailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmailControllerAdapter {

    @Autowired
    private lateinit var sendEmailService: SendEmailService

    @PostMapping("/send-email")
    fun sendEmail(@RequestBody emailResponse: EmailResponse) {
        val to = emailResponse.to
        val subject = emailResponse.subject
        val text = emailResponse.text
        sendEmailService.sendSimpleMessage(to, subject, text)
    }

}
