/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial1p2;

import com.productos.clscalculos;

import com.productos.clscomisiones;
import java.util.Set;
import com.productos.clscomisiones;






/**
 *
 * @author vh367
 */

/* clsvendedor monica=new clsvendedor();
       monica.llenainformacion();
        System.out.println("nombre="+monica.getNombre());
        System.out.println("marzo = " + monica.getMarzo());
        */
public class clsprincipal {
    public static void main(String[] args) {
       
     clscomisiones co = new clscomisiones(5);
        clscalculos vendedor = new clscalculos();
        clscalculos x = new clscalculos();
        x.llenaInformacion();
      
        vendedor.llenaInformacion();
       
        vendedor.setNUMERO_UNIDADES(x.getCemento());        
        vendedor.setVALOR_FACTURA(x.getPcemento());
        vendedor.setGASTO_VALOR(Math.round(x.getPcemento()*x.getCoefGasto()));
        vendedor.setGASTO_PESO( Math.round( x.getPaso7()*x.getPecemento()));
        int g=(int)(Math.round(x.getPcemento()+(x.getPcemento()*x.getCoefGasto())+(x.getPaso7()*x.getPecemento())));
        vendedor.setCOSTOxUNIDAD(g);
        int l=(int)(x.getCemento()*g);
        vendedor.setCOSTO_TOTAL(l);
        vendedor.setDESCRIPCIÓN("CEMENTO    ");
        
        co.AgregarVendedorMatriz(vendedor);
        
        vendedor.setNUMERO_UNIDADES (x.getCal());        
        vendedor.setVALOR_FACTURA(x.getPcal());
        vendedor.setGASTO_VALOR( Math.round( x.getPcal()*x.getCoefGasto()));
        vendedor.setGASTO_PESO( Math.round(x.getPaso7()*x.getPecal()));
        int f=(int)( Math.round(x.getPcal()+(x.getPcal()*x.getCoefGasto())+(x.getPaso7()*x.getPecal())));
        vendedor.setCOSTOxUNIDAD(f);
        int k=(int)(x.getCal()*f);
        vendedor.setCOSTO_TOTAL(k);
        
        vendedor.setDESCRIPCIÓN("BOLSAS CAL   ");
        co.AgregarVendedorMatriz(vendedor);
        
        vendedor.setNUMERO_UNIDADES (x.getTubos());
        vendedor.setVALOR_FACTURA(x.getPtubo());
        vendedor.setGASTO_VALOR(Math.round(x.getPtubo()*x.getCoefGasto()));
        vendedor.setGASTO_PESO(Math.round(x.getPaso7()*x.getPetubo()));
        int d=(int)(Math.round(x.getPtubo()+(x.getPtubo()*x.getCoefGasto())+(x.getPaso7()*x.getPetubo())));
        vendedor.setCOSTOxUNIDAD(d);
        int j =(int)(x.getTubos()*d);
        
        
        vendedor.setCOSTO_TOTAL(j);
        
        vendedor.setDESCRIPCIÓN("TUBOS PC   ");
        co.AgregarVendedorMatriz(vendedor);
        
        vendedor.setNUMERO_UNIDADES(x.getHierro());
        vendedor.setVALOR_FACTURA(x.getPhierro());
        vendedor.setGASTO_VALOR(Math.round(x.getPhierro()*x.getCoefGasto()));
        vendedor.setGASTO_PESO(Math.round(x.getPaso7()*x.getPehierro()));
         int s=(int) (Math.round(x.getPhierro()+(x.getPhierro()*x.getCoefGasto())+(x.getPaso7()*x.getPehierro())));
         vendedor.setCOSTOxUNIDAD(s);
        int h =(int) (x.getHierro()*s);
        vendedor.setCOSTO_TOTAL(h);
        vendedor.setDESCRIPCIÓN("HIERRO   ");
        co.AgregarVendedorMatriz(vendedor);
        
        
        vendedor.setNUMERO_UNIDADES(00);
        vendedor.setVALOR_FACTURA(00);
        vendedor.setGASTO_VALOR(00);
        vendedor.setGASTO_PESO(00);
        vendedor.setCOSTOxUNIDAD(00);
         int ñ=l+k+j+h;
        vendedor.setCOSTO_TOTAL(ñ);
        
        vendedor.setDESCRIPCIÓN("gran total");
        
        co.AgregarVendedorMatriz(vendedor);
        co.imprimirDecorado();
      
    
    }
     
    }
        

       
    
    
   
    
