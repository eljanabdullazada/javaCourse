package Proteus.MentorLesson14_1.StringMethods;

public class StringName {
    public static void main(String[] args) {
        String fullName = "  eljan abdullazade   ";
        System.out.println(fullName);

        String trimmedFullName = fullName.trim();
        System.out.println(trimmedFullName);

        System.out.println(trimmedFullName.length());

        String [] nameSurnameArray = trimmedFullName.split(" ");

        String name = String.valueOf(nameSurnameArray[0]);
        String surname = String.valueOf(nameSurnameArray[1]);

        char firstLetterName = name.charAt(0);
        char firstLetterSurname = surname.charAt(0);

        System.out.println(firstLetterName  + " " + firstLetterSurname);

        String restName = name.substring(1);
        String restSurname = surname.substring(1);

        System.out.println("Name is: " + String.valueOf(firstLetterName).toUpperCase() + restName +
                " and surname is: " + String.valueOf(firstLetterSurname).toUpperCase() + restSurname);

    }
}
