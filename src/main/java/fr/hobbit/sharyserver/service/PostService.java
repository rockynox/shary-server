package fr.hobbit.sharyserver.service;

import fr.hobbit.sharyserver.domain.Post;
import fr.hobbit.sharyserver.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }
}
