package com.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.test.Books;

public class BookService {

	@GET
	@Path("/getall")
	@Produces({"application/json"})
	public List<Books> getAllBooks(){
		List<Books> allBooks = new ArrayList<>();
		Books book1 = new Books();
		book1.setBookAuthor("author1");
		book1.setBookname("book name1");
		book1.setPublication("publication 1");
		book1.setReleaseYear("2001");
		Books book2 = new Books();
		book2.setBookAuthor("author2");
		book2.setBookname("book name2");
		book2.setPublication("publication 2");
		book2.setReleaseYear("2002");
		allBooks.add(book1);
		allBooks.add(book2);
		return allBooks;
	}
}
