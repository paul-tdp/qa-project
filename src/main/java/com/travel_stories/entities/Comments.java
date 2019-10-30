package com.travel_stories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id")
	private int commentid;
	@Column(name = "story_id")
	private int story_id;
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "user_comment")
	private String user_comment;
	public int getCommentid() {
		return commentid;
	}
	public void setComment_id(int commentid) {
		this.commentid = commentid;
	}
	public int getStory_id() {
		return story_id;
	}
	public void setStory_id(int story_id) {
		this.story_id = story_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_comment() {
		return user_comment;
	}
	public void setUser_comment(String user_comment) {
		this.user_comment = user_comment;
	}

	public Comments() {
		
	}
	public Comments(int comment_id, int story_id, int user_id, String user_comment) {
		super();
		this.commentid = commentid;
		this.story_id = story_id;
		this.user_id = user_id;
		this.user_comment = user_comment;
	}
	
	
}
