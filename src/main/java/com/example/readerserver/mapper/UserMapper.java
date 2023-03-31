package com.example.readerserver.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.readerserver.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
