package com.eis.poo.clases.protegidos.v2;

public class B extends A {
    protected int b1;
    protected int b2;

    public B(int b1, int b2) {
        super(b1,b2);
        this.b1 = b1;
        this.b2 = b2;
    }
    public int calcular(){
        return (b1 + b2) + (super.x + super.y);
    }

    public int getB1() {
        return b1;
    }
    public int getB2() {
        return b2;
    }


}
