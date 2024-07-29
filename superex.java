class vehicle {
    int maxspeed = 120;
}

class car extends vehicle {
    int maxspeed = 180;

    void display() {
        System.out.println("maximum speed:" + super.maxspeed);
    }
}

public class superex {
    public static void main(String[] args) {
        car small = new car();
        small.display();
    }
}
