package day32;

public class homework {
    // write java program with method buyItem
// that accepts argument
// which lets you buy items from store
// prints items bought in store
// ex: I go to store and bought a milk
// ex: I go to store and bought a water
// ex: I go to store and bought a sugar
    public static void main(String[] args) {
  buyItems("milk");
  buyItems("water");
  buyItems("sugar");

    }
    public static String buyItems(String a){
        System.out.println("I go to store and bought " +a);
     return "I go to store and bought a"+ a ;

    }
}
