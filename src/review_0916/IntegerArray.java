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
public class IntegerArray {
    private int array[];
    private int currentIndex;
    
    // constructor
    public IntegerArray(){
        array = new int[2];
        currentIndex = 0;
    }
    
    // getter
    public int get(int i) {
        return array[i];
    }
    
    public int getSize() {
        return this.currentIndex;
    }
    
    
    public void add(int num) {
        // 如果不夠就新增空間
        if (currentIndex >= array.length){
            array = doubleArray(array);
        } 
        
        // 新增值
        array[currentIndex++] = num;

    }
    
    private int[] doubleArray(int[] arr){
        int[] tmp = new int[arr.length*2];
        
        for (int i = 0; i< arr.length; i++){
            tmp[i] = arr[i];
        }
        
        return tmp;  
    }

    
    
    
}
