package flyweight;

import org.jfugue.player.Player;

import java.util.List;

import static java.lang.String.format;

public class Piano {

    public void toca(List<Nota> musica) {
        Player player = new Player();

        StringBuilder cifra = new StringBuilder();
        musica.stream().forEach(nota -> {
            cifra.append(format("%s ", nota.simbolo()));
        });
        System.out.println(cifra);

        player.play(cifra.toString());
    }
}
