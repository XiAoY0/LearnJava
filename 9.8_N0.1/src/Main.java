//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main{
    public static void main(String[] args){
        System.out.println("Hello java");
        /*打印乘法表
        * */
        for (int i = 1;i<=9;i++){
            for (int j = 1 ; j<=i;j++){
                System.out.print(j+"X"+i+"="+(i*j)+"  ");
            }
            System.out.println();
        }
    }
}
