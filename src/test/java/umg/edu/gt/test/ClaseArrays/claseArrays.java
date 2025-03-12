/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

/**
 *
 * @author Fernando
 */
public class claseArrays {
    @Test
    public void testEncontrarRiquezaMaxima() {
        int[][] cuentas1 = {{1,2,3},{3,2,1}};
        Assertions.assertEquals(6, EjercicioArrays.encontrarRiquezaMaxima(cuentas1));             
        
        int[][] cuentas2 = {{1001,2,3},{3,2,1}};
        Assertions.assertEquals(-3, EjercicioArrays.encontrarRiquezaMaxima(cuentas2));             
    }
    
     @Test
    public void testSumarElementos() {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Assertions.assertEquals(45, EjercicioArrays.sumarElementos(mat1));
        
        int[][] mat2 = {
            {1, 2, 30000},
            {4, 5, 6},
            {7, 8, 9}
        };
        Assertions.assertEquals(-3, EjercicioArrays.sumarElementos(mat2));
    }
}
