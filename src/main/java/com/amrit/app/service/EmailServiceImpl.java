package com.amrit.app.service;

import com.amrit.app.dto.EmailResponse;
import com.amrit.app.util.MailUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService{

    private final MailUtil mailUtil;


    @Override
    public EmailResponse sendEmail(
            String to,
            String[] cc,
            String[] bcc,
            String subject,
            String text,
            Resource[] files
    ) {
        boolean result = mailUtil.send(to,cc,bcc,subject,text,files);
        if(result){
            return new EmailResponse("Email sent successfully", "SUCCESS-EMAIL-SEND");
        }
        return new EmailResponse("Email NOT sent", "FAILURE-EMAIL-SEND");
    }

}
