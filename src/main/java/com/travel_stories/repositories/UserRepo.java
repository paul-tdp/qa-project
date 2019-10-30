package com.travel_stories.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel_stories.entities.users;

public interface UserRepo extends JpaRepository<users, Integer> {
	public ArrayList<users> findAll();
//	public int findMaxAge();
//	public ArrayList<users> recordsMaxAgeByCountry(int countryid);
	public void deleteByuserid(int uid);
}
