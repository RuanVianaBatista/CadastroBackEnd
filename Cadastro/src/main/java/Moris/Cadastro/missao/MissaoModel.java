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
    private GuerreiroModel guerreiro;
}
