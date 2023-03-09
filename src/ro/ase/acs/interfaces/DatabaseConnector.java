package ro.ase.acs.interfaces;

import java.sql.SQLException;

public interface DatabaseConnector {
    void createTable() throws SQLException;

    void insertData() throws SQLException;

    void readData() throws SQLException;

    void closeConnection() throws SQLException;
}
