package org.example.InterfazDAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    void insertar(T t) throws SQLException;
    List<T> mostrarDatos() throws SQLException;
}
