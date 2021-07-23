package br.com.salvus.TesteSS.repository;
import br.com.salvus.TesteSS.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

   default Employee findAll(Employee employee) {
      return null;
   }

   default Employee findAllById(Long id) {
      return null;
   }
}
