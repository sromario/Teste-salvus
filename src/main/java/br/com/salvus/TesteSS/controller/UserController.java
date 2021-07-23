package br.com.salvus.TesteSS.controller;
import br.com.salvus.TesteSS.model.User;
import br.com.salvus.TesteSS.repository.UseRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    UseRepository repository;

    public UserController(UseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/user")
    public List<User> list() {
        return repository.findAll();
    }
    @GetMapping("/user/{id}")
    public Object detalhe(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping ("/user")
    public User save(@RequestBody User user){
        return repository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
    @PutMapping("/user/{id}")
    public User update(@RequestBody User user)  {
        return repository.save(user);




}
}








