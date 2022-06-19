package com.bridglabz.greetingappapplication.controller;

import com.bridglabz.greetingappapplication.model.Greeting;
import com.bridglabz.greetingappapplication.model.User;
import com.bridglabz.greetingappapplication.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    /**
     * @URL: http://localhost:8080/home
     * @Return: Hello World!
     */
    @GetMapping("/home")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    /**
     * @URL: http://localhost:8080/greeting?firstName=Salman&lastName=Pasha
     * @return: Hello Salman Pasha!
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "firstName",defaultValue = "world") String firstName,
                             @RequestParam(value = "lastName",defaultValue = "")String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    /**
     * @URL: http://localhost:8080/path/2   for eg:"id=2"
     * @Return: Value at id 2
     */
    @GetMapping("/path/{id}")
    public Greeting getGreetingById(@PathVariable Long id){
        return greetingService.getGreetingById(id);
    }

    /**
     * @URL: http://localhost:8080/all
     * @Return: All elements in repository
     */
    @GetMapping("/all")
    public List<Greeting> getAll(){
        return greetingService.getAll();
    }

    /**
     * @URL: http://localhost:8080/edit/2
     * @Return: Edits position Id 2
     */
    @PutMapping("/edit/{id}")
    public Greeting editGreetingById(@PathVariable long id, @RequestParam String name){
        return greetingService.editGreetingById(id, name);
    }

    /**
     * @URL: http://localhost:8080/delete/2   for ed id:2
     * @Return: Delete's position Id 2
     */
    @DeleteMapping("/delete/{id}")
    public List<Greeting> deleteGreetingById(@PathVariable Long id){
        return greetingService.deleteGreetingById(id);
    }

}