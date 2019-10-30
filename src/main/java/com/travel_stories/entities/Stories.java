package com.travel_stories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stories")
public class Stories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="story_id")
	private int storyid;
	@Column(name="user_id")
	private int user_id;
	@Column(name="title")
	private String title;
	@Column(name="picture")
	private String picture;
	@Column(name="num_likes")
	private int num_likes;
	@Column(name="location")
	private String location;
	@Column(name="story_text")
	private String storytext;
	
	public String getStorytext() {
		return storytext;
	}
	public void setStorytext(String storytext) {
		this.storytext = storytext;
	}
	public int getStory_id() {
		return storyid;
	}
	public void setStory_id(int story_id) {
		this.storyid = story_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getNum_likes() {
		return num_likes;
	}
	public void setNum_likes(int num_likes) {
		this.num_likes = num_likes;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Stories() {
		
	}
	public Stories(int story_id, int user_id, String title, String picture, int num_likes,
			String location, String storytext) {
		super();
		this.storyid = story_id;
		this.user_id = user_id;
		this.title = title;
		this.picture = picture;
		this.num_likes = num_likes;
		this.location = location;
		this.storytext = storytext;
	}
}
