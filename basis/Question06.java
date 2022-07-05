package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06 {
	public static void main(String[] args) throws IOException {

		//1.BufferedReaderクラスのインスタンスの宣言
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader a = new BufferedReader(inputStreamReader);

		//2.String型の要素を5つ持った空配列を宣言
		String array[] = new String[5];

		//3.配列への入力ループ処理（for文のループ条件式は配列の要素の数となる）
		for (int i = 0; i < array.length; i++) {

			//3-1.「文字を入力してください●個目：」のメッセージを出力
			System.out.print("文字を入力してください" + (i + 1) + "個目:");

			//3-2.コンソールから文字列を入力
			String str = a.readLine();

			//3-3.3-2で入力された文字列を、２で宣言したString配列へ代入
			array[i] = str;
		}
		//4.メッセージ出力（入力された文字は）
		System.out.print("入力された文字は");

		//5.配列の出力ループ処理
		for (String t : array) {

			System.out.print(t + " ");
		}

	}
}