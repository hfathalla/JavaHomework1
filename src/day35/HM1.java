package day35;

public class HM1 {

    //create a class Bank
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it
    public static class Bank {
        public int year;
        public int serial;
        public String name;
        public boolean trustworthiness;

        public Bank() {
            year = 0;
            serial = 0;
            name = "Unknown bank";
        }

        public Bank(boolean t) {
            this(2019, 10, "Bank of America");
            trustworthiness = t;
        }

        public Bank(int y, int num, String name) {
            this.year = y;
            this.name = name;

            serial = num;
        }

        public Bank(int year, int num, String name, boolean t) {
            this.year = year;
            serial = num;
            this.name = name;
            trustworthiness = t;

        }

        public String printOut() {
            String a = "Bank Year:" + year + "\n";
            String b = "Bank Name:" + name + "\n";
            String c = "Serial Number:" + serial + "\n";
            String d = "Trustworthiness:" + trustworthiness;
            return a + b + c + d;
        }
    }
}
 class Task2 {
    public static void main(String[] args) {
       HM1.Bank chase = new HM1.Bank(2010, 1, "Chase");
        System.out.println(chase.printOut());
        System.out.println("------------------------------------");

        HM1.Bank bank = new HM1.Bank();
        bank.trustworthiness = true;
        bank.name = " some name";
        bank.year = 210;
        System.out.println(bank.printOut());
        System.out.println("------------------------------------");

        HM1.Bank trustworthyBank = new HM1.Bank(true);
        System.out.println(trustworthyBank.printOut());
        System.out.println("------------------------------------");

        HM1.Bank td = new HM1.Bank(2005, 101010, "TD", true);
        System.out.println(td.printOut());
    }


}

