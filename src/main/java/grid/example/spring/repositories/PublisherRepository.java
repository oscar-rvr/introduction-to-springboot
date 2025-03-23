package grid.example.spring.repositories;

import grid.example.spring.domain.Book;
import grid.example.spring.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
