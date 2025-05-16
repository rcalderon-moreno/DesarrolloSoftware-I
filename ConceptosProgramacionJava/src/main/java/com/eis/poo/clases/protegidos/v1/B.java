package com.eis.poo.clases.protegidos.v1;

public class B extends A {
    private int b1;
    private int b2;

    public B(int b1, int b2) {
        super(b1,b2);
        this.b1 = b1;
        this.b2 = b2;
    }
    public int calcular(){
        return (b1 + b2) + (super.getX() + super.getY());
    }

    public int getB1() {
        return b1;
    }
    public int getB2() {
        return b2;
    }


}
