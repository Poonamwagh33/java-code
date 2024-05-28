class person {
    public void speak()

    {
        System.out.println("A person is speaking");
    }
}

class employee extends person {
    public void speak()

    {
        System.out.println("A employee is speaking");
    }
}

class son extends person {
    public void speak()

    {
        System.out.println("A son is speaking");
    }
}

class inheritance {
    public static void main(String args[]) {
        person myperson = new person();
        person myemployee = new employee();
        person myson = new son();

        myperson.speak();
        myemployee.speak();
        myson.speak();
    }
}