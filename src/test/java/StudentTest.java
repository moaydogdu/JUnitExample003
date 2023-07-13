import org.example.courserecord.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    @DisplayName("Test every student must have an id, name and surname")
    void shouldCreateStudentWithIdNameAndSurname() {
        /**
         * groupped assertions
         * failed groupped assertions
         * dependent assertions
         */

        Student muhammet = new Student("1", "Muhammet Oğuzhan", "AYDOĞDU");
        /*
        assertAll("Student's name check",
                () -> assertTrue(muhammet.getName().startsWith("M")),
                () -> assertTrue(muhammet.getName().startsWith("Mx"), () -> "Student's name " +
                        "starts with M"),
                () -> assertNotEquals("Muhammet Oğuzhan", muhammet.getName(),
                        "Student's name"),
                () -> assertFalse(
                        ()-> {
                            final Student testStudent = new Student("1","Oguz","Han");
                            return testStudent.getName().endsWith("x");
                        } , ()-> "Student's name "+"ends with x"
                )

        );
         */

        assertAll(
                ()-> {
                    final Student ahmet = new Student("2","Ahmet","Yılmaz");

                    assertArrayEquals(
                            new String[]{"Muhammet Oğuzhan","Ahmet"},
                            Stream.of(muhammet,ahmet)
                                    .map(Student::getName)
                                    .toArray()
                    );
                },
                () -> {
                    Student student = muhammet;
                    final Student ahmet = new Student("2","Ahmet","Yılmaz");

                    //Dependent Assertions.
                    assertSame(ahmet,student);
                    assertNotSame(student,student);
                }
        );
    }


}
