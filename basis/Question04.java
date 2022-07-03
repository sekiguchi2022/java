package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04 {
	public static void main(String[] arge) throws IOException {

		try {
			//インスタンス生成
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			BufferedReader a = new BufferedReader(inputStreamReader);

			//メッセージ出力
			System.out.println("数字を入力してください");

			//キーボードから入力された数字を読み込みString型の変数に格納
			String str = a.readLine();

			//読み込んだ文字列をint型の変数に格納
			int ap1 = Integer.parseInt(str);
			
			//入力された数字で100を除算する
			int ap2 = 100 / ap1;
			
			//入力された数字で割り切れた場合
			System.out.println(ap2);

			//0で除算出来ない場合
		} catch (ArithmeticException e) {
			System.out.println("0で除算できません");
		
			//数字以外が入力された場合
		} catch (NumberFormatException e) {
			System.out.println("数字以外が入力されました");

		} //例外があってもなくても必ず実行する処理
		finally {
			System.out.println("終了");
		}
	}
}
