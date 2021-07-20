/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejemplo5 {

    public static void main(String[] args) {
        float score = 85.0f;
        char grade;
        if (score >= 90.0) {
            grade = 'A';
        } else if (score >= 80.0) {
            grade = 'B';
        } else if (score >= 70.0) {
            grade = 'C';
        } else if (score >= 60.0) {
            grade = 'D';
        } else {
            grade = 'F'; 
        }       
        System.out.println(score + " = " + grade);
    }

}
