package com.example.data;
import com.example.data.login;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<login, Integer> {

}