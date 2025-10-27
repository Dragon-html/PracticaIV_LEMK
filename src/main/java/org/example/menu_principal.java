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
            System.out.println("3: ");
            System.out.println("4: ");;
            System.out.println("5:");
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
                        System.out.println("Error al mostrar los datos / " + e.getMessage());
                    }

                    break;

                case 3:
                    break;

                case 4:


                    break;

                case 5:

                    break;





            }
        }while(opcion <= 5);
    }


}
