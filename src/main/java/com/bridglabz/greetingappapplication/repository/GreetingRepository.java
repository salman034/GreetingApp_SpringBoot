package com.bridglabz.greetingappapplication.repository;

import com.bridglabz.greetingappapplication.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}
