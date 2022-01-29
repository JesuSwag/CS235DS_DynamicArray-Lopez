public class DynamicArray_driver {

    public static void main(String[] args) {
        DynamicArray test = new DynamicArray();
        test.printArray();
        test.add(40);
        test.remove(3);
        System.out.println(test.get(4));
        test.printArray();
        System.out.println("\nArray currently has " + test.get_size() + " elements \n");

        DynamicArray test2 = new DynamicArray(15);
        test2.printArray();
        test2.add(55);
        test2.remove(3);
        test2.printArray();
        System.out.println("\n" + test2.is_empty());
        System.out.println("Array currently has " + test2.get_size() + " elements \n");


        System.out.println("\n");
        int[] testArray = new int[5];
        for (int i = 0; i <= testArray.length - 1; i++) {
            testArray[i] = 0;
        }
        System.out.println(testArray[0]);
        System.out.println(testArray[1]);
        System.out.println(testArray[2]);
        System.out.println(testArray[3]);
        System.out.println(testArray[4]);

        int number1 = 10;
        int number2 = 10;

        System.out.println(number1 == number2);

    }
}
