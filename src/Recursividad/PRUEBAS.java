/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

/**
 *
 * @author Henry&Nya
 */
public class PRUEBAS {
    
    public int sumaRec(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumaRec(n-1);
        }
    }
    
    public int facRec(int n){
        if(n==1){
            return 1;
        }else{
            return n*facRec(n-1);
        }
    }
    
    public int sumaPar(int n,int s){
        if(n==0){
            return s;
        }else{
            if((n%10)%2==0){
                return sumaPar(n/10,s+n%10);
            }else{
                return sumaPar(n/10,s);
            }
        }
    }
    
    public int inverNum(int n,int inv){
        if(n>0){
            return inverNum(n/10, inv*10+n%10);
        }else{
            return  inv;
        }
    }
    
    public String numPerfecto(int n,int s,int i){
        if(i<n){
            if(n%i==0){
                return numPerfecto(n, s+i,i+1);
            }else{
                return numPerfecto(n, s, i+1);
            }
        }else{
            if(n==s){
                return "El numero "+n+" es perfecto";
            }else{
                return "El numero "+n+" no es perfecto";
            }
        }
    }
    
    public String capicua(int n,int inv,int aux){
        if(n>0){
            return capicua(n/10, inv*10+n%10,aux);
        }else{
            if(inv == aux){
                return "El numero "+inv+" es capicua";
            }else{
                return "El numero "+inv+" no es capicua";
            }
        }
    }
    
    public int eliminaCeros(int n,int s,int p){
        if(n>0){
            if(n%10!=0){
                return eliminaCeros(n/10, s+(n%10*p), p*10);
            }else{
                return eliminaCeros(n/10, s, p);
            }
        }else{
            return s;
        }
    }
}
