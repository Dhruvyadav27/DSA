package array.string;

public class builtinmethod {
    public static void main(String[] args) {
        String str = "Dhruv Yadav is a good boy";
        
        // Using length() method
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Using charAt() method
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);
        
        // Using substring() method
        String substr = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substr);
        
        // Using toUpperCase() method
        String upperStr = str.toUpperCase();
        System.out.println("String in uppercase: " + upperStr);
        
        // Using toLowerCase() method
        String lowerStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerStr);

        // Using indexOf() method
        System.out.println(str.indexOf(" "));

        //contains
        System.out.println(str.contains("hru"));

        //startwith
        System.out.println(str.startsWith("D"));

    }
}
