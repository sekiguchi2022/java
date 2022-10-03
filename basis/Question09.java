import java.util.Scanner;

public class Question09 {
	public static void main(String args[]) {

		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		System.out.println("5つの整数を入力してください");

		int input = 0;

		//入力された整数を変換後int型変数に格納
		input = Integer.parseInt(scanner.nextLine());

		//入力された整数をint型配列に格納
		int[] array = new int[input];


		//入力された5つの整数分のループ
		for (int i = 0; i < 5; i++) {

			//入力された整数に従い個数に1加算
			System.out.print((i + 1) + "個目:");

			array[i] = Integer.parseInt(scanner.nextLine());

		}

	}

}
