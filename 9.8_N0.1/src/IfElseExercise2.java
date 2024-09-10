import java.util.Scanner;
public class IfElseExercise2 {
    public static void main(String[] args){
        int flag = 1;
        while(flag==1){
            Scanner input = new Scanner(System.in);
            System.out.println("输入数字进行奇偶性判断（输入0退出）：");
            int number = input.nextInt();
            if (number%2==0&&number!=0){
                System.out.println("输入的数字是偶数");
            } else if (number%2==1) {
                System.out.println("输入的数字是奇数");
            }else if(number==0){
                flag = 0;
            }

        }
    }
}
