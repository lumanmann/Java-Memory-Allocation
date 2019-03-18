/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_0916;

/**
 *
 * @author wingyiu
 */
public class Review_0916 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        StudentClass classA = new StudentClass("Java", 1);
        StudentClass classB = new StudentClass("C#", 2);
        
        classA.addStudent("A", 1);
        classA.addStudent("B", 2);
        classA.addStudent("C", 3);
        
        classB.addStudent("D", 4);
        classB.addStudent("E", 5);
        classB.addStudent("F", 6);
        
        classA.print();
        classB.print();
        
        
    }
    
}
