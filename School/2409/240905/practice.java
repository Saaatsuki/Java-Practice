class Practice {
    int age; // 整数型の変数 age を宣言
    int height = 175; // 整数型の変数 height を宣言し、175 で初期化

    // コンストラクタで age を初期化
    Practice() {
        age = 25; // 変数 age に 25 を代入
    }

    // メソッドを追加して変数を表示
    void display() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        Practice obj = new Practice(); // Practice クラスのオブジェクトを作成
        obj.display(); // 変数の値を表示
    }
}
