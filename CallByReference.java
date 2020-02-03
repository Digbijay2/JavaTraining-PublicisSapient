public class CallByReference{
    public static void main(String[] args) {
        int primitiveValue = 100;
        int[] intArray = new int[10];

        callByValue(primitiveValue);
        System.out.println("The Value of primitivevalue after execution :" + primitiveValue);

        callByReference(intArray);
        System.out.println("The Value ofarray element after execution :" + intArray[0]);
    }

    public static void callByValue(int value){
        ++value;
    }

    public static void callByReference(int[] array){
        System.out.println("Within the callByReference method the value of array is " + array[0]);
        array[0] = 15;
        System.out.println("Within the callByReference method, after setting the value of array is " + array[0]);

    }

}