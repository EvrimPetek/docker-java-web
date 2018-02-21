package com.example.tp.demo.controller;


import com.example.tp.demo.Formation;
import com.example.tp.demo.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/formation")
public class FormationApiController {
    @Autowired
    private FormationRepository formationRepository;
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public void create(@RequestBody Formation formation) {
        formationRepository.save(formation);
    }
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Formation> get() {
        return formationRepository.findAll();
    }
}