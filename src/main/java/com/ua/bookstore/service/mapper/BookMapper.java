package com.ua.bookstore.service.mapper;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.web.dto.BookCardDto;
import com.ua.bookstore.web.dto.BookDetailDto;
import com.ua.bookstore.web.dto.BookRequest;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookCardDto toCard(Book book) {
        return new BookCardDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPrice(),
                book.getCoverUrl());
    }

    public BookDetailDto toDetail(Book book) {
        return new BookDetailDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPrice(),
                book.getYear(),
                book.getCoverUrl(),
                book.getDescription(),
                book.getGenre());
    }

    public Book toDomain(BookRequest request) {
        Book book = new Book();
        book.setTitle(request.title());
        book.setAuthor(request.author());
        book.setPrice(request.price());
        book.setYear(request.year());
        book.setGenre(request.genre());
        book.setCoverUrl(request.coverUrl());
        book.setDescription(request.description());
        return book;
    }
}