package com.ExampleAPI.app.rest.Repo;


import com.ExampleAPI.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {

}
