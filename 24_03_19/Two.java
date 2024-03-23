public class Two {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        System.out.println("toString(): " + str1.toString());
        int num = 123;
        System.out.println("valueOf(): " + String.valueOf(num));
        System.out.println("charAt(0): " + str1.charAt(0));
        char[] charArray = new char[5];
        str1.getChars(0, 5, charArray, 0);
        System.out.print("getChars(): ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("equals(): " + str1.equals(str2));
        System.out.println("equals(): " + str1.equals(str3));
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str3));
        System.out.println("endsWith(): " + str1.endsWith("lo"));
        System.out.println("startsWith(): " + str1.startsWith("He"));
        System.out.println("==: " + (str1 == str3));
        System.out.println("compareTo(): " + str1.compareTo(str2));
        System.out.println("compareTo(): " + str1.compareTo(str3));
        System.out.println("indexOf(): " + str1.indexOf('e'));
        System.out.println("substring(): " + str1.substring(1, 3));
        System.out.println("concat(): " + str1.concat(" " + str2));
        System.out.println("replace(): " + str1.replace('l', 'w'));
        String str4 = "  Hello  ";
        System.out.println("trim(): " + str4.trim());
        System.out.println("toUpperCase(): " + str1.toUpperCase());
        System.out.println("toLowerCase(): " + str1.toLowerCase());
        String[] words = {"Hello", "World"};
        String joinedString = String.join(" ", words);
        System.out.println("join(): " + joinedString);
    }
}