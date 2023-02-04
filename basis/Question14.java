package test1;

import java.util.Scanner;

public class Question14 {
	public static void main(String args[]) {

		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		//メッセージ出力
		System.out.println("整数を入力してください");

		//1個目の整数入力
		System.out.print("1個目:");
		int num1 = Integer.parseInt(scanner.nextLine());
		//2個目の整数入力
		System.out.print("2個目:");
		int num2 = Integer.parseInt(scanner.nextLine());

		//CalculateImplをインスタンス生成
		CalculateImpl calculateImpl = new CalculateImpl();

		//CalculateImplインスタンスのmultiplicationメソッドを呼び出す
		calculateImpl.multiplication(num1, num2);

		//CalculateImplインスタンスのdivisionメソッドを呼び出す
		calculateImpl.division(num1, num2);

		//掛け算結果を出力
		System.out.println(num1 + " と " + num2 + " の掛け算結果の値は " + (num1 * num2) + " です");

		//掛け算結果を2で割った結果を出力
		System.out.println(num1 + " と " + num2 + " の掛け算結果の値は " + (num1 * num2 / 2) + " です");

	}

}
