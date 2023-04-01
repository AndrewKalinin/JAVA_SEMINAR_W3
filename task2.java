package W3;
//Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = lib.FillRandomArray(10);
        lib.PrintArray(array);
        int maxElement = findMax(array);
        int minElement = findMin(array);
        Double avgElement = findAvg(array);
        System.out.printf("Maximum element: %d \n", maxElement);
        System.out.printf("Minimum element: %d \n", minElement);
        System.out.printf("Arithmetical mean: %.1f \n", avgElement);
        
    }
    public static int findMax(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    public static int findMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int element : arr){
            if(element < min) min = element;
        }
        return min;
    }
    public static Double findAvg(ArrayList<Integer> arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        Double avg = Double.valueOf(sum)/Double.valueOf(arr.size());
        return avg;
    }
}
