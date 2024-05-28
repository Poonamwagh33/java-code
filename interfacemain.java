interface animal1 {
    public void animalsound();

    public void sleep();
}

class pig implements animal1 {
    public void animalsound() {
        System.out.println("The pig says:wee wee");
    }

    public void sleep() {
        System.out.println("zzz");
    }
}

class interfacemain {
    public static void main(String args[]) {
        pig mypig = new pig();
        mypig.animalsound();
        mypig.sleep();
    }
}