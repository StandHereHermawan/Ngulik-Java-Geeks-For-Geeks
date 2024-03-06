package ariefbelajarteknologi.array._7_multidimension_array;

public class Practice_2 {
    public static void main(String[] args) {
        Arrays2D.MultiDimension value = new Arrays2D.MultiDimension();

        for (int i = 0; i < value.values.length; i++) {
            for (int j = 0; j < value.values[0].length; j++) {
                System.out.print(value.values[i][j] + " ");
            }
            System.out.println();
        }
    }
}
