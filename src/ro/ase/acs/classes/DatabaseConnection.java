package ro.ase.acs.classes;

import ro.ase.acs.interfaces.*;
import ro.ase.acs.interfaces.Readable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements DatabaseTableCreator, Writable, Readable, Closable{
    private Connection connection;
    private Creator creator;
    private Writer writer;
    private Reader reader;
    private Closer closer;
    public DatabaseConnection(String databaseURL) throws SQLException {
        connection = DriverManager.getConnection(databaseURL);
        connection.setAutoCommit(false);
        creator = new Creator(connection);
        writer = new Writer(connection);
        reader = new Reader(connection);
        closer = new Closer(connection);
    }

    @Override
    public void createTable() throws SQLException {
        creator.createTable();
    }

    @Override
    public void closeConnection() throws SQLException {
        closer.closeConnection();
    }

    @Override
    public void readData() throws SQLException {
        reader.readData();
    }

    @Override
    public void insertData() throws SQLException {
       writer.insertData();
    }

}
