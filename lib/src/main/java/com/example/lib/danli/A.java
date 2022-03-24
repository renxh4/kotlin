package com.example.lib.danli;

public class A {

    public void setClick(Click click){

    }

    public interface Click{
        void click();
    }


    public static void main(String[] args) {
        new A().setClick(new Click() {
            @Override
            public void click() {

            }
        });
    }
}


