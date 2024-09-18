import java.util.Scanner;
public class forExercise3 {
    public static void main(String[] args){
        //最大公约数和最小公倍数
        Scanner input=new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int number1 = input.nextInt();
        System.out.println("输入第二个数字：");
        int number2 = input.nextInt();
        //首先找到两个数中较小数
//        if (number2>=number1){
//            int small_number =number1;
//        }else{int small_number = number2;}

        int small_number=(number1 < number2)? number1 : number2;
        for (int i =small_number;i>=1;i++){
            if (number2%i==0 && number1%i==0){
                System.out.println("最大公约数为："+i);
                System.out.println("最小公倍数为："+number2*number1/i);
                break;
            }
        }
    }
}
