package com.example.greetingapp.Controller;

import com.example.greetingapp.Module.Data;
import com.example.greetingapp.Services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class control {
    //Using RequestBody
    @GetMapping("/getData")
    public String getdata(@RequestBody Data data){
        return "Hello "+data.getFirstName()+" "+data.getLastName();
    }

    //Using RequestMapping
    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public String reqData(){
        return "Hello RequestMap World";
    }

    //Using RequestMapping And RequestParam
    @RequestMapping(value = {"/get1"},method = RequestMethod.GET)
    public String reqData1(@RequestParam String name,@RequestBody Data data){
        return "Hello "+name+" "+data.getLastName();
    }

    //Using PathVariable
    @GetMapping("/param/{name}")
    public String pathData(@PathVariable String name){
        return "Hello "+name+" !!!!" ;
    }

    //Using Service Layer
    @Autowired
    service service1;
    @GetMapping("/serviceData")
    public String serviceData(){
        return "Hello "+service1.message();
    }

    @PostMapping("/serviceData1")
    public Data serviceData1(@RequestBody Data data){
        Data data1=service1.message1(data);
        return data1;
    }
}
