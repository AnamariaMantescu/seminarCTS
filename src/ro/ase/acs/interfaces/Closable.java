package ro.ase.acs.interfaces;

import java.sql.SQLException;

public interface Closable {
    void closeConnection() throws SQLException;
}
