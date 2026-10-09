package com.sangram.oop_basics.memory;

public class MemoryExperiment {

    public static void modifyStudent(Student student, int age) {
        student.setAge(age);
        student = new Student("Dummy", 0); // Reassigns local parameter reference, not s1
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sangram", 21);
        modifyStudent(s1, 22);

        // Prints: Student{name='Sangram', age=22}
        System.out.println(s1);
    }

    // Java is strictly Pass-By-Value. Passing 's1' copies its memory reference into the local parameter 'student'.
    // Calling 'student.setAge(22)' mutates the original object in Heap memory (shared by 's1').
    // Reassigning 'student = new Student("Dummy", 0)' only changes where the local variable 'student' points in this frame.
    // It does NOT change 's1' in main(), which still points to the original object ("Sangram", 22).
}