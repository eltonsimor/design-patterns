package factory;

import com.sun.media.sound.RIFFInvalidDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private Connection connection;

    public Connection getConnection(){
        try {
            String banco = System.getenv("tipoBanco");

            if("mysql".equalsIgnoreCase(banco))
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meubanco", "root", "root");
            else
                connection = DriverManager.getConnection("jdbc:postgres://localhost:5432/meubanco", "root", "root");

            return connection;
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
}
