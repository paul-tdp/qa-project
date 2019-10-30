package com.travel_stories.controllers;

import java.util.ArrayList;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel_stories.entities.users;
import com.travel_stories.repositories.UserRepo;

@RestController
@Transactional
public class UserController {
	@Autowired
	private UserRepo repo;

	
	@GetMapping("/getusers")
		public ArrayList<users> showUsers() {
		return repo.findAll();
	}
	
//	@PostMapping("/save/{uid}/{un}/{em}/{fn}/{ln}/{ag}/{psw}/{cid}/{cnid}/{ur}")
//	public String s(@PathVariable int uid,
//					   @PathVariable String un,
//					   @PathVariable String em,
//					   @PathVariable String fn,
//					   @PathVariable String ln,
//					   @PathVariable int ag,
//					   @PathVariable String psw,
//					   @PathVariable int cid,
//					   @PathVariable int cnid,
//					   @PathVariable int ur
//					   ) {
//		users ref = new users();
//		ref.setUser_id(uid);
//		ref.setUsername(un);
//		ref.setEmail(em);
//		ref.setFirst_name(fn);
//		ref.setLast_name(ln);
//		ref.setAge(ag);
//		ref.setPswd(psw);
//		ref.setCity_id(cid);
//		ref.setCountry_id(cnid);
//		ref.setUser_role(ur);
//		repo.save(ref);
//		return "record inserted";
//	}
	
	@PostMapping("/saveuser")
	public String ss(@RequestBody users ref) {
		repo.save(ref);
		return "record inserted";
	}
//	@GetMapping("/maxAge")
//	public int maxAge() {
//		return repo.findMaxAge();
//	}
//	@GetMapping("/recordsMaxAgeByCountry/{countryid}")
//	public ArrayList<users> rmab(@PathVariable int countryid) {
//		return repo.recordsMaxAgeByCountry(countryid);
//	}
	@DeleteMapping("/deleteuser/{uid}")
	public String deleteuser(@PathVariable int uid) {
		repo.deleteByuserid(uid);
		return "user " + uid + " deleted";
	}
	@PutMapping("/updateuser")
	public String updateuser(@RequestBody users ref1) {
		repo.save(ref1);
		return "user updated";
	}
}
