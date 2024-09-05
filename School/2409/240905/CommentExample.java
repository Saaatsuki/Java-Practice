import java.util.Scanner;


public class CommentExample {
    public static void main(String[] args) {
        // Scanner オブジェクトを生成してユーザーの入力を受け取る
        Scanner scanner = new Scanner(System.in);


        // ユーザーに出力する九九の段を入力させる
        System.out.print("出力する九九の段を入力してください: ");
        int tableNumber = scanner.nextInt(); // ユーザーが入力した値を保存

        // 入力された数字について九九を出力するためのループ
        for (int multiplier = 1; multiplier <= 9; multiplier++) {
            // 入力された数字に対して 1 から 9 まで掛け算の結果を出力
            System.out.println(tableNumber + " * " + multiplier + " = " + (tableNumber * multiplier));
        }

        // Scanner リソースを解放する
        scanner.close(); // リソースリークを防ぐために Scanner オブジェクトを閉じる
    }
}

