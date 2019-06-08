package org.academiadecodigo.bootcamp;


public class Dodge {

    public static void main(String[] args) throws InterruptedException {

        Game g = new Game(5, 8, 500);

        g.init();
        g.start();

    }

}
