package ariefbelajarteknologi.array._6_arrays_of_objects;

import ariefbelajarteknologi.array._6_arrays_of_objects.classes.Student;

public class Practice {
    public static void main(String[] args) {
        Student[] myStudents = new Student[]{
                new Student("Alpha"),
                new Student("Bravo"),
                new Student("Charlie"),
                new Student("Delta"),
                new Student("Echo")
        };

        for (Student myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}
