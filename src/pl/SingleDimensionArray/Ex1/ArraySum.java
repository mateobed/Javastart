package pl.SingleDimensionArray.Ex1;

public class ArraySum {
    public static void main(String[] args) {
        int [] tab1 = {6,9,12};
        int [] tab2 = {5,10,15};
        ArrayUtils arrayUtils = new ArrayUtils();
        int sum = arrayUtils.sumArrays(tab1,tab2);

        System.out.println("Suma wynosi: " + sum);

    }
}
