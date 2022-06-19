package com.bridglabz.greetingappapplication.service;

import java.util.List;
import com.bridglabz.greetingappapplication.model.Greeting;
import com.bridglabz.greetingappapplication.model.User;



public interface GreetingService {

    Greeting addGreeting(User user);

    Greeting getGreetingById(Long id);

    List<Greeting> getAll();

    Greeting editGreetingById(long id, String name);

    List<Greeting> deleteGreetingById(Long id);

}