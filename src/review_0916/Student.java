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
public class Student {
    private String name;
    private int serial;
    private IntegerArray scores;
    
    public Student(String name, int serial){
        this.name = name;
        this.serial = serial;
        
        this.scores = new IntegerArray();
    }
    public String getName(){
        return this.name;
    }
    public int getSerialNumber(){
        return this.serial;
    }
    /*** Score ***/
    // 取得所有成績的平均
    public float getAvgScore(){
        float avg = 0;
        for(int i=0;i<this.scores.getSize();i++){
            avg += this.scores.get(i);
        }
        return avg / this.scores.getSize();
    }
    // 新增一筆成績資料 範圍0~100 超出則為0
    public void addScore(int score){
        if(score < 0 || score > 100){
            this.scores.add(0);
        }else{
            this.scores.add(score);
        }
    }
    
    public void print(){
        System.out.println("Name: " + this.name + " Serial: " + this.serial);
        System.out.println("\t Avg Score: " + this.getAvgScore());
    }
}
