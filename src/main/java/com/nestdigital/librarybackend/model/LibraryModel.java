package com.nestdigital.librarybackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class LibraryModel {
    public LibraryModel(int id, String name, String author, String pubyear, String lang) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pubyear = pubyear;
        this.lang = lang;
    }

    public LibraryModel() {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubyear() {
        return pubyear;
    }

    public void setPubyear(String pubyear) {
        this.pubyear = pubyear;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String author;
    private String pubyear;
    private  String lang;
}
