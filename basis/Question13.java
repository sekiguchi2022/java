package test1;

import java.util.Scanner;

public class Question13 {
	public static void main(String args[]) {

		//Scanner生成
		try (Scanner scanner = new Scanner(System.in);) {
			//①足し算結果⇒引き算結果のメッセージ出力
			System.out.println("1：足し算結果⇒引き算結果の順で出力する");
			//②引き算結果⇒足し算結果のメッセージ出力
			System.out.println("2：引き算結果⇒足し算結果の順で出力する");

			//③キーボード入力受付メッセージ出力
			System.out.print("番号を選択してください（1,2）：");

			//④メニュー番号受付_1,2
			int input = Integer.parseInt(scanner.nextLine());

			//1,2以外の整数が入力された場合
			if (!(input == 1) && !(input == 2)) {
				//メッセージ出力
				System.out.println("1～2の範囲で入力してください");

				return;

			}

			//整数入力促しメッセージ
			System.out.println("整数を入力してください");

			System.out.print("1個目:");
			//メニュー番号の入力
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.print("2個目:");
			//メニュー番号の入力
			int num2 = Integer.parseInt(scanner.nextLine());

			//キーボードから入力される整数(1,2)によって計算処理分岐
			if (input == 1) {//1の場合

				CalculateSuper calculateSuper = new CalculateSuper(num1, num2);
				//sumメソッド呼び出し
				calculateSuper.flow();

			} else if (input == 2) {//2の場合

				CalculateChild calculateChild = new CalculateChild(num1, num2);
				//subtractionメソッド呼び出し
				calculateChild.flow();

			}
		} catch (NumberFormatException e) {
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		}
	}
}
