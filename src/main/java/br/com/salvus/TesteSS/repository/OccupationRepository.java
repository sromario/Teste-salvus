package br.com.salvus.TesteSS.repository;

import br.com.salvus.TesteSS.model.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface OccupationRepository extends JpaRepository<Occupation, Long> {

    default void deleteAllById(Long id) {
    }
}

