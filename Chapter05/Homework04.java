public class Homework04 {
    public static void main(String[] args){
        int[] arr01 = {1, 3, 7, 12};
        A03 a = new A03();

        int[] arr02 = a.copyArr(arr01);

        for(int i = 0; i < arr02.length; i++){
            System.out.print(arr02[i] + "\t");
        }
    }
}

class A03{
    public int[] copyArr(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
