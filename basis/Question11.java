package test1;

import java.util.Scanner;

public class Question11 {
	public static void main(String args[]) {

		//Scanner生成(自動close）
		try (Scanner scanner = new Scanner(System.in);) {

			//メッセージ出力
			System.out.println("整数を入力してください");

			System.out.print("1個目:");
			//1つ目の整数を入力および変換後int型変数に格納
			int input1 = Integer.parseInt(scanner.nextLine());

			System.out.print("2個目:");
			//2つ目の整数を入力および変換後int型変数に格納
			int input2 = Integer.parseInt(scanner.nextLine());

			//引数の掛け算を呼び出すメソッド
			multiplication(input1, input2);

			int ans1 = input1 * input2;

			//掛け算の結果を2で割るためのメソッドを呼び出す
			division(input1, input2);

			int ans2 = input1 * input2 / 2;

			//入力された整数を掛け算した結果を出力
			System.out.println(input1 + " " + "と" + " " + input2 + " " + "の掛け算結果は" + " " + ans1 + " " + "です");

			//掛け算結果を2で割った結果を出力
			System.out.println(input1 + " " + "と" + " " + input2 + " " + "の掛け算結果を2で割った値は" + " " + ans2 + " " + "です");

		} catch (NumberFormatException e) {
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		}
	}

	//23行目multiplicationメソッドより呼び出されたメソッド
	public static int multiplication(int input1, int input2) {

		//1つ目と2つ目の整数を掛け算しans1へ格納
		//int ans1 = input1 * input2;

		//掛け算結果を返す
		return input1 * input2;
	}

	//26行目divisionメソッドより呼び出されたメソッド
	public static int division(int input1, int input2) {

		//debug
		//System.out.println(ans2);

		//掛け算結果を2で割る
		//int ans2 = input1 * input2 / 2;

		return input1 * input2 / 2;
	}
}
