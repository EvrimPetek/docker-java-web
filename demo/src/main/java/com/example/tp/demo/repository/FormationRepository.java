package com.example.tp.demo.repository;

import java.util.List;

import com.example.tp.demo.Formation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormationRepository extends MongoRepository<Formation, Integer> {

    public Formation findByName(String name);
    public List<Formation> findByname(String name);

}