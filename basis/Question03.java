package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03 {
	public static void main(String[] args) throws IOException {
		//インスタンス生成
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		//四角形を構成する縦横の数を入力
		System.out.print("1辺の・の個数：");

		//コンソールから入力された数値をint型の変数に格納
		int max = Integer.parseInt(a.readLine());

		//四角形の縦列横列の・の制御
		for (int tate = 0; tate < max; tate++) {
			for (int yoko = 0; yoko < max; yoko++) {
				System.out.print(tate == yoko ? "＊" : "・");

			}
			System.out.println();
		}
	}
}
