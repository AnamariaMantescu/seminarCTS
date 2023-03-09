package ro.ase.acs.classes;

import java.sql.Connection;
import java.sql.SQLException;

public class Closer {
    private Connection connection;

    public Closer(Connection connection){
        this.connection=connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }
}
