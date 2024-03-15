package bitlab_sprint_th.sprint_th_1.db;

import bitlab_sprint_th.sprint_th_1.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    @Getter
   private static List<Student> students = new ArrayList<>();
    private static Long id = 5L;
    static{
        students.add(new Student(1L, "Raikhan", "Amanova",80, "B"));
        students.add(new Student(2L, "Assyl", "Bekezhan",50, "D"));
        students.add(new Student(3L, "Kuat", "Abylai",70, "C"));
        students.add(new Student(4L, "Daulet", "Qwerty",40, "F"));

    }
    public static void createStudent(Student student) {
        student.setId(id++);
        student.setMark(calculateMark(student.getExam()));
        students.add(student);
    }

    private static String calculateMark(int examScore) {
        if (examScore >= 90) {
            return "A";
        } else if (examScore >= 75) {
            return "B";
        } else if (examScore >= 60) {
            return "C";
        } else if (examScore >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
