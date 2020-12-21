package memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Estado> estadosSalvos = new ArrayList<>();

    public Estado getEstado(int index) {
        return estadosSalvos.get(index);
    }

    public void adicionar(Estado estado) {
        estadosSalvos.add(estado);
    }

}
