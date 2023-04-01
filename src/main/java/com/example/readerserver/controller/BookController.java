package com.example.readerserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.readerserver.bean.Book;
import com.example.readerserver.mapper.BookMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@SuppressWarnings("all")// 清除警告
@CrossOrigin(origins = {"*","null"})// 配置跨域
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
    // 模糊搜索
    @GetMapping("/book/search")
    public String search(@RequestBody HashMap<String,String> data){
        String name = data.get("name");
        QueryWrapper<Book> bookQueryWrapper = new QueryWrapper<>();
        bookQueryWrapper.like("name",name);
        List<Book> books = bookMapper.selectList(bookQueryWrapper);
        return gson.toJson(books) ;
    }

}
