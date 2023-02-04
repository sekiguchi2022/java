package test1;

//public class CalculateImpl
public class CalculateImpl implements Calculate {

	public int multiplication(int num1, int num2) {
		//入力された2つ整数を掛け算
		int ans1 = num1 * num2;

		//引数の掛け算結果をmainクラスに返す
		return (ans1);
	}

	public int division(int num1, int num2) {

		int ans1 = 0;
		//掛け算結果を2で割る
		int ans2 = ans1 / 2;

		//引数の掛け算結果を2で割った結果をmainクラスに返す
		return (ans2);
	}
}
