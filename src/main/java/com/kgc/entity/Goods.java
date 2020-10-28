package com.kgc.entity;

public class Goods {
    private Integer id;

    private String name;

    private Integer typeid;

    private Integer price;

    private String createtime;

    private String filename;

    public Goods(Integer id, String name, Integer typeid, Integer price, String createtime, String filename) {
        this.id = id;
        this.name = name;
        this.typeid = typeid;
        this.price = price;
        this.createtime = createtime;
        this.filename = filename;
    }

    public Goods() {
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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }
}