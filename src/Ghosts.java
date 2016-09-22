/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ghosts {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Player pl = new Player();
        int menu, menuPrincipal, configuracion, reportes, miPerfil;
        String resp;
        
        do{
            System.out.println("\tMENU");
            System.out.println("[1]: Login");
            System.out.println("[2]: Crear Player");
            System.out.println("[3]: Salir");
            System.out.println("Ingrese el numero de opcion\n");
             menu = lea.nextInt();

            switch (menu){
                case 1:
                if(pl.getRegistrado()){
                    pl.registrado1();

                if (pl.getLoggedIn()) {
                    do{
                        System.out.println("\tMENU PRINCIPAL");
                        System.out.println("[1]: Jugar");
                        System.out.println("[2]: Configuracion");
                        System.out.println("[3]: Reportes");
                        System.out.println("[4]: Mi Perfil");
                        System.out.println("[5]: Salir");
                        System.out.println("Ingrese el numero de oopcion");
                        System.out.println("-------------------------------------\n");

                        menuPrincipal = lea.nextInt();

                        switch (menuPrincipal) {
                            case 1:
                                
                            pl.registrado2();
                            if (pl.getLoggedIn2()) {
                                Tablero tablero=new Tablero();
                                tablero.ImprimirTablero();
                                System.out.println("");
                                tablero.ImprimirTablero2();
                                System.out.println("");
                                System.out.println(tablero.buscar(0,1).Bueno);
                                System.out.println(tablero.buscar(2,4).Bueno);


                                if(tablero.mover(0, 4, 2, 4)){
                                    tablero.ImprimirTablero();
                                    System.out.println("-----------------------------------------");
                                    tablero.ImprimirTablero2();
                                }
                            }
                            break;
                            case 2:
                            do{
                                System.out.println("\tCONFIGURACION");
                                System.out.println("[1]: Dificultad");
                                System.out.println("[2]: Modo de Juego");
                                System.out.println("[3]: Regresar al menu Principal");
                                System.out.println("Ingrese el numero de oopcion");
                                System.out.println("-------------------------------------\n");
                                configuracion = lea.nextInt();

                                switch (configuracion) {
                                    case 1 :
                                    System.out.println("dificultad en proceso");
                                    break;
                                    case 2:
                                    System.out.println("modo de juego en proceso");
                                    break;
                                    case 3:
                                    System.out.println("Regreso");
                                    break;
                                    default:
                                    System.out.println("Opcion no valida");
                                    break;
                                }
                            }while(configuracion !=3 );
                            break;
                            case 3:
                            do{
                                System.out.println("\tREPORTES");
                                System.out.println("[1]: Descricion de mis ultimos 10 juegos");
                                System.out.println("[2]: Ranking de Jugadores");
                                System.out.println("[3]: Regresar al menu Principal");
                                System.out.println("Ingrese el numero de oopcion");
                                System.out.println("-------------------------------------\n");
                                reportes = lea.nextInt();

                                switch (reportes) {
                                    case 1 :
                                    System.out.println("DEscripcion en proceso");
                                    break;
                                    case 2:
                                    System.out.println("Ranking en proceso");
                                    break;
                                    case 3:
                                    System.out.println("Regreso");
                                    break;
                                    default:
                                    System.out.println("Opcion no valida");

                                }
                            }while(reportes !=3 );
                            break;
                            case 4:
                            do{
                                System.out.println("\t MI PERFIL");
                                System.out.println("[1]: Ver mis Datos");
                                System.out.println("[2]: Cambiar Password");
                                System.out.println("[3]: Eliminar mi Cuenta");
                                System.out.println("[4]: Regresar al menu Principal");
                                System.out.println("Ingrese el numero de oopcion");
                                System.out.println("-------------------------------------\n");
                                miPerfil = lea.nextInt();

                                switch (miPerfil) {
                                    case 1 :
                                    System.out.println("ver mis Datos en proceso");
                                    break;
                                    case 2:
                                    System.out.println(" Cambiar mi pass en proceso");
                                    break;
                                    case 3:
                                    System.out.println("eliminar cuenta 1 o 2");
                                    int c = lea.nextInt();
                                    if(c==1){
                                        pl.eliminar1();
                                    }else{
                                        pl.eliminar2();
                                    }
                                    break;
                                    case 4:
                                    System.out.println("Regreso");
                                    break;
                                    default:
                                    System.out.println("Opcion no valida");
                                    break;
                                }
                            }while(miPerfil !=4 );
                            break;
                            case 5:
                            pl.getLoggedIn();

                            break;
                            default:
                            System.out.println("\tOpcion no valida");
                            System.out.println("--------------------\n");
                        }
                    }while(menuPrincipal !=5);
                }else
                        System.out.println("usuario invalido");

                }else{
                        System.out.println("\tCREAR USUARIO PRIMERO");
                }
                break;

                case 2:
                 do{	
                    pl.usuario();
                    System.out.println("desea crear otro USUARIO");
                    resp = lea.next() ;
                }while(resp.equalsIgnoreCase("si"));
                break;
                case 3:
                if(menu==3){
                    System.out.println("Salio");
                }
                break;
                default:
                System.out.println("\topcion no valida ");
                break;
                }

        }while(menu !=3);
	}
}

