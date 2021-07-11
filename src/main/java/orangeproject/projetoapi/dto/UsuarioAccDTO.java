package orangeproject.projetoapi.dto;


import javax.persistence.*;

@Entity(name = "usuario")
@Table(name="usuario", uniqueConstraints = {@UniqueConstraint(columnNames={"cpf", "email"})} )
public class UsuarioAccDTO {

    @Column(nullable = false, length = 30)
    private String nome;

    @Column(nullable = false, length = 25)
    private String email;

    @Id
    private String cpf;

    @Column(nullable = false, length = 25)
    private String dataNasc;


    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getDataNasc() { return dataNasc; }

    public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }

}
