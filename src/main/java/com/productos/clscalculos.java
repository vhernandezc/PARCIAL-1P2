/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.productos;

import java.util.Scanner;

/**
 *
 * @author vh367
 */
public class clscalculos {
   //precios unitarios
    private static double pcemento=60; 
    private static double pcal=40;
    private static double ptubo =55;
    private   static double phierro=350;
    
    //peso de cada producto
    private   static double pecemento=50; 
    private  static  double pecal=20;
    private  static  double petubo =10;
    private   static double pehierro=50;
    //gastos generados
    private  static  double seguro ;
    private  static  double impuestos ;
    private   static double comisione ;
    private  static double gastototal;
    //gastos del peso
   
    
      private  static  double valtotal,gastoC,gastoCA,gastoT,gastoH,coefGasto,pesototal;
      private   static double  cemento, cal,tubos,hierro,paso6,paso7,paso8;
      private  static  double gastopesoCE,gastopesoCA,gastopesoTU,gastopesoHI;
      
    
    
     private double NUMERO_UNIDADES;
    private String DESCRIPCIÓN;
    private double VALOR_FACTURA;
    private double GASTO_VALOR;
    private double GASTO_PESO;
    private double COSTOxUNIDAD;
    private double COSTO_TOTAL;

    
      private  double Cemento; 
     
      //PASO 1   //ingreso de datos
       public void llenaInformacion(){
        Scanner obj=new Scanner(System.in);
            
        System.out.println("ingrese cuantas bolsas de cemento quiere");
         setCemento(obj.nextDouble());
          System.out.println("ingrese cuantas bolsas de CAL quiere");
         setCal(obj.nextInt());
          System.out.println("ingrese cuantos tubos PC quiere");
         setTubos(obj.nextInt());
          System.out.println("ingrese cuantos quintales de hierro quiere");
         setHierro(obj.nextInt());
         
         setValtotal((getCemento() * getPcemento()) + (getCal() * getPcal()) + (getTubos() * getPtubo()) + (getHierro() * getPhierro()));
            System.out.println("valtotal = " + getValtotal());
        
           System.out.println("ingrese el gasto por el peso del producto:");
           setPaso6(obj.nextInt());
           
           System.out.println("ingrese gasto de seguro");
           setSeguro(obj.nextInt());
           
           System.out.println("ingrese gasto de impuestos");
           setImpuestos(obj.nextInt());
           
           System.out.println("ingrese gasto de comisiones");
           setComisione(obj.nextInt());
           
           
           //PASO2
           setGastototal(getSeguro()+ getImpuestos()+getComisione());
           System.out.println("obj = " + getGastototal());
      //PASO3
  
        setCoefGasto(getGastototal() / getValtotal());
       System.out.println("el coeficiente de gasto es"+ (getCoefGasto()));
   
   
   //PASO4
   
        setGastoC(getPcemento() * getCoefGasto());
        setGastoCA(getPcal() * getCoefGasto());
        setGastoT(getPtubo() * getCoefGasto());
        setGastoH(getPhierro() + getCoefGasto());
       System.out.println("gasto al valor =" + getGastoC()  );
       System.out.println("gasto al valor = " + getGastoCA());
       System.out.println("gasto al valor = " + getGastoT());
       System.out.println("gasto al valor = " + getGastoH());
   
   //PASO5
   
        setPesototal((getPecemento() * getCemento()) + (getPecal() * getCal()) + (getPetubo() * getTubos()) + (getPehierro() * getHierro()));
       System.out.println("paso4 = " + getPesototal());
   
   //PASO6
  
       System.out.println("gasto generado peso del producto = " + getPaso6());
   
    //PASO7
   
        setPaso7(getPaso6() / getPesototal());
       System.out.println("coeficiente del gasto al peso = " + getPaso7());
   
    //PASO8
  
        setGastopesoCE(getPecemento() * getPaso7());
        setGastopesoCA(getPecal() * getPaso7());
        setGastopesoTU(getPetubo() * getPaso7());
        setGastopesoHI(getPehierro() * getPaso7());
       
       System.out.println("gastopesoCEMENTO = " + getGastopesoCE());
       System.out.println("gastopesoCAL = " + getGastopesoCA());
       System.out.println("gastopesoTUBO = " + getGastopesoTU());
       System.out.println("gastopesoHIERRO = " + getGastopesoHI());
   
       }

    /**
     * @return the pcemento
     */ 
    public static double getPcemento() {
        return pcemento;
    }

    /**
     * @param aPcemento the pcemento to set
     */
    public static void setPcemento(double aPcemento) {
        pcemento = aPcemento;
    }

    /**
     * @return the pcal
     */
    public static double getPcal() {
        return pcal;
    }

    /**
     * @param aPcal the pcal to set
     */
    public static void setPcal(double aPcal) {
        pcal = aPcal;
    }

    /**
     * @return the ptubo
     */
    public static double getPtubo() {
        return ptubo;
    }

    /**
     * @param aPtubo the ptubo to set
     */
    public static void setPtubo(double aPtubo) {
        ptubo = aPtubo;
    }

    /**
     * @return the phierro
     */
    public static double getPhierro() {
        return phierro;
    }

    /**
     * @param aPhierro the phierro to set
     */
    public static void setPhierro(double aPhierro) {
        phierro = aPhierro;
    }

    /**
     * @return the pecemento
     */
    public static double getPecemento() {
        return pecemento;
    }

    /**
     * @param aPecemento the pecemento to set
     */
    public static void setPecemento(double aPecemento) {
        pecemento = aPecemento;
    }

    /**
     * @return the pecal
     */
    public static double getPecal() {
        return pecal;
    }

    /**
     * @param aPecal the pecal to set
     */
    public static void setPecal(double aPecal) {
        pecal = aPecal;
    }

    /**
     * @return the petubo
     */
    public static double getPetubo() {
        return petubo;
    }

    /**
     * @param aPetubo the petubo to set
     */
    public static void setPetubo(double aPetubo) {
        petubo = aPetubo;
    }

    /**
     * @return the pehierro
     */
    public static double getPehierro() {
        return pehierro;
    }

    /**
     * @param aPehierro the pehierro to set
     */
    public static void setPehierro(double aPehierro) {
        pehierro = aPehierro;
    }

    /**
     * @return the seguro
     */
    public static double getSeguro() {
        return seguro;
    }

    /**
     * @param aSeguro the seguro to set
     */
    public static void setSeguro(double aSeguro) {
        seguro = aSeguro;
    }

    /**
     * @return the impuestos
     */
    public static double getImpuestos() {
        return impuestos;
    }

    /**
     * @param aImpuestos the impuestos to set
     */
    public static void setImpuestos(double aImpuestos) {
        impuestos = aImpuestos;
    }

    /**
     * @return the comisione
     */
    public static double getComisione() {
        return comisione;
    }

    /**
     * @param aComisione the comisione to set
     */
    public static void setComisione(double aComisione) {
        comisione = aComisione;
    }

    /**
     * @return the gastototal
     */
    public static double getGastototal() {
        return gastototal;
    }

    /**
     * @param aGastototal the gastototal to set
     */
    public static void setGastototal(int aGastototal) {
        setGastototal(aGastototal);
    }

   

    /**
     * @return the valtotal
     */
    public static double getValtotal() {
        return valtotal;
    }

    /**
     * @param aValtotal the valtotal to set
     */
    public static void setValtotal(double aValtotal) {
        valtotal = aValtotal;
    }

    /**
     * @return the gastoC
     */
    public static double getGastoC() {
        return gastoC;
    }

    /**
     * @param aGastoC the gastoC to set
     */
    public static void setGastoC(double aGastoC) {
        gastoC = aGastoC;
    }

    /**
     * @return the gastoCA
     */
    public static double getGastoCA() {
        return gastoCA;
    }

    /**
     * @param aGastoCA the gastoCA to set
     */
    public static void setGastoCA(double aGastoCA) {
        gastoCA = aGastoCA;
    }

    /**
     * @return the gastoT
     */
    public static double getGastoT() {
        return gastoT;
    }

    /**
     * @param aGastoT the gastoT to set
     */
    public static void setGastoT(double aGastoT) {
        gastoT = aGastoT;
    }

    /**
     * @return the gastoH
     */
    public static double getGastoH() {
        return gastoH;
    }

    /**
     * @param aGastoH the gastoH to set
     */
    public static void setGastoH(double aGastoH) {
        gastoH = aGastoH;
    }

    /**
     * @return the coefGasto
     */
    public static double getCoefGasto() {
        return coefGasto;
    }

    /**
     * @param aCoefGasto the coefGasto to set
     */
    public static void setCoefGasto(double aCoefGasto) {
        coefGasto = aCoefGasto;
    }

    /**
     * @return the pesototal
     */
    public static double getPesototal() {
        return pesototal;
    }

    /**
     * @param aPesototal the pesototal to set
     */
    public static void setPesototal(double aPesototal) {
        pesototal = aPesototal;
    }

    /**
     * @return the cemento
     */
    public static double getCemento() {
        return cemento;
    }

    /**
     * @param aCemento the cemento to set
     */
    public static void setCemento(double aCemento) {
        cemento = aCemento;
    }

    /**
     * @return the cal
     */
    public static double getCal() {
        return cal;
    }

    /**
     * @param aCal the cal to set
     */
    public static void setCal(double aCal) {
        cal = aCal;
    }

    /**
     * @return the tubos
     */
    public static double getTubos() {
        return tubos;
    }

    /**
     * @param aTubos the tubos to set
     */
    public static void setTubos(double aTubos) {
        tubos = aTubos;
    }

    /**
     * @return the hierro
     */
    public static double getHierro() {
        return hierro;
    }

    /**
     * @param aHierro the hierro to set
     */
    public static void setHierro(double aHierro) {
        hierro = aHierro;
    }

    /**
     * @return the paso6
     */
    public static double getPaso6() {
        return paso6;
    }

    /**
     * @param aPaso6 the paso6 to set
     */
    public static void setPaso6(double aPaso6) {
        paso6 = aPaso6;
    }

    /**
     * @return the paso7
     */
    public static double getPaso7() {
        return paso7;
    }

    /**
     * @param aPaso7 the paso7 to set
     */
    public static void setPaso7(double aPaso7) {
        paso7 = aPaso7;
    }

    /**
     * @return the paso8
     */
    public static double getPaso8() {
        return paso8;
    }

    /**
     * @param aPaso8 the paso8 to set
     */
    public static void setPaso8(double aPaso8) {
        paso8 = aPaso8;
    }

    /**
     * @return the gastopesoCE
     */
    public static double getGastopesoCE() {
        return gastopesoCE;
    }

    /**
     * @param aGastopesoCE the gastopesoCE to set
     */
    public static void setGastopesoCE(double aGastopesoCE) {
        gastopesoCE = aGastopesoCE;
    }

    /**
     * @return the gastopesoCA
     */
    public static double getGastopesoCA() {
        return gastopesoCA;
    }

    /**
     * @param aGastopesoCA the gastopesoCA to set
     */
    public static void setGastopesoCA(double aGastopesoCA) {
        gastopesoCA = aGastopesoCA;
    }

    /**
     * @return the gastopesoTU
     */
    public static double getGastopesoTU() {
        return gastopesoTU;
    }

    /**
     * @param aGastopesoTU the gastopesoTU to set
     */
    public static void setGastopesoTU(double aGastopesoTU) {
        gastopesoTU = aGastopesoTU;
    }

    /**
     * @return the gastopesoHI
     */
    public static double getGastopesoHI() {
        return gastopesoHI;
    }

    /**
     * @param aGastopesoHI the gastopesoHI to set
     */
    public static void setGastopesoHI(double aGastopesoHI) {
        gastopesoHI = aGastopesoHI;
    }

  
    /**
     * @return the NUMERO_UNIDADES
     */
    public double getNUMERO_UNIDADES() {
        return NUMERO_UNIDADES;
    }

    /**
     * @param NUMERO_UNIDADES the NUMERO_UNIDADES to set
     */
    public void setNUMERO_UNIDADES(double NUMERO_UNIDADES) {
        this.NUMERO_UNIDADES = NUMERO_UNIDADES;
    }

    /**
     * @return the DESCRIPCIÓN
     */
    public String getDESCRIPCIÓN() {
        return DESCRIPCIÓN;
    }

    /**
     * @param DESCRIPCIÓN the DESCRIPCIÓN to set
     */
    public void setDESCRIPCIÓN(String DESCRIPCIÓN) {
        this.DESCRIPCIÓN = DESCRIPCIÓN;
    }

    /**
     * @return the VALOR_FACTURA
     */
    public double getVALOR_FACTURA() {
        return VALOR_FACTURA;
    }

    /**
     * @param VALOR_FACTURA the VALOR_FACTURA to set
     */
    public void setVALOR_FACTURA(double VALOR_FACTURA) {
        this.VALOR_FACTURA = VALOR_FACTURA;
    }

    /**
     * @return the GASTO_VALOR
     */
    public double getGASTO_VALOR() {
        return GASTO_VALOR;
    }

    /**
     * @param GASTO_VALOR the GASTO_VALOR to set
     */
    public void setGASTO_VALOR(double GASTO_VALOR) {
        this.GASTO_VALOR = GASTO_VALOR;
    }

    /**
     * @return the GASTO_PESO
     */
    public double getGASTO_PESO() {
        return GASTO_PESO;
    }

    /**
     * @param GASTO_PESO the GASTO_PESO to set
     */
    public void setGASTO_PESO(double GASTO_PESO) {
        this.GASTO_PESO = GASTO_PESO;
    }

    /**
     * @return the COSTOxUNIDAD
     */
    public double getCOSTOxUNIDAD() {
        return COSTOxUNIDAD;
    }

    /**
     * @param COSTOxUNIDAD the COSTOxUNIDAD to set
     */
    public void setCOSTOxUNIDAD(double COSTOxUNIDAD) {
        this.COSTOxUNIDAD = COSTOxUNIDAD;
    }

    /**
     * @return the COSTO_TOTAL
     */
    public double getCOSTO_TOTAL() {
        return COSTO_TOTAL;
    }

    /**
     * @param COSTO_TOTAL the COSTO_TOTAL to set
     */
    public void setCOSTO_TOTAL(double COSTO_TOTAL) {
        this.COSTO_TOTAL = COSTO_TOTAL;
    }

    /**
     * @param aGastototal the gastototal to set
     */
    public static void setGastototal(double aGastototal) {
        gastototal = aGastototal;
    }
}
  
    

