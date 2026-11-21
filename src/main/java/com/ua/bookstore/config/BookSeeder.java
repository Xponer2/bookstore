package com.ua.bookstore.config;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.repository.BookRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BookSeeder implements ApplicationRunner {

    private final BookRepository repository;

    public BookSeeder(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Book(null, "Кобзар", "Тарас Шевченко",
                new BigDecimal("250.00"), 1840, "/covers/kobzar.jpg",
                "Перша збірка поетичних творів Шевченка.", "Поезія"));

        repository.save(new Book(null, "Лісова пісня", "Леся Українка",
                new BigDecimal("180.00"), 1911, "/covers/lisova-pisnia.jpg",
                "Драма-феєрія про кохання Мавки і Лукаша.", "Драма"));

        repository.save(new Book(null, "Захар Беркут", "Іван Франко",
                new BigDecimal("210.00"), 1883, "/covers/zakhar-berkut.jpg",
                "Історична повість про боротьбу громади Тухлі з монголами.", "Історична проза"));

        repository.save(new Book(null, "Тигролови", "Іван Багряний",
                new BigDecimal("320.00"), 1944, "/covers/tyhrolovy.jpg",
                "Пригодницький роман про втечу з ешелону на Далекому Сході.", "Пригоди"));

        repository.save(new Book(null, "Інтернат", "Сергій Жадан",
                new BigDecimal("350.00"), 2017, "/covers/internat.jpg",
                "Роман про три дні на війні на Донбасі.", "Сучасна проза"));
    }
}