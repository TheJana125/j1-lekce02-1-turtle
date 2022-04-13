package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        for (int i = 0; i < 4; i++) {
            zofka.move(150);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        for (int i = 0; i < 2; i++) {
            zofka.turnRight(60);
            zofka.move(90);
        }

        zofka.penUp();
        zofka.turnRight(60);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();

        for (int i = 0; i < 3; i++) {
            zofka.move(150);
            zofka.turnRight(90);
        }
        zofka.move(150);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(60);
            zofka.move(90);
        }




    }

}
