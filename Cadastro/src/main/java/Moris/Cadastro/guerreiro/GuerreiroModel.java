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
    private List<MissaoModel> missao;
}
