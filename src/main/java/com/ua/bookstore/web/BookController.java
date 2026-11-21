package com.ua.bookstore.web;

import com.ua.bookstore.service.BookService;
import com.ua.bookstore.web.dto.BookCardDto;
import com.ua.bookstore.web.dto.BookDetailDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookCardDto> list(@RequestParam(required = false) String genre) {
        return bookService.findAll(genre);
    }

    @GetMapping("/{id}")
    public BookDetailDto getOne(@PathVariable Long id) {
        return bookService.findById(id);
    }
}