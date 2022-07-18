package test1;

import java.util.Scanner;

public class Question06 {

	public static void main(String args[]) {

		//Scanner生成
		Scanner scanner = new Scanner(System.in);

		System.out.println("本日の曜日番号を入力してください");

		try {
			//曜日の入力
			String input = scanner.nextLine();
			//String型からint型へ変換
			int weeknumber = Integer.parseInt(input);

			//入力された整数と曜日が対応するか判定
			String oneweek = null;
            //入力された整数と曜日が対応してるか判定
			switch (weeknumber) {
				case 0:
					oneweek = "日曜日";
					break;
				case 1:
					oneweek = "月曜日";
					break;
				case 2:
					oneweek = "火曜日";
					break;
				case 3:
					oneweek = "水曜日";
					break;
				case 4:
					oneweek = "木曜日";
					break;
				case 5:
					oneweek = "金曜日";
					break;
				case 6:
					oneweek = "土曜日";
					break;

				default://0～6以外の整数が入力された場合
					System.out.println("0～6の範囲で入力してください");
					 return;
			}
			System.out.println("本日は" + oneweek + "です");

		} catch (NumberFormatException e) {
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
			return;

		}
		//Scannerクローズ
		scanner.close();
	}
}