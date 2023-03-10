package com.jpaHibernate.JpaDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// this is telling that this class is a model and table name will be same as class name if not defined explicitly
@Table(name = "user_info") // now name of table in db will be user_info
public class User {

    @Id // annotation to tell that this is primary key in my db
    @Column(name = "user_id") // to change column name in db
    int id;

    String name;
    int age;
    int mobNo;

    public User() {
    }

    public User(int id, String name, int age, int mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }
}
