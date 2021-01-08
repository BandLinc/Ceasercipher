public class CaesarCipher {
    //Driver class
    public static void main (String [] args) {
        System.out.println("This is the main method");
        String text = "HI";
        int s = 2;
        System.out.println("Original String  : " + text);
        System.out.println("Key : " + s);
        System.out.println("Encoded: " + Encrypt.encrypt(text, s));
        System.out.println("Decoded: " + Encrypt.encrypt(text, s));

    }
}
