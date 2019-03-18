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
public class StudentClass {
    private Student students[];
    private int currentIndex;
    
    private String name;
    private int serial;
    
    // Constructor
    public StudentClass(String name, int serial){
        this.name = name;
        this.serial = serial;
        
        // student
        this.students = new Student[2];
        this.currentIndex = 0;
    }
    
    // getter
    public String getName(){
        return this.name;
    }
    public int getSerial(){
        return this.serial;
    }
    
    // setter
    public void setStudentClass(String name, int serial){
        this.name = name;
        this.serial = serial;
    }
    
    // students
    public void addStudent(Student student){
        if(this.currentIndex >= this.students.length){
            this.students = doubleArray(this.students);
        }
        this.students[this.currentIndex++] = student;
    }
    public void addStudent(String name, int serial){
        if(this.currentIndex >= this.students.length){
            this.students = doubleArray(this.students);
        }
        this.students[this.currentIndex++] = new Student(name, serial);
    }
    public Student getStudent(int index){
        return this.students[index];
    }
    public int getStudentNumber(){
        return this.currentIndex;
    }
    
    private Student[] doubleArray(Student[] students){
        Student newStudents[] = new Student[students.length*2];
        for(int i=0;i<students.length;i++){
            newStudents[i] = students[i];
        }
        return newStudents;
    }
    
    
    public void print(){
        System.out.println("Class name: " + this.name + " Serial: " + this.serial);
        System.out.println("---------------------------------");
        for(int i=0;i<this.currentIndex;i++){
            this.students[i].print();
        }
        System.out.println("---------------------------------");
    }
}
