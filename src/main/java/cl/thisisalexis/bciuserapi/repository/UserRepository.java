package cl.thisisalexis.bciuserapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.thisisalexis.bciuserapi.dao.UserEntity;

/**
 * This class is used as a Repository or service to persist data related to User entity
 *
 * @author ALexis Bravo
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}