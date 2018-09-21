package fr.hobbit.Sharyserver.controller;

import fr.hobbit.Sharyserver.domain.Post;
import fr.hobbit.Sharyserver.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("${endpoint.posts}")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @PostMapping
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }
}
