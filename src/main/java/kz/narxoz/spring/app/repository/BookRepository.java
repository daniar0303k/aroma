package kz.narxoz.spring.app.repository;

import kz.narxoz.spring.app.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<Book, Long> {
}