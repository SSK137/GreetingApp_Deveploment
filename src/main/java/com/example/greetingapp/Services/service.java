package com.example.greetingapp.Services;

import com.example.greetingapp.Module.Data;
import com.example.greetingapp.Repository.SpringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    SpringRepo springRepo;
    public String message(){
        return "Saurabh Kodam";
    }
    public Data message1(Data data){
        Data data1=new Data(data);
        springRepo.save(data1);
        return data1;
    }
}
