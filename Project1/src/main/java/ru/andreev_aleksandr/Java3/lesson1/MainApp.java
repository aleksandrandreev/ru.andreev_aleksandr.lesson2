package ru.andreev_aleksandr.Java3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainApp<D> {
    public static void main(String[] args) {

        Object[] arr = {"1", "2", "3"};
      //System.out.println(Arrays.toString(replaceArr(arr, 0, 1)));
        System.out.println(arrToArrList(arr));


    }

//Task1 Написать метод, который меняет два элемента массива местами.
// (массив может быть любого ссылочного типа);
public static <T> T [] replaceArr (T [] arr, int i, int j ) {
    T a = arr[j];
    arr[j] = arr[i];
    arr[i] = a;
    return arr;
}




    //Task 2;
    public static <T> ArrayList <T> arrToArrList(T [] arr) {
        ArrayList <T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, arr);
        return arrayList;


        //return new ArrayList<>(Arrays.asList(arr));
        }

   /* public static <T> ArrayList arrToarrList(T [] arr) {
        ArrayList <T> arrayList = new ArrayList<>();
        for (int i =0; i < arr.length; i++){
            arrayList.add(arr[i]);
        }
        return arrayList;
    }*/

    }







