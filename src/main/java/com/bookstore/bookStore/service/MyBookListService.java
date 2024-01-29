package com.bookstore.bookStore.service;

import com.bookstore.bookStore.entity.MyBookList;
import com.bookstore.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository mybook;
    public void saveMyBookList(MyBookList book){
        mybook.save(book);
    }
    public List<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }
    public void deleteById(int id){
        mybook.deleteById(id);
    }
}
