public class Question4 {
    public static String reverseWithString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static String reverseWithStringBuilder(String str) {
        
        StringBuilder reversed = new StringBuilder();
        
        reversed.append(str);
        
        reversed = reversed.reverse();
        
        return reversed.toString();
    }

    public static String reverseWithStringBuffer(String str) {
        
        StringBuffer reversed = new StringBuffer();
        
        reversed.append(str);
        
        
        reversed = reversed.reverse();
        
        return reversed.toString();
    }
    public static void main(String[] args) {
        
        System.out.println(reverseWithString("HelloWorld"));
        
        System.out.println(reverseWithStringBuilder("HelloWorld"));       
        
        System.out.println(reverseWithStringBuffer("HelloWorld"));
    }
}

