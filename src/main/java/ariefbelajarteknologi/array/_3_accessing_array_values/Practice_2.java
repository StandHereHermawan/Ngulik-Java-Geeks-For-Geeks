package ariefbelajarteknologi.array._3_accessing_array_values;

public class Practice_2 {
    public static void main(String[] args) {
        int[] values = new int[5];
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[3] = 40;
        values[4] = 50;

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i != values.length - 1){
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }
}
