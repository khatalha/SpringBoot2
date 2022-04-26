package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class GuestBookService {
	
	
	@Autowired
	IGuestBookRepository gbrepo;
	
	public List<GuestBook> listAll()
	{
		return gbrepo.findAll();
	}

	
	public void save(GuestBook guestbook)
	{
		gbrepo.save(guestbook);
	}
	
	
	public GuestBook get(int id)
	{
		return gbrepo.findById(id).get();
	}
	
	
	public void delete(int id)
	{
		gbrepo.deleteById(id);
	}
}
