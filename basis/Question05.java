package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question05 {
	public static void main(String[] arge) throws IOException {

		try {
		
		//インスタンス生成
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader a = new BufferedReader(inputStreamReader);

		//メッセージ出力
		System.out.println("0～6の数字を入力してください");

		//キーボードから入力された数字をint型変数に格納
		int t = Integer.parseInt(a.readLine());

			//入力された数字と曜日が対応しているか判定
			switch (t) {
			case 0:
				System.out.println("日曜日");
				break;
			case 1:
				System.out.println("月曜日");
				break;
			case 2:
				System.out.println("火曜日");
				break;
			case 3:
				System.out.println("水曜日");
				break;
			case 4:
				System.out.println("木曜日");
				break;
			case 5:
				System.out.println("金曜日");
				break;
			case 6:
				System.out.println("土曜日");
				break;
			} 
	
	      } catch (NumberFormatException e) {
			System.out.println("数字以外が入力されました");
		}
		
	}
}