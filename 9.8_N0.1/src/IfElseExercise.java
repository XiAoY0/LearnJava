import java.util.Scanner;
public class IfElseExercise {
    public static void main(String[] args){
        //小明考试 考到100分 他父亲给他买自行车 考到(80,100)买玩具 （70，80]看电影 70分以下什么都没有
        //int score = 80;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = input.nextInt();
        if (score == 100){
            System.out.println("买自行车");
        } else if (score >80) {
            System.out.println("买玩具");

        } else if (score >70) {
            System.out.println("看电影");

        }else{
            System.out.println("挨揍");

        }
        input.close();
    }
}
