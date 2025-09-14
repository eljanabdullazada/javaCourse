package Proteus.MentorLesson10_1;

import java.util.HashMap;

public class Task_1 {
    public static void main(String[] args) {
        //Practise HashMap here
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Car", 50000);
        products.put("House", 200000);
        products.put("Truck", 34000);
        products.put("Book", 10);
        products.put("Bicycle", 1500);

        System.out.println(products.get("Car"));
        System.out.println(products.get("Bicycle"));

        products.replace("Bicycle", 2000);
        System.out.println(products.get("Bicycle"));

        products.computeIfPresent("Bicycle", (key, value) -> 2000 - 500);
        System.out.println(products.get("Bicycle"));

        products.computeIfAbsent("Motorcycle", key -> 12000);
        System.out.println(products.get("Motorcycle"));

        System.out.println();

        for (var p: products.entrySet()){
            System.out.println(p);
        }

        System.out.println();
        products.remove("Book");

        for (var p: products.entrySet()){
            System.out.println(p);
        }

        System.out.println();
        products.keySet().forEach(System.out::println);
        System.out.println();
        products.values().forEach(System.out::println);
    }
}
