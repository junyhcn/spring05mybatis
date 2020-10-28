package com.kgc.entity;

public class Tbuser {
    private Integer userid;

    private Integer userage;

    private String username;

    private String userpic;

    public Tbuser(Integer userid, Integer userage, String username, String userpic) {
        this.userid = userid;
        this.userage = userage;
        this.username = username;
        this.userpic = userpic;
    }

    public Tbuser() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic == null ? null : userpic.trim();
    }
}