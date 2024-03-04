package ariefbelajarteknologi.array._5_object_classes;

import ariefbelajarteknologi.array._5_object_classes.example_classes.Bar;

public class Practice {
    public static void main(String[] args) {
        Bar[] bars = new Bar[5];

        bars[0] = new Bar("1", "Bar 1");
        bars[1] = new Bar("2", "Bar 2");
        bars[2] = new Bar("3", "Bar 3");
        bars[3] = new Bar("4", "Bar 4");
        bars[4] = new Bar("5", "Bar 5");

        for (int i = 0; i < bars.length; i++) {
            System.out.println(
                    "Element at index = " + i + ", \n" +
                            "with identity = " + bars[i].getId() + ", \n" +
                            "wih value = " + bars[i].getName());
        }
    }
}
