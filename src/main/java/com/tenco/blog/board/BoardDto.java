package com.tenco.blog.board;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardDto {

	private String author; 
    private String title;
    private String content; 


}
