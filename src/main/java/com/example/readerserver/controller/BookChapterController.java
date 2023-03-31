package com.example.readerserver.controller;

import com.example.readerserver.bean.BookChapter;
import com.example.readerserver.mapper.BookChapterMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookChapterController {
    private Gson gson = new Gson();
    @Autowired
    BookChapterMapper bookChapterMapper;// 自动连接 mapper 映射
    @GetMapping("/book-chapter")
    public String select(){
        List<BookChapter> books = bookChapterMapper.selectList(null);
        return gson.toJson(books) ;
    }
}
