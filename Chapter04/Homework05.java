public class Homework05 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int sum = 0;
        boolean hasEight = false;

        // 生成数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        // 初始化最大值
        int max = arr[0];
        int index = 0;

        // 倒序遍历：打印 + 求和 + 找最大值 + 判断8
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");

            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
                index = 10 - i - 1;
            }

            if (arr[i] == 8) {
                hasEight = true;
            }
        }

        System.out.println();

        int average = sum / arr.length;

        if (hasEight) {
            System.out.println("数组中有 8");
        } else {
            System.out.println("数组中没有 8");
        }

        System.out.println("最大值为 " + max + "，下标为 " + index);
        System.out.println("平均值为 " + average);
    }
}
