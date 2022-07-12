package com.example.greetingapp.Services;

import com.example.greetingapp.Module.Data;
import com.example.greetingapp.Repository.SpringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {
    @Autowired
    SpringRepo springRepo;
    public String message(){
        return "Saurabh Kodam";
    }
    public String sayHelloByName(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName + "!!!";
    }
    public Data message1(Data data){
        Data data1=new Data(data);
        springRepo.save(data1);
        return data1;
    }
    public Optional<Data> getmsgbyid(Long id){
        return springRepo.findById(id);
    }
    public List<Data> getallData(){
        return springRepo.findAll();
    }
    public Data editData(Data data,Long id){
        Data data1=new Data(data,id);
        springRepo.save(data1);
        return data1;
    }

    public Data deleteData(Long id) {
        Data data=new Data(id);
        springRepo.delete(data);
        return data;
    }
}
