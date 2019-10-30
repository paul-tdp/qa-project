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

import com.travel_stories.entities.Stories;
import com.travel_stories.repositories.StoriesRepo;

@RestController
@Transactional
public class StoriesController {
	@Autowired
	private StoriesRepo repo;
	
	@GetMapping("/getstories")
	public ArrayList<Stories> showstories() {
		return repo.findAll();
	}
	@PostMapping("/savestory")
	public String save(@RequestBody Stories st) {
		repo.save(st);
		return "record inserted";
	}
	@DeleteMapping("/deletestory/{sid}")
	public String deletestory(@PathVariable int sid) {
		repo.deleteBystoryid(sid);
		return "story deleted";
	}
	@PutMapping("/updatestory")
	public String updatestory(@RequestBody Stories ref1) {
		repo.save(ref1);
		return "story updated";
	}

}
