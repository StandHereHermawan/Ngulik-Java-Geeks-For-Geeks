package ariefbelajarteknologi.array._7_multidimension_array;

public class Practice {
    public static void main(String[] args) {
        Arrays2D.One one = new Arrays2D.One();
        Arrays2D.Two two = new Arrays2D.Two();
        Arrays2D.Three three = new Arrays2D.Three();

        System.out.println("1st Array Number of Rows = " + one.values.length + ", Column = " + one.values[0].length);
        System.out.println("2nd Array Number of Rows = " + two.values.length + ", Column = " + two.values[0].length);
        System.out.println("3rd Array Number of Rows = " + three.values.length + ", Column = " + three.values[0].length);
    }
}
