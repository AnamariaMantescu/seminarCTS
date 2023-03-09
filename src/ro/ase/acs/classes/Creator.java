package ro.ase.acs.classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Creator {
    private Connection connection;
    public Creator(Connection connection){
        this.connection = connection;
    }
    public void createTable() throws SQLException {
        String sqlDrop = "DROP TABLE IF EXISTS employees";
        String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
                + "name TEXT, address TEXT, salary REAL)";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlDrop);
        statement.executeUpdate(sqlCreate);
        statement.close();
    }
}
