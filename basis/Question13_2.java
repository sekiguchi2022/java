package test1;

import java.util.Scanner;

public class Question13_2 {

	public static void main(String args[]) {

		//Scanner生成
		try (Scanner scanner = new Scanner(System.in);) {

			//メッセージ出力
			System.out.println("1：足し算結果⇒引き算結果の順で出力する");
			System.out.println("2：引き算結果⇒足し算結果の順で出力する");

			//キーボード入力受付
			int input = Integer.parseInt(scanner.nextLine());

			if (input == 1 && input == 2) {//入力された整数が、1でも2でもない場合

				//メッセージ出力
				System.out.println("1～2の範囲で入力してください");

				//処理終了
				return;

			}

			//メッセージ出力
			System.out.println("整数を入力してください");

			//1個目の整数入力
			System.out.println("1個目：");
			int num1 = Integer.parseInt(scanner.nextLine());

			//2個目の整数入力
			System.out.println("2個目：");
			int num2 = Integer.parseInt(scanner.nextLine());

			//1か2が入力された場合処理分岐
			if (input == 1) {//1が入力された場合

				//(親)CalculateSuperクラスからflowメソッド呼び出し(sum())
				CalculateSuper calculateSuper = new CalculateSuper(num1, num2);
				//sum()メソッド呼び出し
				calculateSuper.flow();

			} else if (input == 2) {//2が入力された場合
				//(子)CalculateChildクラスからflowメソッド呼び出し(subtraction())
				CalculateChild calculateChild = new CalculateChild(num1, num2);

				//subtraction()メソッド呼び出し
				calculateChild.flow();
			}
		} catch (NumberFormatException e) {//例外処理
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		}
	}
}