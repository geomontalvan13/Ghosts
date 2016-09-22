/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package TestFiles;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Tablero {
    ArrayList<Fantasma>tablero=new ArrayList<>();
    int contador=0,ranbooleans=0,ranmalos=0,ranbuenos=0;
    boolean ran;
    Random rand= new Random();
    public Tablero(){
        LlenarTablero1(" JU1 ");
        LlenarTablero2(" JU2 ");
        LlenarTablero3(" --- ");
        LlenarTablero4(" --- ");
        
            
            
        }
    
    public void LlenarTablero1(String nom){
       tablero.add(new Fantasma(nom,0,1,Ranboolean()));
       tablero.add(new Fantasma(nom,0,2,Ranboolean()));
       tablero.add(new Fantasma(nom,0,3,Ranboolean()));
       tablero.add(new Fantasma(nom,0,4,Ranboolean()));
       tablero.add(new Fantasma(nom,1,1,Ranboolean()));
       tablero.add(new Fantasma(nom,1,2,Ranboolean()));
       tablero.add(new Fantasma(nom,1,3,Ranboolean()));
       tablero.add(new Fantasma(nom,1,4,Ranboolean()));
       
    }
    
    public void LlenarTablero2(String nom){
        ranbuenos=0;ranmalos=0;
       tablero.add(new Fantasma(nom,4,1,Ranboolean()));
       tablero.add(new Fantasma(nom,4,2,Ranboolean()));
       tablero.add(new Fantasma(nom,4,3,Ranboolean()));
       tablero.add(new Fantasma(nom,4,4,Ranboolean()));
       tablero.add(new Fantasma(nom,5,1,Ranboolean()));
       tablero.add(new Fantasma(nom,5,2,Ranboolean()));
       tablero.add(new Fantasma(nom,5,3,Ranboolean()));
       tablero.add(new Fantasma(nom,5,4,Ranboolean()));
       
    }
    public void LlenarTablero3(String nom){
        tablero.add(new Fantasma(" *** ",0,0));
        tablero.add(new Fantasma(nom,1,0));
        tablero.add(new Fantasma(nom,2,0));
        tablero.add(new Fantasma(nom,3,0));
        tablero.add(new Fantasma(nom,4,0));
        tablero.add(new Fantasma(" *** ",5,0));
        tablero.add(new Fantasma(" *** ",0,5));
        tablero.add(new Fantasma(nom,1,5));
        tablero.add(new Fantasma(nom,2,5));
        tablero.add(new Fantasma(nom,3,5));
        tablero.add(new Fantasma(nom,4,5));
        tablero.add(new Fantasma(" *** ",5,5));   
    }
     public void LlenarTablero4(String nom){
       tablero.add(new Fantasma(nom,2,1));
       tablero.add(new Fantasma(nom,2,2));
       tablero.add(new Fantasma(nom,2,3));
       tablero.add(new Fantasma(nom,2,4));
       tablero.add(new Fantasma(nom,3,1));
       tablero.add(new Fantasma(nom,3,2));
       tablero.add(new Fantasma(nom,3,3));
       tablero.add(new Fantasma(nom,3,4));
       
    }
     public void ImprimirTablero(){
        int x=0;        
         while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==0 && y.fila==x){
                    System.out.print(y.nombre);
                    x++;
                }
            }
         }
          System.out.println("1");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==1 && y.fila==x){
                    System.out.print(y.nombre);
                    x++;
                }
            }
         }
          System.out.println("2");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==2 && y.fila==x){
                    System.out.print(y.nombre);
                    x++;
                }
            }
         }
          System.out.println("3");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==3 && y.fila==x){
                    System.out.print(y.nombre);
                    x++;
                }
            }
         }
          System.out.println("4");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==4 && y.fila==x){
                    System.out.print(y.nombre);
                    x++;
                }
            }
         }
          System.out.println("5");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==5 && y.fila==x){
                    System.out.print(y.nombre);
                    x++;
                }
            }
         } 
          System.out.println("6");
     }
     
    public boolean Ranboolean(){
         ran=rand.nextBoolean();
            if(ran){
                if(ranbuenos<4){
                    ranbuenos++;
                    return ran;
                }else{
                    ranmalos++;
                    return !ran;
                }
            
            }else{
             if(ranmalos<4){
                    ranmalos++;
                    return ran;
             
             }else{
                    ranbuenos++;
                    return !ran;
             }
            }
    }
    
    public boolean mover(int columna1, int fila1,int columna2, int fila2){
    if(columna1<=5 && fila1<=5 && columna2<=5 && fila2<=5){
        if(buscar(columna1,fila1).nombre.equals(" *** "))
            return false;
        if(buscar(columna2,fila2).nombre.equals(" *** "))
            return false;
        if(buscar(columna2,fila2).nombre.equals(" JU1 "))
            return false;
        if(buscar(columna2,fila2).nombre.equals(" JU2 "))
            return false;
        //ya mover la pieza
       buscar(columna2,fila2).nombre=buscar(columna1,fila1).nombre;
       buscar(columna2,fila2).Bueno=buscar(columna1,fila1).Bueno;
        buscar(columna1,fila1).nombre=" --- "; 
        return true;
        
    }
        return false;
    }    
    
    public Fantasma buscar(int columna, int fila){
        for(Fantasma x:tablero){
            if(x.columna==columna && x.fila==fila)
                return x;
        }
        return null;
    }
    
    public void ImprimirTablero2(){
        int x=0;
         while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==0 && y.fila==x){
                    System.out.print(" "+y.Bueno+" ");
                    x++;
                }
            }
         }
          System.out.println("");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==1 && y.fila==x){
                    System.out.print(" "+y.Bueno+" ");
                    x++;
                }
            }
         }
          System.out.println("");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==2 && y.fila==x){
                    System.out.print(" "+y.Bueno+" ");
                    x++;
                }
            }
         }
          System.out.println("");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==3 && y.fila==x){
                    System.out.print(" "+y.Bueno+" ");
                    x++;
                }
            }
         }
          System.out.println("");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==4 && y.fila==x){
                    System.out.print(" "+y.Bueno+" ");
                    x++;
                }
            }
         }
          System.out.println("");
          x=0;
          while(x!=6){
            for(Fantasma y:tablero){
                if(y.columna==5 && y.fila==x){
                    System.out.print(" "+y.Bueno+" ");
                    x++;
                }
            }
         } 
          System.out.println("");
     }
    
    
}
