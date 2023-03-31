package com.example.readerserver.controller;

import com.example.readerserver.bean.Book;
import com.example.readerserver.mapper.BookMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private Gson gson = new Gson();

    @Autowired
    BookMapper bookMapper;// 自动连接 mapper 映射
    @GetMapping("/book/select")
    public String select(){
        List<Book> books = bookMapper.selectList(null);
        return gson.toJson(books) ;
    }

    @PostMapping("/book/insert")
    public String insert(@RequestBody Book book){
//        String book = "{\"name\":\"test\"}";
//        Book book1 = gson.fromJson(book,Book.class) ;
        bookMapper.insert(book);
        return gson.toJson("true");
    }

    @DeleteMapping("/book/delete")
    public String delete(@RequestParam(value = "id") String id){
        bookMapper.deleteById(id);
        return gson.toJson("true");
    }
    @PutMapping("/book/update")
    public String update(@RequestBody Book book) {
        bookMapper.updateById(book);
        return gson.toJson("true");
    }
}
