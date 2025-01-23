package com.example.template.domain.post.post.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/write")
    @ResponseBody
    public String showWrite() { // 문서 처리하게 ~ 부서로 가세요
        return """
                <form action="/posts/doWrite" method="post">
                  <input type="text" name="title" placeholder="제목" />
                  <textarea name="content"></textarea>
                  <input type="submit" value="등록" />
                </form>
                """; // 문서작성해서 오세요
    }

    @PostMapping("/doWrite")
    @ResponseBody
    public String doWrite(String title, String content) {

        return """
                <h1>게시물 조회</h1>
                <div>%s</div>
                <div>%s</div>
                """.formatted(title, content); // 문서 처리해드릴게요
    }

}