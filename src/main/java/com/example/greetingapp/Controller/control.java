package com.example.greetingapp.Controller;

import com.example.greetingapp.Module.Data;
import com.example.greetingapp.Services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/hello")
    public String sayPosting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        if (lastName == null) lastName = "";
        else if (firstName == null) firstName = "";
        else if (firstName == null && lastName == null) {
            firstName = "";
            lastName = "";
        }
        return service1.sayHelloByName(firstName, lastName);
    }

    @PostMapping("/serviceData1")
    public Data serviceData1(@RequestBody Data data){
        Data data1=service1.message1(data);
        return data1;
    }
    //Message BY ID
    @GetMapping("/getbyid/{id}")
    public Optional<Data> getmssgbyid (@PathVariable Long id){
        Optional<Data> response = service1.getmsgbyid(id);
        return response;
    }
    //List of all Message
    @GetMapping("/getallData")
    public List<Data> getallData(){
        List<Data> data=service1.getallData();
        return data;
    }
    //Edit Data
    @PutMapping("/edit/{id}")
    public Data edit(@RequestBody Data user,@PathVariable Long id) {
        return service1.editData(user,id);
    }

    //Delete Data
    @DeleteMapping("/deleteData/{id}")
    public Data deleteData(@PathVariable Long id){
        return service1.deleteData(id);
    }
}
