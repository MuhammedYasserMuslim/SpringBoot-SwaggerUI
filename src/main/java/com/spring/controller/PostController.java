package com.spring.controller;

import com.spring.model.Post;
import com.spring.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostServices postServices;

    @GetMapping("/posts")
    public List<Post> getAllPosts(Long id){
        return postServices.getAllPosts();
    }

    @GetMapping("/post")
    public Post getPostById(@RequestParam Long id){
        return postServices.getPostById(id);
    }
}
