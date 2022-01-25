package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date momment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> Comments = new ArrayList<>();
	
	public Post() {}

	public Post(Date momment, String title, String content, Integer likes) {
		this.momment = momment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments(){
		return Comments;
	}
	
	public void addComment(Comment comment) {
		Comments.add(comment);
	}
	
}
