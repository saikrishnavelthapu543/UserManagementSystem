package com.example.usermanagement.service;

import com.example.usermanagement.request.UserRequest;
import com.example.usermanagement.response.ResponseById;
import com.example.usermanagement.response.ResponseByuser;
import com.example.usermanagement.response.UserResponse;
import com.example.usermanagement.userproperties.UserApiProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserApiProperties userApiProperties;
    @Autowired
    private WebClient webClient;

    public ResponseEntity<ResponseByuser> getusers() {
        String url = userApiProperties.getBaseUrl() + userApiProperties.getEndpoints().getUsers();
        ResponseByuser responseByuser = restTemplate.getForObject(url, ResponseByuser.class);
        return new ResponseEntity<>(responseByuser, HttpStatus.OK);
    }

    public ResponseEntity<List<ResponseById>> getbyUserId(int id) {
        String url = userApiProperties.getBaseUrl() + userApiProperties.getEndpoints().getUsersbyid();
        List<ResponseById> response=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
           ResponseById responseById = restTemplate.getForObject(url, ResponseById.class, id);
            response.add(responseById);
        }
        return new ResponseEntity<List<ResponseById>>(response, HttpStatus.OK);
    }


    public ResponseEntity<UserResponse> create(UserRequest userRequest) {
        String url=userApiProperties.getBaseUrl()+userApiProperties.getEndpoints().getPostuser();
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UserRequest> httpEntity=new HttpEntity<UserRequest>(userRequest, httpHeaders);
        ResponseEntity<UserResponse> response= restTemplate.postForEntity(url,httpEntity,UserResponse.class);
        return new ResponseEntity<>(response.getBody(),HttpStatus.OK);
    }
    //(----------------------------------------------------------------------------------------------------------------------------------------------------------------------------)

    public ResponseEntity<ResponseByuser> getusersbyWebClient() {
        String url = userApiProperties.getBaseUrl() + userApiProperties.getEndpoints().getUsers();
        ResponseByuser responseByuser=webClient.get().uri(url).retrieve().bodyToMono(ResponseByuser.class).block();
        return new ResponseEntity<>(responseByuser, HttpStatus.OK);
    }

    public ResponseEntity<List<ResponseById>> getbyUserIdByWEbClient(int id) {
        String url = userApiProperties.getBaseUrl() + userApiProperties.getEndpoints().getUsersbyid();
        List<ResponseById> response=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ResponseById response1 = webClient.get().uri(url, id).retrieve().bodyToMono(ResponseById.class).block();
            response.add(response1);
        }
        return new ResponseEntity<List<ResponseById>>(response, HttpStatus.OK);
    }

    public ResponseEntity<UserResponse> createuserByWebClient(UserRequest userRequest) {
        String url=userApiProperties.getBaseUrl()+userApiProperties.getEndpoints().getPostuser();
        UserResponse response= webClient.post().uri(url).bodyValue(userRequest).retrieve().bodyToMono(UserResponse.class).block();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
