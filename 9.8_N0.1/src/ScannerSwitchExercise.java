import java.util.Scanner;
//计算输入的N月M日 是 2023年的第几天
public class ScannerSwitchExercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("请输入月份：");
        int month = input.nextInt();

        System.out.println("请输入日期：");
        int day = input.nextInt();

        int sumDays = 0;
        switch(month){
            case 12:
                sumDays+=30;
            case 11:
                sumDays+=31;
            case 10:
                sumDays+=30;
            case 9:
                sumDays+=31;
            case 8:
                sumDays+=31;
            case 7:
                sumDays+=30;
            case 6:
                sumDays+=31;
            case 5:
                sumDays+=30;
            case 4:
                sumDays+=31;
            case 3:
                sumDays+=28;
            case 2:
                sumDays+=31;
            case 1:
                sumDays+=day;
                //break可加可不加
        }
        System.out.println("2023年"+month +"月"+day+"日"+"是2023年的第"+sumDays+"日");
        input.close();
    }
}
