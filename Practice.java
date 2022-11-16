// Author: Enoch Adelekan
// Task: Class Practice

class Practice {
    public void print() {
        System.out.println("This is a practice exercise.");
    }

    public float equation() {
        // equation: 3 * (2 * y - 5) + 4 * y = 5;

        //when y = 0, the equation yields the constant part of the expression
        int y = 0;
        int constant =  3 * (2 * y - 5) + 4 * y;

        y = 1;
        int yCoefficient = (3 * (2 * y - 5) + 4 * y) - constant;

        /*
        The equation can now be expressed in the form
        value = yCoefficient * solution + constant
        value is 5 in this case
        */

        float solution = (5 - constant)/ yCoefficient;
        return solution;
    }

    public void encap1() {
        System.out.println("This is my name");
    }    
}

class Extension extends Practice {
    public void encap2() {
        super.encap1();
    }
}

class Main {
    public static void main(String[] args) {
        Practice practice = new Practice();
        Extension practice2 = new Extension();

        practice.print();
        System.out.println("y: " + practice.equation());
        practice.encap1();
        practice2.encap2();
    }
}