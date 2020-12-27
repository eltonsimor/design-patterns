package command;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {

    private List<Comando> comandos;

    public FilaDeTrabalho() {
        this.comandos = new ArrayList<>();
    }

    public void adicionar(Comando comando) {
        this.comandos.add(comando);
    }

    public void processar() {
        comandos.forEach(Comando::execute);
    }
}
