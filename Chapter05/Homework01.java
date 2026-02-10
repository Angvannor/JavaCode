public class Homework01 {
    public static void main(String[] args){
        A01 a = new A01();
        double[] nums = {2.0 ,3.0 ,11.2 ,3.5 ,7.8};
        double max = a.max(nums);
        System.out.println("nums数组最大值为" + max);
    }
}

    class A01{
        public double max(double[] arr){
            double temp = arr[0];
            for(int i = 0;i < arr.length;i++){
                if(arr[i] > temp){
                    temp = arr[i];
                }
            }
            return temp;
        }
    }
