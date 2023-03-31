package com.example.readerserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.readerserver.bean.Book;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}

