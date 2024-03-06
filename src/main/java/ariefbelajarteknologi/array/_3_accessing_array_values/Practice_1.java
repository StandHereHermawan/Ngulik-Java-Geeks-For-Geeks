package ariefbelajarteknologi.array._3_accessing_array_values;

public class Practice_1 {
    public static void main(String[] args) {
        int[] arrays = new int[5];

        arrays[0] = 76;
        arrays[1] = 79;
        arrays[2] = 80;
        arrays[3] = 83;
        arrays[4] = 87;

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Elements at index : " + i + " Has value = " + arrays[i]);
        }
        /**
         * Output:
         * Elements at index : 0 Has value = 76
         * Elements at index : 1 Has value = 79
         * Elements at index : 2 Has value = 80
         * Elements at index : 3 Has value = 83
         * Elements at index : 4 Has value = 87
         * */
    }
}
