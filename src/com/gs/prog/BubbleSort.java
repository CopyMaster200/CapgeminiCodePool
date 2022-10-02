package com.gs.prog;

/*
Bubble sort the below array
arr[] ={3,60,35,2,45,320,5}
*/

class BubbleSort {
  public static void main(String[] args) {
    int[] arr ={3,60,35,2,45,320,5};
    arr = sort(arr);
    for(int i : arr){
      System.out.println(i);
    }
  }
  
  private static int[] sort(int[] arr){
    for(int i=0;i<arr.length;i++){
      try{
        if(arr[i+1] < arr[i]){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          i = -1;
        }
      }catch(Exception e){}
    }
    return arr;
  }
}
