package com.tamerlanishmaev.microbank.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/service", produces = "application/json")
public class serviceUserController {



    @PatchMapping("/create")
    public void createBasicUser(  ) {

    }




}
