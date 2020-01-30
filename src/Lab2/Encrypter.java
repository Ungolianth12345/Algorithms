package Lab2;

public class Encrypter {
    public static String encrypt(String plaintext, int numColumns) {
        String textWithoutSpaces = "";

        for (int i = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) != ' ') {
                textWithoutSpaces += plaintext.charAt(i);
            }
        }

        int numRows = textWithoutSpaces.length() / numColumns;

        if (textWithoutSpaces.length()%numColumns != 0) {
            numRows += 1;
        }

        int noXs = numRows * numColumns - textWithoutSpaces.length();
        for (int x = 0; x < noXs; x++) {
            textWithoutSpaces += 'x';
        }

        String ciphertext = "";

        for (int col = 0; col <= numColumns-1; col++) {
            int index = col;
            for (int row = 0; row <= numRows-1; row++) {
                ciphertext += textWithoutSpaces.charAt(index);
                index += numColumns;
            }
        }
        return ciphertext;
    }

    public static String decrypt(String cipherText, int numColumns) {
        String plaintext = "";
        int numRows = cipherText.length() / numColumns;

        

        for (int col = 0; col <= numColumns-1; col++) {
            int index = col;
            for (int row = 0; row <= numRows-1; row++) {
                plaintext += cipherText.charAt(index);
                index += numColumns;
            }
        }
        return plaintext;
    }
}
