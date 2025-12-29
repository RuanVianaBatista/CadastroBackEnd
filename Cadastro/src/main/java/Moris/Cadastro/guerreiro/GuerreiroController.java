package Moris.Cadastro.guerreiro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GuerreiroController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Primeira Rota";
    }

}
