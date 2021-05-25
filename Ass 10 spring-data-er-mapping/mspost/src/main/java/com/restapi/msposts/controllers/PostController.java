package com.restapi.msposts.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restapi.msposts.dtos.PostDTO;
import com.restapi.msposts.exceptions.PostNotFoundException;
import com.restapi.msposts.mappers.PostMapper;
import com.restapi.msposts.models.Post;
import com.restapi.msposts.repositories.PostRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
@Validated
@Api(value = "Post MicroService", description = "MicroService For Posts Management")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	// GET ALL POSTS
	@ApiOperation(value = "Display all available Posts", response = Iterable.class)
	@GetMapping(value="/posts")
	List<Post> getAll(){
		return postRepository.findAll();
	}
	
	// GET SINGLE POST BY ID
	@ApiOperation(value = "View Post details by ID", response = Post.class)
	@GetMapping(value="/posts/{id}")
	ResponseEntity<Post> getById(@ApiParam(value = "Post ID") @PathVariable("id") @Min(1) int id) {
		
		Post usr = postRepository.findById(id)
				   .orElseThrow(()->new PostNotFoundException("Post with ID : "+id+" Not Found!"));
		
		return ResponseEntity.ok().body(usr);
	}
	
	// CREATE NEW POST
	@ApiOperation(value = "Create new Post")
	@PostMapping(value="/posts")
	ResponseEntity<?> create(@ApiParam(value = "Post DTO instance") @Valid @RequestBody PostDTO postdto) {
		
		Post post = PostMapper.postDtoTopost(postdto);
		Post addeduser = postRepository.save(post);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			                .path("/{id}")
			                .buildAndExpand(addeduser.getId())
			                .toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	// UPDATE ONE POST DETAILS
	@ApiOperation(value = "Update Post details by ID")
	@PutMapping(value="/posts/{id}")
	ResponseEntity<Post> update(@ApiParam(value = "Post ID") @PathVariable("id")  @Min(1) int id, @ApiParam(value = "Post DTO instance") @Valid @RequestBody PostDTO postdto) {

		Post ppost = postRepository.findById(id)
               .orElseThrow(()->new PostNotFoundException("Post with ID : "+id+" Not Found!"));
		
		Post newpost = PostMapper.postDtoTopost(postdto);
		newpost.setId(ppost.getId());
		postRepository.save(newpost);
		return ResponseEntity.ok().body(newpost);
		
	}
	
	// DELETE POST BY ID
	@ApiOperation(value = "Delete Post by ID")
	@DeleteMapping(value="/posts/{id}")
	ResponseEntity<String> delete(@ApiParam(value = "Post ID") @PathVariable("id") @Min(1) int id) {
		Post post = postRepository.findById(id)
				.orElseThrow(()->new PostNotFoundException("Post with ID : "+id+" Not Found!"));
		
		postRepository.deleteById(post.getId());
		return ResponseEntity.ok().body("Post deleted with success!");
		
	}
	

}
