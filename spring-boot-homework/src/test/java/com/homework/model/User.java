package com.homework.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hukai
 * @since 2018-09-13
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    private Integer age;

    private String name;

    private String email;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
        "age=" + age +
        ", name=" + name +
        ", email=" + email +
        "}";
    }
}
