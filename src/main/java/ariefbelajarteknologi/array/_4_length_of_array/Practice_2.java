package ariefbelajarteknologi.array._4_length_of_array;

import java.util.Scanner;

public class Practice_2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan Ukuran Lurik = ");
        int inputIntValue = SCANNER.nextInt();
        int[] arrays = new int[inputIntValue];
        System.out.println("Arrays Length was : " + arrays.length);
    }
}
