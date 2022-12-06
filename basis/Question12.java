package test1;

import java.util.Scanner;

public class Question12 {
	public static void main(String args[]) {

		//Scanner生成
		try (Scanner scanner = new Scanner(System.in);) {

			System.out.println("1：氏名を入力する");
			System.out.println("2：氏名を入力しない"
					+ "");
			//メッセージ出力
			System.out.print("番号を選択してください（1,2）：");

			//メニュー番号の入力
			int inputNum = Integer.parseInt(scanner.nextLine());

			//if ((inputNum != 1) || (inputNum != 2)) {
			if (!(inputNum == 1) && !(inputNum == 2)) {//1,2以外の整数が入力された場合
				//メッセージ出力
				System.out.println("1～2の範囲で入力してください");
				return;
			}

			//氏名番号で分岐
			if (inputNum == 1) {//氏名が入力された場合
				//メッセージ出力
				System.out.print("氏名を入力してください\n氏名:");

				//キーボードから氏名の入力
				String input = scanner.nextLine();

				//入力された氏名をPersonインスタンスに設定
				Person person = new Person(input);

				//Personインスタンスの氏名を出力
				System.out.println("私の名前は" + " " + person.getName() + " " + "です");

			} else {//氏名が入力されない場合
				//"ダミー"をインスタンスに設定
				Person person = new Person("ダミー");

				//Personインスタンスの氏名を出力
				System.out.println("私の名前は" + " " + person.getName() + " " + "です");

			}

		} catch (NumberFormatException e) {
			//整数以外の値が入力された場合
			System.out.println("整数以外の値が入力されました");
		}

	}

}
