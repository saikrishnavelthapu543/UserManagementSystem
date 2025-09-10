package com.example.usermanagement.controller;

import com.example.usermanagement.request.UserRequest;
import com.example.usermanagement.response.ResponseById;
import com.example.usermanagement.response.ResponseByuser;
import com.example.usermanagement.response.UserResponse;
import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getusers")
    private ResponseEntity<ResponseByuser> getusers()
    {
       return  userService.getusers();
    }

    @GetMapping("getbyUserId/{id}")
    private ResponseEntity<List<ResponseById>> getbyUserId(@PathVariable int id)
    {
        return userService.getbyUserId(id);
    }

    @PostMapping("create")
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest)
    {
    return userService.create(userRequest);
    }
    //(----------------------------------------------------------------------------------------------------------------------------------------------------------------------------)
    @GetMapping("getusersbyWebClient")
    private ResponseEntity<ResponseByuser> getusersbyWebClient()
    {
        return  userService.getusersbyWebClient();
    }

    @GetMapping("getbyUserIdByWEbClient/{id}")
    private ResponseEntity<List<ResponseById>> getbyUserIdByWEbClient(@PathVariable int id)
    {
        return userService.getbyUserIdByWEbClient(id);
    }

    @PostMapping("createuserByWebClient")
    public ResponseEntity<UserResponse> createuserByWebClient(@RequestBody UserRequest userRequest)
    {
        return userService.createuserByWebClient(userRequest);
    }
}
