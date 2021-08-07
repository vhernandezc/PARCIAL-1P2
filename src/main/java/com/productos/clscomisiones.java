/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.productos;

/**
 *
 * @author vh367
 */

public class clscomisiones {
    private String[][]comisiones;
    private static final int NUMERO_UNIDADES =0;
    private static final int DESCRIPCIÓN =1;
    private static final int VALOR_FACTURA =2;
    private static final int GASTO_VALOR =3;
    private static final int GASTO_PESO =4;
    private static final int COSTOxUNIDAD =5;
    private static final int COSTO_TOTAL =6;
    private int filaActual = 0;
    
    private final int MAX_FILAS = 5; 
    private final int MAX_COLUMNAS = 7; 
    private int totalFilas=0;
    
    public clscomisiones(int filas){
        
      if (filas > MAX_FILAS){
       throw (new IllegalArgumentException());
      }else{
          totalFilas = filas;
          comisiones = new String[totalFilas][MAX_COLUMNAS];
      }  
        
        
    }
   
    public String AgregarVendedorMatriz(clscalculos vende){
       
        if (filaActual >= MAX_FILAS){
            return "Ya llegaste al final";
        }else{
            comisiones[filaActual][NUMERO_UNIDADES]=vende.getNUMERO_UNIDADES()+"";
            comisiones[filaActual][DESCRIPCIÓN]=vende.getDESCRIPCIÓN();
            comisiones[filaActual][VALOR_FACTURA]=vende.getVALOR_FACTURA()+"";
            comisiones[filaActual][GASTO_VALOR]=vende.getGASTO_VALOR()+"";
            comisiones[filaActual][GASTO_PESO]=vende.getGASTO_PESO()+"";
            comisiones[filaActual][COSTOxUNIDAD]=vende.getCOSTOxUNIDAD()+"";
            comisiones[filaActual][COSTO_TOTAL]=vende.getCOSTO_TOTAL()+"";
            filaActual = filaActual+1;
        }
        return"ok";
    }
    
    public  void imprimirDecorado(){
       
       for (int x = 0; x < comisiones.length; x++) {
            System.out.print("|");
            for (int y = 0; y < comisiones[x].length; y++) {
                System.out.print(comisiones[x] [y]);
                if (y != comisiones[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
      
        }
        
 
  }
    
        
    
    
    
   
 


     


