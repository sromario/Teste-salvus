package br.com.salvus.TesteSS.model;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class User implements Serializable {
    public User(Long id ,String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )
    private Long id;
    private String username;
    private String email;
    private String password;



    }
