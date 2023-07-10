public class Tank {
    private int x = 0;
    private int y = 0;

    private int fuel = 100;
    private char orient = 's';

    final String model = "T34";

    private static int tankCount = 1;

    private int id = tankCount;


    void goForward(int i) {
        i = burn(i);

        go(i);

    }


    public int burn(int a) {
        if (a > 0) {
            if (fuel <= a) {
                a = fuel;
                fuel -= a;
                System.out.println("fuel is out");
            }
            if (fuel > a) {
                fuel -= a;
            }

            return a;
        } else {
            a = -a;
            if (fuel <= a) {
                a = fuel;
                fuel -= a;
                System.out.println("fuel is out");
            }
            if (fuel > a) {
                fuel -= a;
            }
            a = -a;

            return a;

        }


    }


    void go(int fuel2) {


        if (orient == 's') {
            x += fuel2;
        }
        if (orient == 'b') {
            x -= fuel2;
        }
        if (orient == 'r') {
            y += fuel2;
        }
        if (orient == 'l') {
            y -= fuel2;
        }


    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getFuel() {
        return fuel;
    }


    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public char getOrient() {
        return orient;
    }

    public void setOrient(char orient) {
        this.orient = orient;
    }

    public static int getTankCount() {
        return tankCount;

    }


    void goBackward(int i) {

        i = burn(i);

        go(-i);


    }

    void printPosition() {

        System.out.println("The " + this.model + "-" + id + " is at " + x + ", " + y + " now.");
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


    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);

    }


    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        tankCount++;


    }
}


