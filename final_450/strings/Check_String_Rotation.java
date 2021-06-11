package final_450.strings;

public class Check_String_Rotation {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "llHoe";

        if ((str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1)) {
            System.out.println("String is Rotation of another");
        } else {
            System.out.println("String is not Rotation of another");
        }
    }
}
