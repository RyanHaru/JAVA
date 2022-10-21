/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

/**
 *
 * @author Henry&Nya
 */
public class MatrizSuma {
    
    public void sumaMatriz(int mA[][],int mB[][],int mC[][],int f,int c,int n,int m){
        if(f==n-1 && c==m-1){
            mC[f][c]=mA[f][c]+mB[f][c];
            
        }else{
            if(f<n){
                if(c<m){
                    mC[f][c]=mA[f][c]+mB[f][c];
                    sumaMatriz(mA, mB, mC, f, c+1, n,m);
                }
                c=0;
                sumaMatriz(mA, mB, mC, f+1, c, n,m);
            }
        }
    }
}
