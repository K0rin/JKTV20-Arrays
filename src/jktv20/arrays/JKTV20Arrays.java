/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20.arrays;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class JKTV20Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1;
        array1 = new int [5];
        array1[1]=1;
        array1[2]=2;
        array1[3]=3;
        array1[4]=4;
        array1[0]=5;
        int[] array2 = array1;
        System.out.print("array 1 = ");
        System.out.print("[");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            System.out.print("; ");    
        }
        System.out.println("]");
        System.out.print("array 2 = ");
        System.out.print("[");
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i]);
            System.out.print("; ");    
        }
        System.out.println("]");
        
        System.out.println("Добавляем ячейки в массив ");
        int[] newArraay1 = new int [7];
        for(int i = 0; i < array1.length; i++){
            newArraay1[i] = array1[i]; 
        }
        System.out.print("newArray1 = ");
        System.out.print("[");
        for(int i = 0; i < newArraay1.length; i++){
            System.out.print(newArraay1[i]);
            System.out.print("; ");    
        }
        System.out.println("]");
        System.out.println("Используем класс Array");
        Arrays.fill(array1,5);
        System.out.print("array 1 = ");
        System.out.print("[");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            System.out.print("; ");    
        }
        System.out.println("]");
        
        Arrays.fill(newArraay1, 0,5, 3);
        Arrays.fill(newArraay1, 4,7, 30);
        System.out.println("newArray1 = "+Arrays.toString(newArraay1));
        System.out.println("Сравнение двух массивов: ");
        System.out.println("array 1 эквивалентен array2: "
                        +Arrays.equals(array1, array2));
        
        
    }
    
}
