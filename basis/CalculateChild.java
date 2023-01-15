package test1;

//CalculateSuperをCalculateChildが継承
public class CalculateChild extends CalculateSuper {
	//mainクラスのnum1,num2に設定された整数をCalculateChildのint型のnum1、num2に設定
	public CalculateChild(int num1, int num2) {

		//親クラスのCalculateSuperを呼び出す
		super(num1, num2);

	}

	protected void flow() {

        //引き算処理呼び出し
		subtraction();
		//足し算処理呼び出し
		sum();
	}
}
