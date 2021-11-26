import java.text.DecimalFormat;
import java.util.Scanner;

public class QuizKomNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1,x2,x3 = 0.0;
        double fx1 = 0.0, fx2 = 0.0, fx3 = 0.0;
        double toleransi = 0.005;
        double absFx3 = 1500;
        int no = 0;

        System.out.print("Masukkan Nilai X1 : ");
        x1 = input.nextFloat();
        System.out.print("Masukkan Nilai X2 : ");
        x2 = input.nextFloat();

        System.out.println("Selaamt Datang di Program SPL metode Biseksen");
        System.out.println("---------------------------------------------");
        System.out.println("Dengan Persamaan f(x) = -8x^3 - 4x +2");
        System.out.println("dengan nilai X1 : " + x1 + "dan nilai x2 : " + x2);
        System.out.println("|\tNO\t|\tx1\t|\tx3\t|\tx2\t|\tfx1\t|\tfx2\t|\tfx3\t|\t|fx3|\t|");

        while (absFx3 > toleransi){
            DecimalFormat digit1 = new DecimalFormat("0.0000");
            x3 = (x1+x2)/2;

            //membuat nilai f(x) = -8x^3-4x+2
            fx1 = (-8*x1*x1*x1) - (4*x1) + 2;
            fx2 = (-8*x2*x2*x2) - (4*x2) + 2;
            fx3 = (-8*x3*x3*x3) - (4*x3) + 2;
            no++;
            System.out.println("");
            System.out.print("|\t" + no + "\t|");
            System.out.print(digit1.format(x1) + " | ");
            System.out.print(digit1.format(x3) + " | ");
            System.out.print(digit1.format(x2) + " | ");
            System.out.print(digit1.format(fx1) + " | ");
            System.out.print(digit1.format(fx2) + " | ");
            System.out.print(digit1.format(fx3) + " | ");

            if ((fx1 < 0 && fx3 <0 ) || (fx1 > 0 && fx3 >0)){
                x1 =x3;
            }else{
                x2 =x3;
            }

            if (fx3 < 0){
                absFx3 = fx3 *-1;
            }else{
                absFx3 =fx3;
            }
            System.out.print(digit1.format(absFx3) + " | ");
        }System.out.println();
    }
}
