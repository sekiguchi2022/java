package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07 {
	public static void main(String[] args) throws IOException {

		//1.BufferedReaderクラスのインスタンスの宣言
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		//1-1.メッセージ出力
		System.out.println("整数を昇順で並べ替えます");

		//2.int型の要素を５つ持った空配列を宣言
		int array[] = new int[3];

		//2-1.入力させるメッセージ出力
		System.out.println("5個の整数を入力してください");

		//3.配列へのループ処理
		for (int i = 0; i < array.length; i++) {

			//3-1./メッセージ出力
			System.out.print((i + 1) + "個目の整数:");

			//3-2コンソールから入力された文字列をint型に変換後変数inputNumに代入
			int inputNum = Integer.parseInt(bufferedReader.readLine());

			//3-3.3-2で入力された数字を、2.で宣言したint型配列へ代入
			array[i] = inputNum;
		}
		//3-4.メッセージ出力
		System.out.println("昇順で並べ替え");

		//4.配列要素の昇順ソート（バブルソート）処理
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int irekae = array[j];
					array[j] = array[j + 1];
					array[j + 1] = irekae;
				}
			}
		}
		//4-1.最大値最小値の数字をint型の変数に代入
		int max = array[0];
		int min = array[0];

		//5.配列要素出力ループ処理
		for (int num : array) {
			System.out.println(num);

			//5-1.最大値を求める処理
			max = Math.max(max, num);
			//5-2.最小値を求める処理
			min = Math.min(min, num);

		}

		//6.最大値と最小値を出力
		System.out.print("最大値は" + max + "で、最小値は" + min + "です");

	}

}