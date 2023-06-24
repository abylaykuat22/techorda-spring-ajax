package kz.bitlab.techordaspringajax.controllers;

import java.util.List;
import kz.bitlab.techordaspringajax.models.Post;
import kz.bitlab.techordaspringajax.repositores.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostController {
  @Autowired
  private PostRepository postRepository;

  @GetMapping
  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  @GetMapping("{id}")
  public Post getPostById(@PathVariable Long id) {
    return postRepository.findById(id).orElse(null);
  }

  @PostMapping
  public Post addPost(@RequestBody Post post) {
    return postRepository.save(post);
  }

  @PutMapping
  public Post updatePost(@RequestBody Post post) {
    return postRepository.save(post);
  }

  @DeleteMapping("{id}")
  public void deletePost(@PathVariable Long id) {
    postRepository.deleteById(id);
  }
}
