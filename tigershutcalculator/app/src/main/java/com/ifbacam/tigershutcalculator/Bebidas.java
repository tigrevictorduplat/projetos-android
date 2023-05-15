package com.ifbacam.tigershutcalculator;

public enum Bebidas {
    VODKA("Vodka"),
    ICE("Ice"),
    REFRI("Refri"),
    SUCO("Suco"),
    CERVEJA("Cerveja");
     final String titulo;
    Bebidas(String titulo){
        this.titulo = titulo;
    }
}
