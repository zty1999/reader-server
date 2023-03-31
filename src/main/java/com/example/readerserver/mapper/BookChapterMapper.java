package com.example.readerserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.readerserver.bean.BookChapter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookChapterMapper extends BaseMapper<BookChapter> {
}
