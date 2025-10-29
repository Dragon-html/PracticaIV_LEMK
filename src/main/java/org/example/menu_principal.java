package org.example;


import org.example.Contenido.Reviews;
import org.example.InterfazDAO.ReviewsDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class menu_principal {
    public static void menu() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        //DAO dao = new DAO();
        ReviewsDAO dao = new ReviewsDAO();



        do{
            System.out.println("1: Agregar");
            System.out.println("2: Mostrar");
            System.out.println("3: Sacar rock o metal");
            System.out.println("4: Best new music");;
            System.out.println("5: Discos, notas máximas y mínimas");
            System.out.println("6: Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    Reviews review = new Reviews();

                System.out.print("Introduce el ID de la review: ");
                review.setReviewid(scanner.nextInt());

                System.out.print("Introduce el título del disco: ");
                review.setTitle(scanner.nextLine());

                System.out.print("Introduce el nombre del artista: ");
                review.setArtist(scanner.nextLine());

                try {
                    dao.insertar(review);
                    System.out.println("Review agregada");
                } catch (SQLException e) {
                    System.out.println("Ha habido un problema al agregar la review / " + e.getMessage());
                }

            break;

            case 2:

                    try {
                        ArrayList<Reviews> lista = (ArrayList<Reviews>) dao.mostrarDatos();

                        if (lista.isEmpty()) {
                            System.out.println("No hay reviews en la base de datos.");
                        } else {
                            System.out.println("\nLISTA");
                            for (Reviews r : lista) {
                                System.out.println(r);
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al obtener los datos");
                    }

                    break;

                case 3:

                    try{
                        ArrayList<Reviews> lista = dao.RockMetal();

                        if(lista.isEmpty()){
                            System.out.println("No hay discos de rock ni de metal");

                        }else{
                            System.out.println("\n Discos Rock y Metal");
                            for(Reviews r : lista){
                                System.out.println("Título: " + r.getTitle() + " | Artista: " + r.getArtist() + " | Nota: " + r.getScore() + " | Fecha: " + r.getPub_day() + "/" + r.getPub_month() + "/" + r.getPub_year());                            }
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 4:

                    try {
                        ArrayList<Reviews> lista = dao.bestNewMusic();

                        if (lista.isEmpty()) {
                            System.out.println("No hay artistas con 'Best New Music'.");
                        } else {
                            System.out.println("\nArtistas con 'Best New Music':");
                            for (Reviews r : lista) {
                                System.out.println("Título: " + r.getTitle() + " / Artista: " + r.getArtist() + " / Nota: " + r.getScore() + " | Fecha: " + r.getPub_day() + "/" + r.getPub_month() + "/" + r.getPub_year());
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al obtener los datos");
                    }

                    break;

                case 5:

                    try {

                        ArrayList<Reviews> lista = dao.discosArtistaMayorMenosNota();

                        if (lista.isEmpty()) {
                            System.out.println("No hay información disponible de artistas.");

                        }else {

                            System.out.println("\nResumen de discos por artista:");
                            for (Reviews r : lista) {
                                System.out.println("Artista: " + r.getArtist() + " | Total discos: " + r.getTotalDiscos() + " | Nota máxima: " + r.getMaxScore() + " | Nota mínima: " + r.getMinScore());
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("Ha ocurrido un error al obtener los datos");
                    }

                    break;





            }
        }while(opcion <= 5);
    }


}
