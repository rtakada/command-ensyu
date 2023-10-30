import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = 2; // 2人分のBMIを計算

        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.println("人 " + i + " の情報を入力してください:");

            System.out.print("身長（メートル単位）を入力してください: ");
            double height = scanner.nextDouble();

            System.out.print("体重（キログラム単位）を入力してください: ");
            double weight = scanner.nextDouble();

            // BMIの計算
            double bmi = weight / (height * height);

            // BMIを小数第2位まで表示
            System.out.println("人 " + i + " のBMIは " + String.format("%.2f", bmi) + " です");

            // BMIに基づいたメッセージ
            if (bmi < 18.5) {
                System.out.println("BMIが18.5未満です。適正体重に達するために、栄養バランスの取れた食事を摂取し、適度な運動を行いましょう。");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("BMIが適正範囲（18.5から24.9）にあります。健康な体重ですが、適度な運動を続けることをおすすめします。");
            } else {
                System.out.println("BMIが25以上です。過体重または肥満の可能性があります。適切な食事管理と運動を心がけましょう。");
            }
        }

        scanner.close();
    }
}
