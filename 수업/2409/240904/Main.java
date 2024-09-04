import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static List<String> getSplit(String argTxt, String argSep) {
        List<String> wordList = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        
        for (char c : argTxt.toCharArray()) {
            if (!String.valueOf(c).equals(argSep)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    wordList.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            wordList.add(word.toString());
        }
        return wordList;
    }

    public static String getJoin(List<String> argList, String argSep) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < argList.size(); i++) {
            result.append(argList.get(i));
            if (i < argList.size() - 1) {
                result.append(argSep);
            }
        }
        return result.toString();
    }

    public static List<Integer> randomSample(List<Integer> argSequence, int argK) {
        if (argSequence.size() < argK) {
            throw new IllegalArgumentException("リストの長さがサンプル数より少ないです。");
        }

        List<Integer> argSequenceCopy = new ArrayList<>(argSequence);
        List<Integer> sample = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < argK; i++) {
            int index = random.nextInt(argSequenceCopy.size());
            sample.add(argSequenceCopy.remove(index));
        }

        return sample;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-".repeat(30));
            System.out.println("1) 구구단 출력");
            System.out.println("2) 랜덤값 삼각형 출력");
            System.out.println("3) 종료");
            System.out.println("-".repeat(30));

            System.out.print("원하는 메뉴 번호를 입력하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 改行文字を消費する

            while (menu < 1 || menu > 3) {
                System.out.print("1~3 사이의 값을 입력하세요 : ");
                menu = scanner.nextInt();
                scanner.nextLine(); // 改行文字を消費する
            }

            if (menu == 1) {
                while (true) {
                    System.out.print("출력할 구구단을 입력하세요 (예: 2, 3~5) : ");
                    String guguInput = scanner.nextLine();
                    List<Integer> guguList;

                    if (guguInput.contains("~")) {
                        List<String> range = getSplit(guguInput, "~");
                        int start = Integer.parseInt(range.get(0));
                        int end = Integer.parseInt(range.get(1));
                        guguList = new ArrayList<>();
                        for (int i = start; i <= end; i++) {
                            guguList.add(i);
                        }
                    } else {
                        List<String> numbers = getSplit(guguInput, ",");
                        guguList = new ArrayList<>();
                        for (String num : numbers) {
                            guguList.add(Integer.parseInt(num));
                        }
                    }

                    boolean valid = true;
                    for (int num : guguList) {
                        if (num < 2 || num > 9) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid) {
                        for (int num1 : guguList) {
                            System.out.println("구구" + num1 + "단:");
                            for (int num2 = 1; num2 <= 9; num2++) {
                                System.out.printf("%d X %d = %2d%n", num1, num2, num1 * num2);
                            }
                            System.out.println();
                        }
                        break;
                    } else {
                        System.out.println("2~9의 숫자를 입력하세요.");
                    }
                }

            } else if (menu == 2) {
                System.out.print("몇 단의 숫자 피라미드로 출력할까요? (2 또는 3을 입력하세요): ");
                int high = scanner.nextInt();
                scanner.nextLine(); // 改行文字を消費する

                if (high == 2 || high == 3) {
                    int numK = high * (high + 1) / 2;
                    List<Integer> li1 = randomSample(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), numK);
                    int index = 0;

                    for (int i = 1; i <= high; i++) {
                        List<Integer> li2 = li1.subList(index, index + i);
                        List<String> li2Str = new ArrayList<>();
                        for (int num : li2) {
                            li2Str.add(Integer.toString(num));
                        }
                        String li3 = getJoin(li2Str, "");
                        System.out.printf("%" + (high - i + li3.length()) + "s%n", li3);
                        index += i;
                    }
                } else {
                    System.out.println("2 또는 3의 숫자를 입력하세요.");
                }

            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}
