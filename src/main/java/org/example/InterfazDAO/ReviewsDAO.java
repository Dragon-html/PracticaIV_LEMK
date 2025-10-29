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
        return reviews;
    }


    @Override
    public ArrayList<Reviews> RockMetal() throws SQLException {
        ArrayList<Reviews> lista = new ArrayList<>();

        //Prueba de consulta
        String sql = """
        SELECT r.title, r.artist, r.score, r.pub_day, r.pub_month, r.pub_year
        FROM reviews r
        JOIN genres g ON r.reviewid = g.reviewid
        WHERE g.genre = 'Rock' OR g.genre = 'Metal';
        """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Reviews r = new Reviews();
                r.setTitle(rs.getString("title"));
                r.setArtist(rs.getString("artist"));
                r.setScore(rs.getDouble("score"));
                r.setPub_day(rs.getInt("pub_day"));
                r.setPub_month(rs.getInt("pub_month"));
                r.setPub_year(rs.getInt("pub_year"));
                lista.add(r);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return lista;
    }


    @Override
    public ArrayList<Reviews> bestNewMusic() throws SQLException {

        ArrayList<Reviews> lista = new ArrayList<>();

        String sql = """
        SELECT reviewid, title, artist, score, pub_day, pub_month, pub_year, best_new_music
        FROM reviews
        WHERE best_new_music = 1;
    """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Reviews r = new Reviews();

                r.setReviewid(rs.getInt("reviewid"));
                r.setTitle(rs.getString("title"));
                r.setArtist(rs.getString("artist"));
                r.setScore(rs.getDouble("score"));
                r.setPub_day(rs.getInt("pub_day"));
                r.setPub_month(rs.getInt("pub_month"));
                r.setPub_year(rs.getInt("pub_year"));
                r.setBest_new_music(rs.getBoolean("best_new_music"));
                lista.add(r);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return lista;
    }

    @Override
    public ArrayList<Reviews> discosArtistaMayorMenosNota() throws SQLException {

        ArrayList<Reviews> lista = new ArrayList<>();

        String sql = """
        SELECT artist, COUNT(*) AS total_discos, 
               MAX(score) AS max_nota, 
               MIN(score) AS min_nota
        FROM reviews
        GROUP BY artist
        ORDER BY artist;
    """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Reviews r = new Reviews();
                r.setArtist(rs.getString("artist"));
                r.setTotalDiscos(rs.getInt("total_discos"));
                r.setMaxScore(rs.getDouble("max_nota"));
                r.setMinScore(rs.getDouble("min_nota"));
                lista.add(r);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}
