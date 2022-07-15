package test1;

import java.util.Scanner;

public class 新Question4 {
	public static void main(String args[]) {
		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		System.out.println("2つの文字列を入力してください");

		while (true) {
			//メッセージ出力
			System.out.println("1個目");

			//一つ目の文字列を入力
			String input1 = scanner.nextLine();

			//メッセージ出力
			System.out.println("2個目");

			//二つ目の文字列を入力
			String input2 = scanner.nextLine();

			if (input1.equals("") || input2.equals("")) {
				System.out.println("空白が入力されています");

				continue;
			}
			if (!input1.equals(input2)) {

				System.out.println("違う文字列です");

				continue;
			}
			if (input1.equals(input2)) {
				System.out.println("同じ文字列です");

				break;
			}

		}
	}
}
