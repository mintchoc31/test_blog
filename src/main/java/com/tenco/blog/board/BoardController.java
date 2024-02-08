package com.tenco.blog.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

    @GetMapping("/") // 글목록 페이지(메인)
    public String index() {
        return "index";
    }

    @GetMapping("/board/saveForm") // 글쓰기 페이지
    public String saveForm() {
        return "board/saveForm";
    }

    @GetMapping("/board/{boardNo}/updateForm") // 글 수정 페이지
    public String updateForm(@PathVariable int id) {
        return "board/updateForm";
    }

    @PostMapping("/board/save") // 글 저장
    public String save(){
        return "redirect:/";
    }

    @PostMapping("/board/{boardNo}/update") // 글 수정
    public String update(@PathVariable int id){
        return "redirect:/";
    }

    @PostMapping("/board/{boardNo}/delete") // 글 삭제
    public String delete(@PathVariable int id){
        return "redirect:/";
    }
}
