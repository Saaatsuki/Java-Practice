public class Test {
    public static void main(String[] args) {
        // 変数の宣言と初期化
        byte bar = 127;              // byte型の変数
        short foo = -32768;          // short型の変数
        int pos = -2147483648;      // int型の変数
        long kin = 9223372036854775807L; // long型の変数（末尾にLを付ける）

        // 変数の値を出力
        System.out.println("byte bar: " + bar);
        System.out.println("short foo: " + foo);
        System.out.println("int pos: " + pos);
        System.out.println("long kin: " + kin);
    }
}
