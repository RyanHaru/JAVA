/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

import java.util.Random;

/**
 *
 * @author Henry&Nya
 */
public class Genera_Num_Ale {
    Random aleatorio = new Random();
    
    
    //para Matriz
    
    public void matrizRandom(int m[][],int fila,int columna){
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                m[i][j]=aleatorio.nextInt(100);
            }
        }
    }
}
