package com.example.readerserver.bean;

import lombok.Data;

//@Data 自动生成getter setter
@Data
public class User {
    private String username;
    private String password;
    private String realname;
    private String nickname;
    private String email;
}
