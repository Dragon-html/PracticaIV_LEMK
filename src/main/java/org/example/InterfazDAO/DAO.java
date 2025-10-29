package org.example.InterfazDAO;

import org.example.Contenido.Reviews;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface DAO<T> {

    void insertar(T t) throws SQLException;

    List<T> mostrarDatos() throws SQLException;

    ArrayList<Reviews> RockMetal() throws SQLException;

    ArrayList<Reviews> bestNewMusic() throws SQLException;

    ArrayList<Reviews> discosArtistaMayorMenosNota() throws SQLException;
}
