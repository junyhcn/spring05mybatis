package com.kgc.entity;

public class Goodstype {
    private Integer id;

    private String name;

    public Goodstype(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Goodstype() {
        super();
    }

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
        this.name = name == null ? null : name.trim();
    }
}