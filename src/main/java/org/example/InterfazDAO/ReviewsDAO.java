package org.example.InterfazDAO;

import org.example.Conexion;
import org.example.Contenido.Reviews;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReviewsDAO implements DAO<Reviews> {

    @Override
    public void insertar(Reviews review) throws SQLException {
            String sql = "INSERT INTO reviews(reviewid, title, artist) VALUES (?, ?, ?)";

            try(Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){

                ps.setInt(1, review.getReviewid());
                ps.setString(2, review.getTitle());
                ps.setString(3, review.getArtist());

                ps.executeUpdate();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }



    @Override
    public List<Reviews> mostrarDatos() throws SQLException {
        ArrayList<Reviews> reviews = new ArrayList<>();

        String sql = "SELECT reviewid, title, artist FROM reviews";

        try(Connection conn = Conexion.getConnection();
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql)){

            while(rs.next()){
                Reviews re = new Reviews();

                re.setReviewid(rs.getInt("reviewid"));
                re.setTitle(rs.getString("title"));
                re.setArtist(rs.getString("artist"));

                reviews.add(re);
            }



        }
        return reviews;    }
}
