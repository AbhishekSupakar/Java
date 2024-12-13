class FirstClass {
    static String SV = "Static variable";
    String NSV = "Non-static variable";

    // Static method
    public static void SM() {
        System.out.println("SV: " + SV);
    }

    // Non-static method
    public void NSM() {
        System.out.println("NSV: " + NSV);
    }

    public static void main(String[] args) {
        System.out.println("First Class");
    }
}

class SecondClass {
    // Static method to call the static method of FirstClass
    public static void SM2() {
        FirstClass.SM();
    }

    // Non-static method to call the non-static method of FirstClass
    public void NSV2() {
        FirstClass firstClass = new FirstClass(); // Create an object to access non-static method
        firstClass.NSM();
    }

    public static void main(String[] args) {
        System.out.println("Second Class");
    }
}

class ThirdClass {
    public static void main(String[] args) {
        // Call static method from SecondClass
        SecondClass.SM2();

        // Call non-static method from SecondClass
        SecondClass secondClass = new SecondClass(); // Create an object to access non-static method
        secondClass.NSV2();
    }
}
