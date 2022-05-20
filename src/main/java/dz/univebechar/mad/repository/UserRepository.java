package dz.univebechar.mad.repository;

import dz.univebechar.mad.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
