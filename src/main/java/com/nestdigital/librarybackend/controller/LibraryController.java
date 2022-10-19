package com.nestdigital.librarybackend.controller;

import com.nestdigital.librarybackend.doa.LibraryDoa;
import com.nestdigital.librarybackend.model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDoa dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/addBooks",consumes = "application/json",produces="application/json")
    public String Bookadd(@RequestBody LibraryModel book){
        System.out.println(book.toString());
        dao.save(book);
        return"{status=success}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewBooks")
    public List<LibraryModel> vieBook(){
        return (List<LibraryModel>)
                dao.findAll();
    }


}
