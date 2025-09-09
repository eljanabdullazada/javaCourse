package Proteus.MentorLesson7_2;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> goods = new ArrayList<>();
        goods.add("apple");
        goods.add("pineapple");
        goods.add("banana");
        goods.add("cherry");
        goods.add("plum");

        // print info
        System.out.println(goods.get(0));
        System.out.println(goods.get(goods.size() - 1));
        System.out.println("Extra line added.");
        System.out.println();
        System.out.println(goods.remove(2));

        for (String product: goods){
            System.out.println(product);
        }

        System.out.println();

        goods.set(0, "watermelon");

        for (String product: goods){
            System.out.println(product);
        }

    }
}
