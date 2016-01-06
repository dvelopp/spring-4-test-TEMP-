package spring4Template.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring4Template.domain.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByName(String name);

}
