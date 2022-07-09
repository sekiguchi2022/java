package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question02 {
	public static void main(String[] args) throws IOException {

		//キーボードからの数値入力
		System.out.println("整数を入力してください");
		//インスタンス生成
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = a.readLine();
			int m = Integer.parseInt(str);

			//コンソールから入力された数値を読み込みint型変数に格納
			//int m = Integer.parseInt(a.readLine());

			//偶数か奇数判定
			if (m % 2 == 0) {
				System.out.println("偶数です");
			} else {
				System.out.println("奇数です");
			}
		} catch (NumberFormatException e) {

			System.out.println("整数以外が入力されました");

		}
	}
}
