package com.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name= "calculadora")
@SessionScoped
public class CalculadoraModelo {

    private double cantidad1;
    private double cantidad2;
    private double resultado;

    public CalculadoraModelo() {
    }

    public void sumar(){ resultado= cantidad1+cantidad2; }

    public void restar(){
        resultado= cantidad1-cantidad2;
    }

    public void multiplicar(){
        resultado= cantidad1*cantidad2;
    }

    public void dividir(){
        resultado= cantidad1/cantidad2;
    }

//    public void operacion(){
//
//        switch (Operaciones.valueOf()){
//            case Suma:
//                resultado= cantidad1+cantidad2;
//                break;
//
//            case Resta:
//                resultado= cantidad1-cantidad2;
//                break;
//
//            case Multiplicacion:
//                resultado= cantidad1*cantidad2;
//                break;
//
//            case Dividir:
//                resultado= cantidad1/cantidad2;
//                break;
//        }
//    }

    public double getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(double cantidad1) {
        this.cantidad1 = cantidad1;
    }

    public double getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(double cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
