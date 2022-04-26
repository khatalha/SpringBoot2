package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GuestBookController {
	
	@Autowired
	GuestBookService gbservice;
	
	
	@GetMapping("/gbook")
	public List<GuestBook> list()
	{
		return gbservice.listAll();
	}
	
	
	@GetMapping("/gbook/{id}")
	 public ResponseEntity<GuestBook> get(@PathVariable Integer id) 
	 {
		 try
		 {
			 GuestBook guestbook = gbservice.get(id);
			 return new ResponseEntity<GuestBook>(guestbook, HttpStatus.OK);
		 } 
	 catch (NoSuchElementException e) 
		 {
		 	return new ResponseEntity<GuestBook>(HttpStatus.NOT_FOUND);
		 } 
	 }
	
	
	
	// RESTful API method for Create operation
		 @PostMapping("/gbookput")
		 public void addGuestBook(@RequestBody GuestBook guestbook) 
		 {
			 gbservice.save(guestbook);
		 }
		 
		 
		// RESTful API method for Update operation
		 @PutMapping("/gbook/{id}")
		 public ResponseEntity<GuestBook> update(@RequestBody GuestBook guestbook, @PathVariable Integer id) 
			 {
			 try
			 {
				 GuestBook existEmployee = gbservice.get(id);
				 gbservice.save(guestbook);
				 return new ResponseEntity<>(HttpStatus.OK);
			 } 
			 catch (NoSuchElementException e) 
			 {
				 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			 } 
		 }
		 
		 
		 
			// RESTful API method for Delete operation
			 @DeleteMapping("/gbook/{id}")
			 public boolean deleteGuestBook(@PathVariable Integer id) 
			 {
				 gbservice.delete(id);
				return false;
			 } 
		 
		 
		 

}
