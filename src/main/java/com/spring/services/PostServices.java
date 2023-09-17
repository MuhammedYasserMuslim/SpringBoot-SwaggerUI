package com.spring.services;

import com.spring.model.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PostServices {

    private static String POST_URL = "https://jsonplaceholder.typicode.com/posts";

    public Post getPostById(Long id) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Post> posts = restTemplate.getForEntity(POST_URL + "/" + id, Post.class);
        return posts.getBody();
    }


    public List<Post> getAllPosts() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List> posts = restTemplate.getForEntity(POST_URL, List.class);
        return posts.getBody();
    }
}