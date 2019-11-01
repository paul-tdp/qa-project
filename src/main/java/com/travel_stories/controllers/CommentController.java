package com.travel_stories.controllers;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel_stories.entities.Comments;
import com.travel_stories.repositories.CommentRepo;

@RestController
@Transactional
public class CommentController {
	@Autowired
	private CommentRepo repo;
	
	@GetMapping("/getcomments")
	public ArrayList<Comments> getComments() {
		return repo.findAll();
	}
	@PostMapping("/savecomment")
	public String save(@RequestBody Comments ref) {
		repo.save(ref);
		return "record inserted";
	}
	@DeleteMapping("/deletecomment/{c}")
	public String deletecomment(@PathVariable int c) {
		repo.deleteBycommentid(c);
		return "Record Deleted";
	}
	@PutMapping("/updatecomment")
	public String update(@RequestBody Comments ref1) {
		repo.save(ref1);
		return "record updated";
	}
// Testing GIT
}
