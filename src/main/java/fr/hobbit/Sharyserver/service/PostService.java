package fr.hobbit.Sharyserver.service;

import fr.hobbit.Sharyserver.domain.Post;
import fr.hobbit.Sharyserver.repository.PostRepository;
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
