package com.amrit.app;

import com.amrit.app.Util.MailUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

@SpringBootApplication
public class EmailServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmailServiceApplication.class, args);
    }

}
