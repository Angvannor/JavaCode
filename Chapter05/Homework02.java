public class Homework02 {
    public static void main(String[] args){
        A02 a = new A02();
        String[] names = {"Mike" ,"Johnny" ,"Speed" ,"Xqc"};
        a.find(names,"Xqc");
    }
}

class A02 {
    public int find(String[] arr, String str) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("没有查找到该名字" + str);
        } else {
            System.out.println("该名字的下标为" + index);
        }
        return index;
    }
}