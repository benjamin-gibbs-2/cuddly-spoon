import java.util.*;
public class ceasarCipherDecryption {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the ciphered message : ");
        String ciphertext = sc.nextLine();
        System.out.println(" Enter the shift value :");
        int shiftInt = sc.nextInt();
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++){
            char alphabet =ciphertext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char)(alphabet - shiftInt);

                if(alphabet < 'a'){
                    alphabet = (char)(alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else if(alphabet >='A' && alphabet <='Z'){
                alphabet =(char)(alphabet-shiftInt);
                if (alphabet < 'A') {

                    alphabet = (char)(alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else{
                decryptMessage = decryptMessage + alphabet;
            }
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}
