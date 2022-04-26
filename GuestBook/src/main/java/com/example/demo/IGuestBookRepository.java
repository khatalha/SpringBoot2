package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGuestBookRepository extends JpaRepository<GuestBook, Integer>{

}
