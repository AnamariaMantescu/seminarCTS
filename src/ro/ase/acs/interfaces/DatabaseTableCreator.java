package ro.ase.acs.interfaces;

import java.sql.SQLException;

public interface DatabaseTableCreator {
    void createTable() throws SQLException;
}
