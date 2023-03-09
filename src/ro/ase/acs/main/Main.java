package ro.ase.acs.main;

import ro.ase.acs.classes.DatabaseConnection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection("jdbc:sqlite:dbConnection.db");
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