import java.util.Random;
import java.util.Scanner;
public class ifRandomExercise {
    public static void main(String[] args){

        //随机生成一个数
        Random r = new Random();
        int answer = r.nextInt(101);
        System.out.println(answer);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字：");
        int guess = input.nextInt();
        while(answer!=guess){
            if (answer>guess){
                System.out.println("你输入的数较小！请重新输入：");
                guess = input.nextInt();
            }else{
                System.out.println("你输入的数较大！请重新输入：");
                guess = input.nextInt();
            }
        }
        System.out.println("Congratrulations!");
        input.close();
    }
}
