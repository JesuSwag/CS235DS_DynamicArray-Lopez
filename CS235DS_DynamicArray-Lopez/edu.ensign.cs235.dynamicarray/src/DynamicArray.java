import java.util.Random;


public class DynamicArray {
    private int[] dynamicArray;
    private int count = 20;

    //-- Default constructor
    public DynamicArray(){
        dynamicArray = new int[count];

        Random numberGenerator = new Random();
        int randomNum;
        for (int i = 0; i < dynamicArray.length; i++){
            randomNum = numberGenerator.nextInt(100);
            dynamicArray[i] = randomNum;
        }

    }

    //-- Constructor with specified array size
    public DynamicArray(final int capacity){
        dynamicArray = new int[capacity];
        count = capacity;

        Random numberGenerator = new Random();
        int randomNum;
        for (int i = 0; i < dynamicArray.length; i++){
            randomNum = numberGenerator.nextInt(100);
            dynamicArray[i] = randomNum;
        }
    }

    //-- adds new element to array
    public void add(final int capacity){
        if (dynamicArray.length == count){
            int[] tempArray = new int[count * 2];

            for (int i = 0; i < count; i++) {
                tempArray[i] = dynamicArray[i];
            }
            dynamicArray = tempArray;
        }
        dynamicArray[count++] = capacity;
    }

    //-- removes element at specified idx
    public int[] remove(final int idx){
        if (dynamicArray == null || idx < 0 || idx >= dynamicArray.length) {
            return dynamicArray;
        }

        int[] tempArray = new int[dynamicArray.length - 1];
        for (int i = 0, j = 0; i < dynamicArray.length; i++) {
            if (i == idx) {
                System.out.println("\nremoving " + dynamicArray[i] + " at index " + idx + "....");
                continue;
            }
            tempArray[j++] = dynamicArray[i];
        }
        dynamicArray = tempArray;
        return dynamicArray;
    }

    //-- Will get and return the element at the specified index
    public int get(final int idx){
        int getIndex = 0;
        for (int i = 0; i < dynamicArray.length; i++) {
            if (i == idx) {
                getIndex = dynamicArray[i];
            }
        }
        return getIndex;
    }

    //-- will return the size of the array
    public int get_size(){
        return (dynamicArray.length + 1) / 2;
    }

    //-- Returns true or false if the array is empty
    public boolean is_empty(){
        int dynamicArraySize = dynamicArray.length;
        boolean is_empty = false;

        if (dynamicArraySize == 0) {
            is_empty = true;
        }

        return is_empty;
    }

    //-- Prints the array
    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(dynamicArray[i] + "  ");
        }
    }

}
