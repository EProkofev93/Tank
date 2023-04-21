public class Tank {
    int x = 0;
    int y = 0;

    int fuel = 100;
    char orient = 's';


    void goForward(int i) {

        if (orient == 's') {
            x += i;
        }
        if (orient == 'b') {
            x -= i;
        }
        if (orient == 'r') {
            y += i;
        }
        if (orient == 'l') {
            y -= i;
        }
        burn(i);


    }

    void goBackward(int i) {

        goForward(-i);
        burn(i);
        burn(i);

    }

    void printPosition() {

        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    void turnRight() {

        if (orient == 's') {
            orient = 'r';
            return;
        }
        if (orient == 'r') {
            orient = 'b';
            return;
        }
        if (orient == 'b') {
            orient = 'l';
            return;
        }
        if (orient == 'l') {
            orient = 's';
            return;
        }


    }

    void turnLeft() {

        if (orient == 's') {
            orient = 'l';
            return;
        }
        if (orient == 'l') {
            orient = 'b';
            return;
        }
        if (orient == 'b') {
            orient = 'r';
            return;
        }
        if (orient == 'r') {
            orient = 's';
            return;
        }
    }

    void burn(int i) {

        fuel -= i;

        if (fuel <= 0) {
            System.out.println("Fuel is out");
        }

    }
}
