package com.sassaki.BoilerPlateVer01.services;

import com.sassaki.BoilerPlateVer01.DTOs.ExampleDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExampleService {
    public ExampleDTO returnExample (){
        ExampleDTO exampleDTO = new ExampleDTO();

        exampleDTO.setUserName("User Name");
        exampleDTO.setPassword("Password");

        return exampleDTO;
    }
}
