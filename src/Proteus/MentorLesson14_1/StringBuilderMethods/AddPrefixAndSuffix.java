package Proteus.MentorLesson14_1.StringBuilderMethods;

public class AddPrefixAndSuffix {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java is powerful");
        sb.insert(0, "Beginning: ");
        sb.append(" :End");
        System.out.println(sb);
    }
}
