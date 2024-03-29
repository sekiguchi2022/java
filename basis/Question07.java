package test1;

import java.util.Scanner;

public class Question07 {
	public static void main(String args[]) {

		try {
			//Scanner生成
			Scanner scanner = new Scanner(System.in);

			//メッセージ出力
			System.out.println("整数の数を入力してください");

			//入力された整数を変換後int型変数に格納
			int inputNum = Integer.parseInt(scanner.nextLine());

			//入力された整数をint型配列arrayに格納
			int[] array = new int[inputNum];

			//入力された整数が0以下か判定
			if (inputNum <= 0) {

				System.out.println("整数の数は0より大きい値を入力してください");
				//処理を終えるため
				return;
			}

			System.out.println("整数の各値を入力してください");

			//入力された整数の数に応じてループ
			for (int i = 0; i < array.length; i++) {

				//入力された整数に従い個数に1加算
				System.out.print((i + 1) + "個目:");

				//入力された整数をint型に変換しarray配列に格納
				array[i] = Integer.parseInt(scanner.nextLine());

			}
			int sum = 0;
			//メッセージ出力
			System.out.print("入力された数は");
			//配列の中の整数を順に取り出す
			for (int num : array) {
				//整数の間に半角スペースを空ける
				System.out.print(num + " ");

				sum += num;

			}
			//メッセージ出力
			System.out.println("です");
			//入力された値の平均を出力
			System.out.println("入力された整数の平均は" + (sum / array.length) + "です");

			//scannerクローズ
			scanner.close();

		} catch (NumberFormatException e) {
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");

		}

	}
}