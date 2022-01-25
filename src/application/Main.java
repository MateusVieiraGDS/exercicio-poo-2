package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Post p1 = new Post();
		p1.setTitle("Traveling to New Zealand");
		p1.setMomment(sdf.parse("21/06/2018 13:05:44"));
		p1.setLikes(12);
		p1.setContent("I'm going to visit this wonderful country!");
		p1.addComment(new Comment("Have a nice trip"));
		p1.addComment(new Comment("Wow that1s awesome!"));
		
		Post p2 = new Post();
		p2.setTitle("Good night guys");
		p2.setMomment(sdf.parse("28/07/2018 23:14:19"));
		p2.setLikes(5);
		p2.setContent("See you tomorrow");
		p2.addComment(new Comment("Good night"));
		p2.addComment(new Comment("May the Force be with you"));
		
		
		Post[] listPrint = new Post[] {p1, p2};
		
		for (Post p : listPrint) {
			System.out.println(p.getTitle());
			System.out.println(p.getLikes() + " Likes - " + sdf.format(p.getMomment()));
			System.out.println(p.getContent());
			System.out.println("Comments:");
			for (Comment c : p.getComments()) {
				System.out.println(c.getText());
			}
			System.out.println();
		}
	}

}
