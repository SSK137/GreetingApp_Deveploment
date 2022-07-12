package com.example.greetingapp.Repository;

import com.example.greetingapp.Module.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringRepo extends JpaRepository<Data,Integer> {
}
