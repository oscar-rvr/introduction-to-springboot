package grid.example.spring.repositories;

import grid.example.spring.domain.Author;
import grid.example.spring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
