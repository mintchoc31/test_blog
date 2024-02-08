package com.tenco.blog.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	
	// 글 쓰기
	public int insert(BoardEntity boardEntity);
	
	//글 수정
//	public int update;
	
	// 글 삭제
//	public int delete;
	
	// 글 조회 - 글 번호 select/ integer boardNo
//	public int findById;
	
	// 글 목록 조회
	public List<BoardEntity> findAll(int id);

}
