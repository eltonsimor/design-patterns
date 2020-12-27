package brigde_and_adapter;

public class GoogleMapsBrigde implements Mapa {

    @Override
    public String devolerMapa(String endereco) {
        return "Retorna um endereço implementado com a API do GoogleMaps";
    }
}
