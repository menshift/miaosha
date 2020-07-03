package com.men.miaosha.entity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    @NotNull
    private Integer id;
    @NotNull
    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}