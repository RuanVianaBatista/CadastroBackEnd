package Moris.Cadastro.guerreiro;

import Moris.Cadastro.missao.MissaoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_guerreiro")
public class GuerreiroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne UM GUERREIRO TEM APENAS UMA UNICA MISSÃO.
    @ManyToOne
    @JoinColumn(name = "missao_id") // FORENG KEY
    private MissaoModel missao;

    public GuerreiroModel(String nome, String email, int idade, MissaoModel missao) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.missao = missao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public MissaoModel getMissao() {
        return missao;
    }

    public void setMissao(MissaoModel missao) {
        this.missao = missao;
    }

    @Override
    public String toString() {
        return "GuerreiroModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", missao=" + missao +
                '}';
    }
}
