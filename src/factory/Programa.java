package factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

    public static void main(String[] args) throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from minha_tabela");
        //... Aqui vai o código de interação do resultado.
    }
}
