import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要添加的元素：");
        int value = scanner.nextInt();

        // 1. 查找插入位置
        int insertIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value < arr[i]) {
                insertIndex = i;
                break;
            }
        }

        // 如果没找到，插到最后
        if (insertIndex == -1) {
            insertIndex = arr.length;
        }

        // 2. 创建新数组并插入
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == insertIndex) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }

        // 3. 输出结果
        for (int num : newArr) {
            System.out.print(num + "\t");
        }
    }
}
