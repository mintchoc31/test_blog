package com.tenco.blog.board;

import java.sql.Timestamp;

import lombok.Data;


public class BoardEntity {
	
	private int id; 
	private String author; 
    private String title;
    private String content; 
    private Timestamp createdAt; 
}
