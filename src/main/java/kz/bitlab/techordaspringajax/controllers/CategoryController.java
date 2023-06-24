package kz.bitlab.techordaspringajax.controllers;

import java.util.List;
import kz.bitlab.techordaspringajax.models.Category;
import kz.bitlab.techordaspringajax.models.Post;
import kz.bitlab.techordaspringajax.repositores.CategoryRepository;
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
@RequestMapping(value = "/categories")
public class CategoryController {
  @Autowired
  private CategoryRepository categoryRepository;

  @GetMapping
  public List<Category> getPosts() {
    return categoryRepository.findAll();
  }

  @GetMapping("{id}")
  public Category getPostById(@PathVariable Long id) {
    return categoryRepository.findById(id).orElse(null);
  }
}
