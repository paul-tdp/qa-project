package com.travel_stories.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel_stories.entities.users;
import com.travel_stories.repositories.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
//	public int findMaxAge() {
//		return repo.findMaxAge();
//	}
//	public ArrayList<users> recordsMaxAgeByCountry(int countryid) {
//		return repo.recordsMaxAgeByCountry(countryid);
//	}
}
