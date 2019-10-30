package com.travel_stories.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel_stories.entities.Stories;

public interface StoriesRepo extends JpaRepository<Stories, Integer> {
	public ArrayList<Stories> findAll();
	public void deleteBystoryid(int sid);
}
