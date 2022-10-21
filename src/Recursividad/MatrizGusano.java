/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

/**
 *
 * @author Henry&Nya
 */
public class MatrizGusano {

    public void matrizGusanito(int m[][], int f, int c, int x, int y, int aux) {
        if (f == x - 1 && c == y - 1) {
            m[f][c] = aux;
        } else {
            if (f < x) {
                if (c < y || c>=0) {
                    if (f % 2 == 0) {
                        m[f][c] = aux;
                        matrizGusanito(m, f, c + 1, x, y, aux + 1);
                    } else {
                        c = y - 1;
                        m[f][c] = aux;
                        matrizGusanito(m, f, c - 1, x, y, aux + 1);
                    }
                }
                c = 0;
                matrizGusanito(m, f + 1, c, x, y, aux);
            }
        }
    }
}
