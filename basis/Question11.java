package test1;

import java.util.Scanner;

public class Question11 {
	public static void main(String args[]) {

		//①Scanner生成
		try (Scanner scanner = new Scanner(System.in);) {

			//②メッセージ出力
			System.out.println("整数を入力してください");
			//③メッセージ出力
			System.out.print("1個目:");
			//④1つ目の整数の入力
			int inputOne = Integer.parseInt(scanner.nextLine());
			//⑤メッセージ出力
			System.out.print("2個目:");
			//⑥2つ目の整数の入力
			int inputTwo = Integer.parseInt(scanner.nextLine());

			//⑦multiplicationメソッドの呼び出し
			int ans1 = multiplication(inputOne, inputTwo);

			//⑫divisionメソッドの呼び出し
			int ans2 = division(inputOne, inputTwo);

			//⑪掛け算結果を出力
			System.out.println(inputOne + " " + "と" + " " + inputTwo + " " + "の掛け算結果の値は" + " " + ans1 + "です");
			//⑯掛け算結果を2で割った結果を出力
			System.out.println(inputOne + " " + "と" + " " + inputTwo + " " + "の掛け算結果を2で割った値は" + " " + ans2 + "です");

		} catch (NumberFormatException e) {
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");

		}
	}

	//⑧⑦より呼び出されたメソッド
	public static int multiplication(int inputOne, int inputTwo) {
		//⑨掛け算処理
		int ans1 = inputOne * inputTwo;
		//⑩掛け算結果を25行目右辺に返す
		return ans1;

	}

	//⑬⑫より呼び出されたメソッド
	public static int division(int inputOne, int inputTwo) {
		//⑭掛け算結果を2で割る
		int ans2 = inputOne * inputTwo / 2;
		//⑮⑭の結果を26行目の右辺に返す
		return ans2;
	}
}
