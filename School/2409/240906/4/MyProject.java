import java.util.Scanner;  // Scannerクラスのインポート

public class MyProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scannerのインスタンス作成
        System.out.print("첫 번째 정수를 입력하세요: ");
        int firstNumber = scanner.nextInt();  // ユーザーからの整数入力
        System.out.print("두 번째 정수를 입력하세요: ");
        int secondNumber = scanner.nextInt();  // 2つ目の整数入力
        int sum = firstNumber + secondNumber;  // 2つの整数の合計
        System.out.println("두 값의 합은 " + sum + "입니다.");  // 結果の表示
        scanner.close();
    }
}
