package br.com.salvus.TesteSS.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class Employee implements Serializable {


    public Employee(String name, String email, Character sexo, Long telefone, String dataNascimento, Long id){
        this.id = id;
        this.name = name;
        this.email = email;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;



//        this.especialidade = especialidade;
//        this.localidade = localidade;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )
    private Long id;
    private String name;
    private String email;
    private Long telefone;
    private Character sexo;
    private String dataNascimento;
//    //pessoal
//    private String profissão;
//    private Long numeroRegistro;
//    //    profissão
//    private String especialidade;
//    private String localidade;
////    área


}
