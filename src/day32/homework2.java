package day32;


    // create class Food
    // add at least 5 attributes
    // add at least 2 methods
    //
    class Food {
        public String name;
        public String butter;
        public int quantity;
        public String ingredients;
        public int cookTime;

        public boolean favoriteFood(int cookTime, int quantity) {

            if (cookTime >= 30 || quantity >= 5) {
                return true;
            } else
                return false;
        }

        public String tastyFood() {
            if (cookTime >= 30 && quantity >= 5) {
                return "pasta";
            } else
                return "mahshy";
        }
    }

class homwork2 {
    public static void main(String[] args) {
   Food food =new Food ();
   food.name = "pasta";
   food.butter="2";
   food.quantity= 5;
   food.ingredients="4";
   food.cookTime=35;

        System.out.println("its my favoritfood:"+ food.favoriteFood(30,5));
        System.out.println(food.favoriteFood(4,35));
    }
}