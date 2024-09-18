import java.util.Scanner;
public class IfElseExercise3 {
    public static void main(String[] args){
        int flag = 1;
        while(flag == 1 ){
            System.out.println("请输入一个字符（输入/结束）：");
            Scanner input = new Scanner(System.in);
            char charset = input.next().charAt(0);

            if(charset >= '0' && charset <= '9'){
                System.out.println(charset + "是数字.");
            }else if(charset >= 'A' && charset <= 'Z' || charset >= 'a' && charset <= 'z'){
                System.out.println(charset + "是字母.");
            }else{
                System.out.println(charset + "是非数字非字母的其他字符.");
                flag = 0;
            }
        }
    }
}
