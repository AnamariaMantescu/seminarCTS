package ro.ase.acs.main;

import ro.ase.acs.classes.DatabaseConnection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection dbConnection = null;
        try {
            dbConnection = new DatabaseConnection("jdbc:sqlite:dbConnection.db");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            dbConnection.createTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            dbConnection.insertData();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            dbConnection.readData();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            dbConnection.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}