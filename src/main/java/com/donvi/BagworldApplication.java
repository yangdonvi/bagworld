package com.donvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BagworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(BagworldApplication.class, args);
    }

}
