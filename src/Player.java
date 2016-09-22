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
public class Player {
    private String userToCheck, passToCheck, loginToCheck2, passwordToCheck2;
    private String []userArray = new String[10];
    private String []passArray = new String[10];
    private boolean loggedIn,loggedIn2,registrado, found;
    private int cant = 0;
    private String player1="", player2="";
    
    
    public void setRegustrado(boolean r){
        registrado = r;
    }
    public void setLoggedIn(boolean l){
        loggedIn = l;
    }
    public void setLoggedIn2(boolean l2){
        loggedIn2 = l2;
    }
    
    public boolean getRegistrado(){
        return registrado;
    }
    public boolean getLoggedIn(){
        return loggedIn;
    }
    public boolean getLoggedIn2(){
        return loggedIn2;
    }
    
    
    public void us(){
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario");
	userToCheck = lea.next();  
    }
    public void cont(){
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese una contrasena");
        passToCheck = lea.next();
    }
    
    public void usuario(){
        us();
        for(int i=0; i<cant; i++){
           String  currentLogin = userArray[i];
            if (currentLogin.equalsIgnoreCase(userToCheck)){
                    System.out.println("usuario ya registrado");
                    found = true;
            }
        }
        if(!found){
            userArray[cant] = userToCheck;
            cont();
            passArray[cant] = passToCheck;
            cant++;
            registrado = true;
        }
        if(found){
                found=false;
        }
    }

    public void registrado1(){
        us();
        cont();
        for(int i=0; i<cant; i++){
            String currentlogin = userArray[i];
            String currentpass = passArray[i];

            if(currentlogin.equalsIgnoreCase(userToCheck) && passToCheck.equals(currentpass)){
                loggedIn = true;
                player1 = currentlogin;
                break;	
            }
        }
    }
    public void registrado2(){
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String loginToCheck2 = lea.next();
        System.out.println("Ingrese contrasena: ");
        String passwordToCheck2 = lea.next();
        for(int i=0; 1<cant; i++){
            String currentlogin2 = userArray[i];
            String currentpass2 = passArray[i];

            if(currentlogin2.equalsIgnoreCase(loginToCheck2) && passwordToCheck2.equals(currentpass2) && currentlogin2!= player1){
                loggedIn2 = true;
                player2 = currentlogin2;
                break;
            }
        }  
    }
    public boolean eliminar1(){
        registrado1();
        return false;
    }
    public boolean eliminar2(){
        registrado2();
        return false;
    }
}
