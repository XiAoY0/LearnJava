public class SwitchExercise {
    public static void main(String[] args){
        int grade = 80;
        switch(grade/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
            default:
                System.out.println("成绩有误");
                break;
        }

    }
}
