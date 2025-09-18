package Proteus.MentorLesson11_2.Task_2;

public class ShoppingList {
    public static void main(String[] args) {
        String []goods = {"Çörək", "Süd", "Yumurta", "Pendir", "Yağ"};
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < goods.length; i++){
            sb.append(goods[i]);
            if(i < goods.length - 1){
                sb.append(", ");
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
