package com.to_doapp.ToDoApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String pwd;
    private String updatetodo;

    public Integer getId(){ return id;}
    public void setId(Integer i){id=i;}
    public String getPwd(){return pwd;}
    public String getUpd(){ return updatetodo;}
    public String getDet(){return "["+id+"   "+pwd+"]";}

    public void setPwd(String p){pwd=p;}
    public void setUpd(String u){updatetodo=u;}

}