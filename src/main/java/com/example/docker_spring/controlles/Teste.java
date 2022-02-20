package com.example.docker_spring.controlles;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class Teste {
    
    @GetMapping
    public String teste2(){
        return "tudo bem?";
    }

    @GetMapping(value ="/image",produces  = MediaType.IMAGE_PNG_VALUE)
    public  byte[] getImageWithMediaType() throws IOException {
        File file=new File("src/main/resources/image.png");
        return Files.readAllBytes(file.toPath());
    }
}
