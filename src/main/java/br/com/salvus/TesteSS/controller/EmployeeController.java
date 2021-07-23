package br.com.salvus.TesteSS.controller;

import br.com.salvus.TesteSS.model.Employee;
import br.com.salvus.TesteSS.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
    EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/employee")
    public List<Employee>list() {
        return repository.findAll();


    }
    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        return repository.save(employee);
    }
    @GetMapping("/employee/{id}")
    public Object detalhe(@PathVariable Long id){
        return  repository.findAllById(id);
    }
    @DeleteMapping("/employee/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
    public static void main(String[] args) {
        System.out.println("DADOS PESSOAIS");}

        @PutMapping("/employee/{id}")
        public Employee update(@RequestBody Employee employee)  {
            return repository.save(employee);

        }


}
















