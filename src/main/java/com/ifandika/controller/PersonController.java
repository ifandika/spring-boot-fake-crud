package com.ifandika.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifandika.data.Person;
import com.ifandika.data.Response;
import com.ifandika.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(path = "/api/v1/fakecrud/person/")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "all")
    public Response getPersons() {
        return personService.getPersons();
    }

    @GetMapping(path = "{id}")
    public Response getPersonById(@PathVariable int id) {
        return personService.getPersonById(id);
    }
    
    @PostMapping(path = "add")
    public Response addPerson(@RequestBody(required = true) Person p) {
        return personService.addPerson(p);
    }

    @PutMapping(path = "{id}")
    public Response updatePerson(@PathVariable int id, @RequestBody(required = true) Person person) {
        return personService.updatePerson(id, person);
    }

    @DeleteMapping(path = "{id}")
    public Response deletePerson(@PathVariable int id) {
        return personService.deletePerson(id);
    }
}
