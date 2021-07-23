package br.com.salvus.TesteSS.repository;
import br.com.salvus.TesteSS.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository @EnableJpaRepositories
public interface UseRepository extends JpaRepository<User, Long> {
    default User findAllById(Long id) {
        return null;
    }

    default void deleteAllById(Long id) {

    }



    }








