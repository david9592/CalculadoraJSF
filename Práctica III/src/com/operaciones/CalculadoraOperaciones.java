package com.operaciones;

import com.modelo.CalculadoraModelo;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name= "CalculadoraControlador")
@SessionScoped
public class CalculadoraOperaciones {

    private CalculadoraModelo calculadora;

    @PostConstruct
    public void initCalculadora() {
        calculadora= new CalculadoraModelo();
    }

    public CalculadoraModelo getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(CalculadoraModelo calculadora) {
        this.calculadora = calculadora;
    }

//    public void Suma(){
//        calculadora.getResultado()= 0.0;
//
//        calculadora.getResultado()= this.calculadora.getCantidad1()+this.calculadora.getCantidad2();
//    }
//
    String n1= this.calculadora.getCantidad1();
    String n2= this.calculadora.getCantidad2();

    public void sumar(){
        this.calculadora.getresultado= n1+n2;
    }

    private enum Operaciones{
        sumar, restar, multiplicar, dividir
    }

    public void operacion(){

        switch (calculadora){
            case sumar:
                calculadora.getResultado()= this.calculadora.getCantidad1()+this.calculadora.getCantidad2();
                break;

            case restar:
                resultado= cantidad1-cantidad2;
                break;

            case multiplicar:
                resultado= cantidad1*cantidad2;
                break;

            case dividir:
                resultado= cantidad1/cantidad2;
                break;
        }
    }
}
