/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author Henry&Nya
 */
public class Parcial_2 {
    
    
    public int facPrimos(int n,int s){
        if(n>0){
            if(n%10==3 || n%10==5 || n%10==7){
                return facPrimos(n/10, facRec(n%10)+s);
            }else{
                return facPrimos(n/10, s);
            }
        }else{
            return s;
        }
    }
    
    public int facRec(int n){
        if(n==1){
            return 1;
        }else{
            return n*facRec(n-1);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void matrizFibonnaci(int m[][],int f ,int c,int n,int dig,int aux){
        if(f==n-1 && c==n-1){
            m[f][c]=dig;
        }else{
            if(f<n){
                if(c<n){
                    m[f][c]=dig;
                    matrizFibonnaci(m, f, c+1, n, fibo(aux),aux+1);
                }else
                {
                    c=0;
                    matrizFibonnaci(m, f+1, c, n, dig, aux);
                }
            }
        }
    }
    
    public int fibo(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    
}
