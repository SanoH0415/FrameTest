package frametest;
//ウィンドウをつくって、それに閉じる×のような機能やタイトルをいれた。大きさを決めている。
public class Frame_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame_view frame = new Frame_view();
		frame.setBounds(5,5,655,455);
		//幅655 高さ455
		frame.setVisible(true);
		
	}

}
