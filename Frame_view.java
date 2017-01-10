package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;


public class Frame_view extends Frame implements ActionListener,WindowListener{

	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private TextField text3 = new TextField("",10);
	private TextField text4 = new TextField("",10);
	private TextField text5 = new TextField("",10);
	private TextField text6 = new TextField("",10);
	
	
	//１０文字分のスペースを確保した↑
	private Button button1 = new Button("演算");
	
	public Frame_view(){
		//上から順番にウィンドウに作られるから、add(text3)がbutton1の
		addWindowListener(this);
		setTitle("FrameTest");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("足し算答え"));

		//button1とは、ボタンのインスタンスのこと
		button1.addActionListener(this);
		add(text3);
		add(new Label("引き算答え"));
		add(text4);
		add(new Label("かけ算答え"));
		add(text5);
		add(new Label("わり算答え"));
		add(text6);
	}
	

	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1, val2);
		text3.setText(String.valueOf(clib.getPlus()));
		text4.setText(String.valueOf(clib.getMinus()));
		text5.setText(String.valueOf(clib.getProduct()));
		text6.setText(String.valueOf(clib.getDivide()));
		
	}


}
