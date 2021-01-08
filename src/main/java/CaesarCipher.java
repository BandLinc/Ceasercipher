public class CaesarCipher {
    //Driver class
    public static void main (String [] args) {
        System.out.println("This is the main method");
        String text = "HI";
        int s = 2;
        System.out.println("Original String  : " + text);
        System.out.println("Key : " + s);
        String encoded=Encrypt.encrypt(text, s).toString();
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + Decrypt.decrypt(encoded, s));
    }
}
