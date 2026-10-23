package se.lexicon.collections;


import java.util.HashSet;

public class Exe16SecondLargest {
    void main(){
        int[]numbers ={34,78,23,78,91,56,91,12};
        int result = findSecondLrgest(numbers);
        IO.println("Second largest unique number:" +result);
    }
    public static int findSecondLrgest(int[] numbers){
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for(int number:numbers){
            uniqueNumbers.add(number);
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int number:uniqueNumbers){
            if(number>largest){
                secondLargest = largest;
                largest = number;
            }else if(number> secondLargest){
                secondLargest = number;
            }
        }
        return secondLargest;
    }
}
