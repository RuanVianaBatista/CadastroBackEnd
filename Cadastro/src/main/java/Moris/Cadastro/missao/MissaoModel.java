package Moris.Cadastro.missao;

import Moris.Cadastro.guerreiro.GuerreiroModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private DificuldadeEnum dificuldade;

    // @OneToMany UMA MISSÃO PODE TER VARIOS GUERREIROS
    @OneToMany(mappedBy = "missao")
    private GuerreiroModel guerreiro;

    public MissaoModel(String nome, DificuldadeEnum dificuldade, GuerreiroModel guerreiro) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.guerreiro = guerreiro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DificuldadeEnum getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(DificuldadeEnum dificuldade) {
        this.dificuldade = dificuldade;
    }

    public GuerreiroModel getGuerreiro() {
        return guerreiro;
    }

    public void setGuerreiro(GuerreiroModel guerreiro) {
        this.guerreiro = guerreiro;
    }

    @Override
    public String toString() {
        return "MissaoModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dificuldade=" + dificuldade +
                ", guerreiro=" + guerreiro +
                '}';
    }
}


