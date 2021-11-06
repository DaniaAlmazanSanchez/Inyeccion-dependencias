package com.generation;


public class ServicioPago {
    PagoEfectivo pagoA;
    PagoTargeta pagoB;

    public void Serviciopago(PagoEfectivo pagoA,PagoTargeta pagoB) {
        this.pagoA=new PagoEfectivo();
        this.pagoB=new PagoTargeta();

        }
    public void pago(){
      pagoA.efectivo();
      pagoB.targeta();
    }

    protected void enviar() {
    }

    public class PagoEfectivo{
        public void efectivo(){
            System.out.println("pago en efectivo");
        }
    }
    public class PagoTargeta{
        public void targeta(){
            System.out.println("pago con targeta");
        }
    }
}
