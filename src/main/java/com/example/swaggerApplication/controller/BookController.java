package com.example.swaggerApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swaggerApplication.model.Book;
import com.example.swaggerApplication.service.BookService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/book")
public class BookController {

		@Autowired
		private BookService service;
		
		@PostMapping("/save")
		public String saveData( @RequestBody Book book)
		{
			return service.saveBook(book);
		}
		
		
		@GetMapping("/searchBook/{bookId}")
		@ApiOperation(value = "find contact by id",
		notes = "provide an id to look up specific contact from the address book",
		response = Book.class)
		//this is use to give comments in parameter.
		public Book getData(@ApiParam(value = "Id value for the contact you need to retrieve" , required = true) @PathVariable int bookId)
		{
			return service.getBook(bookId);
		}
		
		@GetMapping("/removeBook/{bookId}")
		public List<Book> removeData(@PathVariable int bookId)
		{
			return service.removeBook(bookId);
		}
}
