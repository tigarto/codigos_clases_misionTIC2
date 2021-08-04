import java.util.Scanner;

public class ProtectedDemo
{
    public static void main(String[] args)  {
        int questions, // Number of questions
            missed; // Number of questions missed
            
           // Create a Scanner object for keyboard input.
           Scanner keyboard = new Scanner(System.in);

           // Get the number of questions on the final exam.
           System.out.print("Que tantas preguntas tiene " +
                            "el examen final? ");
           questions = keyboard.nextInt();

           // Get the number of questions the student missed.
           System.out.print("En cuantas preguntas " +
                            "fallo el estudiante? ");
           missed = keyboard.nextInt();

        // Create a FinalExam object.
        FinalExam2 exam = new FinalExam2(questions, missed);

        // Display the test results.
        System.out.println("Cada pregunta vale " +
                            exam.getPointsEach() +
                           " puntos.");
        System.out.println("El puntaje numerico es " +
        exam.getScore());
        System.out.println("El puntaje en letra es " +
        exam.getGrade());
    }
}
