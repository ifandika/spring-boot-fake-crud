package com.ifandika.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ifandika.data.Person;
import com.ifandika.data.Response;

@Service
public class PersonService {
    private ArrayList<Person> persons = new ArrayList<>();

    public PersonService() {
        persons.add(new Person(1, "Joni", 70, "joni@gmail.com"));
        persons.add(new Person(2, "Jupri", 40, "jupri@gmail.com"));
        persons.add(new Person(3, "Supri", 20, "supri@gmail.com"));
    }

    /**
     * REST API METHOD - GET
     */
    public Response getPersons() {
        return new Response(
            "Success",
            200,
            persons
        );
    }

    /**
     * REST API METHOD - GET
     */
    public Response getPersonById(int id) {
        ArrayList<Person> pArrayList = new ArrayList<>();
        for(Person p : persons) {
            if(p.getId() == id) {
                pArrayList.add(p);
                return new Response(
                    "Success",
                    200,
                    pArrayList
                );
            }
        }
        return new Response(
            "Failed, person no exist",
            400,
            pArrayList
        );
    }

    /**
     * REST API METHOD - POST
     */
    public Response addPerson(Person person) {
        Response response = new Response();
        if(person == null) {
            response.setMessage("Failed add, data person null");
            response.setCode(400);
            response.setPersonArrayList(new ArrayList<Person>());
            return response;
        }
        for(Person p : persons) {
            if(person.getId() == p.getId()) {
                response.setMessage("Failed add, data person id exist");
                response.setCode(400);
                response.setPersonArrayList(new ArrayList<Person>());
                return response;
            }
        }
        this.persons.add(person);
        response.setMessage("Success add person");
        response.setCode(200);
        response.setPersonArrayList(this.persons);
        return response;
    }

    /**
     * REST API METHOD - PUT
     */
    public Response updatePerson(int id, Person personNew) {
        Response response = new Response();
        if(personNew.isEmpty()) {
            response.setMessage("Failed add, data person new empty");
            response.setCode(400);
            response.setPersonArrayList(new ArrayList<>());
        }
        else if(id != personNew.getId()) {
            for(Person p : persons) {
                if(p.getId() == personNew.getId()) {
                    response.setMessage("Failed update, data person new id exist");
                    response.setCode(400);
                    response.setPersonArrayList(new ArrayList<>());
                    return response;
                }
            }
        }
        for(int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getId() == id) {
                persons.set(i, personNew);
            }
        }
        response.setMessage("Success update");
        response.setCode(200);
        response.setPersonArrayList(persons);
        return response;
    }

    /**
     * REST API METHOD - PUT
     */
    public Response deletePerson(int id) {
        Response response = new Response();
        if(id < 1) {
            response.setMessage("Failed delete, id not valid");
            response.setCode(400);
            response.setPersonArrayList(new ArrayList<>());
            return response;
        }
        for(int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getId() == id) {
                persons.remove(i);
            }
        }
        response.setMessage("Success delete");
        response.setCode(200);
        response.setPersonArrayList(persons);
        return response;
    }
}
