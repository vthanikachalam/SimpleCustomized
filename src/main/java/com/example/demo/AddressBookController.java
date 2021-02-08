package com.example.demo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
public class AddressBookController {

    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/getContact/{id}")
    @ApiOperation(value = "getContact",
                    notes = "Provide an id to lookup a specific Contact from Address Book",
                    response = Contact.class)
    public Contact getContact(@ApiParam(value = "Example - 1234", required = true) @PathVariable String id){
        return contacts.get(id);
    }

    @GetMapping("/getAllContacts")
    public List<Contact> getAllContacts(){
        return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping("/addContact")
    public Contact addContact(@RequestBody Contact contact){
        contacts.put(contact.getId(), contact);
        return contact;
    }
}
