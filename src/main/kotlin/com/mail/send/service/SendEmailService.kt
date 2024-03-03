package com.mail.send.service

interface SendEmailService {
    fun sendSimpleMessage(to: String, subject: String, text: String)
}