package brigde_and_adapter;

public class Programa {

    public static void main(String[] args) {
        Mapa bridge = new GoogleMapsBrigde();
        Mapa adapter = new MapaLegadoAdapter();

        String retornoDoBridge = bridge.devolerMapa("Seu Endereço");
        String retornoDoAdapter = adapter.devolerMapa("Seu Endereço");

        System.out.println(retornoDoBridge);
        System.out.println(retornoDoAdapter);
    }
}
