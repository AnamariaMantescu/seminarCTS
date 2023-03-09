package ro.ase.acs.interfaces;

import java.sql.SQLException;

public interface Writable {
    void insertData() throws SQLException;
}
