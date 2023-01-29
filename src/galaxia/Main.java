
package galaxia;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Main {
    
    

    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        //Objetos de Galaxia
        Galaxia galaxia;
        Galaxia galaxia1;
        
        int x,y;
        
        
        System.out.print("Ingrese la posicion x: ");
        x = entrada.nextInt();
        System.out.print("Ingrese la posicion y: ");
        y = entrada.nextInt();
        
        System.out.println("");
        galaxia = new Galaxia(x, y);
        
        
        System.out.print("Ingrese la posicion final x: ");
        x = entrada.nextInt();
        System.out.print("Ingrese la posicion final y: ");
        y = entrada.nextInt();
       
        galaxia1 = new Galaxia(x, y);
        
        //Cuantos pasos se movio en el eje x o y
        int pasosx=0;
        int pasosy = 0;
        
        //Limites del arreglo bidimensional
        int mayorx=0,mayory=0;
        double recursos=0;
        
        //Para el eje x
        
        if(galaxia1.getX() > galaxia.getX() && galaxia1.getY() > galaxia.getY()){
            //primer caso : derecha arriba
            //EN fase de prueba
            pasosx = galaxia1.getX() - galaxia.getX();
            pasosy = galaxia1.getY() - galaxia.getY();
            
            recursos = ((pasosx *66000.)+(pasosy*66000.));
            mayorx = galaxia1.getX();
            mayory = galaxia1.getY();
            
        }
        else if(galaxia1.getX() > galaxia.getX() && galaxia1.getY() < galaxia.getY()){
            //segundo caso : derecha abajo
            //EN fase de prueba
            pasosx = galaxia1.getX() - galaxia.getX();
            pasosy = galaxia.getY() - galaxia1.getY();
            
            
            recursos = (pasosx *66000.) + (pasosy * 66000.);
            mayorx = galaxia1.getX();
            mayory = galaxia.getY();
            
        }
        else if(galaxia1.getX() < galaxia.getX() && galaxia1.getY() > galaxia.getY()){
            //tercer caso : izquierda arriba
            //EN fase de prueba
            //540.000 diferencia del fallo aproximadamente
            pasosx = galaxia.getX() - galaxia1.getX();
            pasosy = galaxia1.getY() - galaxia.getY();
            
            
            recursos = ((pasosx * 66000.) + (pasosy * 66000.));
            mayorx = galaxia.getX();
            mayory = galaxia1.getY();
            
        }
        else if(galaxia1.getX() < galaxia.getX() && galaxia1.getY() < galaxia.getY()){
            //cuarto caso : izquierda abajo
            //EN fase de prueba
            pasosx = galaxia.getX() - galaxia1.getX();
            pasosy = galaxia.getY() - galaxia1.getY();
            
            
            recursos = ((pasosx * 66000.) + (pasosy * 66000.));
            mayorx = galaxia.getX();
            mayory = galaxia.getY();
        }
        else if(galaxia1.getX() > galaxia.getX()){
            //Hacia la derecha
            pasosx = galaxia1.getX() - galaxia.getX();
            
            recursos =  (pasosx * 66000.);
            mayorx =  galaxia1.getX();
            mayory = galaxia1.getY();
            
        }
        else if(galaxia1.getX() < galaxia.getX()){
            //Hacia la izquierda
            pasosx = galaxia.getX() - galaxia1.getX();
            
            recursos = (pasosx * 66000.);
            mayorx = galaxia.getX();
            mayory = galaxia.getY();
        }
        else if(galaxia1.getY() > galaxia.getY()){
            //Hacia arriba
            pasosy = galaxia1.getY() - galaxia.getY();
            
            recursos = (pasosy * 66000.);
            mayory = galaxia1.getY();
            mayorx = galaxia1.getX();
        }
        else if(galaxia1.getY() < galaxia.getY()){
            //Hacia abajo
            pasosy = galaxia.getY() - galaxia1.getY();
            
            recursos = (pasosy * 66000.);
            mayory = galaxia.getY();
            mayorx = galaxia.getX();
            
        }
        else{
            
            mayorx = galaxia.getX();
            mayory = galaxia.getY();
        }
        
        
        System.out.println("");
        System.out.println("Recursos necesarios para colonizar esta galaxia es de: "+ recursos);
        System.out.println("");
        
        //Hasta el momento funciona solo con un movimiento de los ejes,
        
        
        /*
        x = 1, y = 0 Galaxias los ejes de origen
        */
        
        
    }
    
    
    
}
