package com.example.demo.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="user_table")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int userid;

    @Column
    private String name;

    @Column
    private int TTL;

    @Column
    private Timestamp timestamp;

    public User(){

    }
    public User(String name,int TTL, Timestamp timestamp){
        super();
        this.name=name;
        this.TTL=TTL;
        this.timestamp=timestamp;
    }
    public int getId()
    {
        return userid;
    }
    public void setId(int userid)
    {
        this.userid = userid;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getTTL()
    {
        return TTL;
    }
    public void setTTL(int TTL)
    {
        this.TTL = TTL;
    }
    public Timestamp getTimestamp()
    {
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }
}
