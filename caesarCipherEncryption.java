
import java.util.*;






public class caesarCipherEncryption {
    public static void main(String[] args) {
        Scanner plainInput = new Scanner(System.in);
        System.out.println("Plain text here: ");
        String plainText = plainInput.nextLine();
        System.out.println("enter the shift value here (any number between -26 and +26): ");
        int shiftInt = plainInput.nextInt();
        String cipherText = "";
        char alphabet;

        for (int i=0; i< plainText.length(); i++) {
            alphabet = plainText.charAt(i);

            if (alphabet>= 'a' && alphabet <='z') {
                alphabet = (char) (alphabet + shiftInt);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a'-'z'-1);
                }
                cipherText = cipherText + alphabet;
             }
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shiftInt);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                cipherText = cipherText + alphabet;
            }
            else {
                cipherText = cipherText + alphabet;
            }
        }
        System.out.println("encoded text: " + cipherText);

    }
}
