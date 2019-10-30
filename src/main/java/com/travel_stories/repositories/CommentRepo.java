package com.travel_stories.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel_stories.entities.Comments;

public interface CommentRepo extends JpaRepository<Comments, Integer>{
	public ArrayList<Comments> findAll();
	public void deleteBycommentid(int c);
}
