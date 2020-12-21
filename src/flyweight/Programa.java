package flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        NotasMusicais notas = new NotasMusicais();
        List<Nota> musica = Arrays.asList(
                notas.pegar("do"),
                notas.pegar("re"),
                notas.pegar("mi"),
                notas.pegar("fa"),
                notas.pegar("fa"),
                notas.pegar("fa"),
                notas.pegar("do"),
                notas.pegar("re"),
                notas.pegar("do"),
                notas.pegar("re"),
                notas.pegar("re"),
                notas.pegar("re"),
                notas.pegar("sol"),
                notas.pegar("fa"),
                notas.pegar("mi"),
                notas.pegar("mi"),
                notas.pegar("mi"),
                notas.pegar("do"),
                notas.pegar("re"),
                notas.pegar("mi"),
                notas.pegar("fa"),
                notas.pegar("fa"),
                notas.pegar("fa"));

        Piano piano = new Piano();
        piano.toca(musica);
    }
}
