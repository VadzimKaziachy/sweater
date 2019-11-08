package demo.spring.example.repos;

import demo.spring.example.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long>
{
    List<Message> findByTag(String tag);
}