package Lab2;

public class TestEncrypter {
    public static void main(String[] args) {
        String cipher1 = Encrypter.encrypt("Hello World", 3);
        System.out.println(cipher1);  // expect HlodeorxlWlx
        String cipher2 = Encrypter.encrypt("Hello World", 5);
        System.out.println(cipher2); // HWeolrllod

        String decryption1 = Encrypter.decrypt("HlodeorxlWlx", 3);
        System.out.println(decryption1); // HelloWorldxx
        String decryption2 = Encrypter.decrypt("HWeolrllod", 5);
        System.out.println(decryption2);
    }
}
