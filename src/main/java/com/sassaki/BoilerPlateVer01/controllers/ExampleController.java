package com.sassaki.BoilerPlateVer01.controllers;

import com.sassaki.BoilerPlateVer01.DTOs.ExampleDTO;
import com.sassaki.BoilerPlateVer01.services.ExampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ExampleController {
    private final ExampleService exampleService;

    @Operation(summary = "Example request", tags = {"Example"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation")
    })
    @GetMapping("/example")
    public ResponseEntity<ExampleDTO> returnExample() {
        return ResponseEntity.ok(exampleService.returnExample());
    }
}
