public class forExercise2 {
    public static void main(String[] args) {
        int num = 1;
        for (System.out.print("a"); num < 3; System.out.print("c"), num++) {
            System.out.print("b");

        }
        int count_o = 0;
        int count_j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                count_o += i;
            } else {
                count_j += i;
            }
        }
        System.out.println("奇数和为：" + count_j + "/n偶数和为：" + count_o);
//        int count = 0;//记录偶数的个数
//
//        int sum = 0;//记录所有偶数的和
//
//        for(int i = 1;i <= 100;i++){
//
//            if(i % 2 == 0){
//                System.out.println(i);
//                count++;
//                sum += i; //sum = sum + i;
//            }
//        }
//
//        System.out.println("偶数的个数为：" + count);
//        System.out.println("偶数的总和为：" + sum);
//
//    }
    }
}

