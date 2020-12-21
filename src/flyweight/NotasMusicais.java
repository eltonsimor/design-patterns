package flyweight;

import java.util.*;

public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> clazzes;

    static {
        clazzes = Arrays.asList(Do.class, Re.class, Mi.class, Fa.class, Sol.class, La.class, Si.class);
    }

    public Nota pegar(String nome){
        try {

            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().equalsIgnoreCase(nome)) {
                        notas.put(nome, clazz.newInstance());
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e ) {
            throw new RuntimeException(e);
        }
    }
}
