package day41;

public class Task1 {

    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X
//    {
//        //Class X Members
//    }
//
//    class Y
//    {
//        //Class Y Members
//    }
//
//    class Z extends X, Y
//    {
//        //Class Z Members
//    }
//can not extends 2 class
    //*********************************************************************************************
   // What will be the output of the following Java program?
//    class A
//    {
//        int i = 10;
//    }
//
//    class B extends A
//    {
//        int i = 20;
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            A a = new B();
//
//            System.out.println(a.i);
//        }
//    }
   // it will print 10 because it extends from A  AND  IT SHOULD A a = new A();
    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        {
//            System.out.println(1);
//        }
//    }
//
//    class B extends A
//    {
//        {
//            System.out.println(2);
//        }
//    }
//
//    class C extends B
//    {
//        {
//            System.out.println(3);
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
//    IT WILL print 1,2,3 because C extends B, and B extends A
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        String s = "Class A";
//    }
//
//    class B extends A
//    {
//        String s = "Class B";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    class C extends B
//    {
//        String s = "Class C";
//
//        {
//            System.out.println(super.s);
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//
//            System.out.println(c.s);
//        }
//    }
    // it will print class A, class B , and Class c , all of them( super .s)
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        static
//        {
//            System.out.println("THIRD");
//        }
//    }
//
//    class B extends A
//    {
//        static
//        {
//            System.out.println("SECOND");
//        }
//    }
//
//    class C extends B
//    {
//        static
//        {
//            System.out.println("FIRST");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
    // will print "THIRD" ,"SECOND" ,"FIRST"
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class A
//    {
//        public A()
//        {
//            System.out.println("Class A Constructor");
//        }
//    }
//
//    class B extends A
//    {
//        public B()
//        {
//            System.out.println("Class B Constructor");
//        }
//    }
//
//    class C extends B
//    {
//        public C()
//        {
//            System.out.println("Class C Constructor");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            C c = new C();
//        }
//    }
// Will Print "Class A Constructor" , "Class B Constractor" , "Class C Constractor"
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class X");
//        }
//    }
//
//    class Y extends X
//    {
//        static void staticMethod()
//        {
//            System.out.println("Class Y");
//        }
//    }
//
//    public class MainClass
//    {
//        public static void main(String[] args)
//        {
//            Y.staticMethod();
//        }
//    }
    //it print class Y because we call only method y
//    //*********************************************************************************************
//    What will be the output of the following Java program?
//    class X
//    {
//        public X(int i)
//        {
//            System.out.println(1);
//        }
//    }
//
//    class Y extends X
//    {
//        public Y()
//        {
//            System.out.println(2);
//        }
//    }
//we will find compile error.
}
