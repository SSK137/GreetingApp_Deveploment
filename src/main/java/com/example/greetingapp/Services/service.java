package com.example.greetingapp.Services;

import com.example.greetingapp.Module.Data;
import org.springframework.stereotype.Service;

@Service
public class service {
    public String message(){
        return "Saurabh Kodam";
    }

    public Data message1(Data data){
        Data data1=new Data(data);
        return data1;
    }
}
