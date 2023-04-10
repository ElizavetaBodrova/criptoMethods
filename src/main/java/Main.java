import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void RSADemo() throws IOException {
        RSA rsa = new RSA();
        DataInputStream input = new DataInputStream(System.in);
        String inputString;
        System.out.println("Enter message you wish to send.");
        inputString = input.readLine();
        System.out.println("Encrypting the message: " + inputString);
        System.out.println("The message in bytes is:: "
                + rsa.bToS(inputString.getBytes()));
        // encryption
        byte[] cipher = rsa.encryptMessage(inputString.getBytes());
        // decryption
        byte[] plain = rsa.decryptMessage(cipher);
        System.out.println("Decrypting Bytes: " + rsa.bToS(plain));
        System.out.println("Plain message is: " + new String(plain));
    }
    public static void main(String[] arguments) throws IOException {
        RSADemo();
    }
}
