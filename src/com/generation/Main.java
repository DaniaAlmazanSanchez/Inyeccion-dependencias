package com.generation;

public class Main {

    public static void main(String[] args) {
	// write your code here
    ServicioPago pagando=new ServicioPago(new ServicioPagando(),new PagoEfectivo());
    pagando.pago();

    }
}
