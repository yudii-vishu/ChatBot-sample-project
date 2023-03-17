package com.org.chatbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatBot extends JFrame {
	
	private JTextArea ca = new JTextArea();
	private JTextField cf = new JTextField();
	private JButton cb = new JButton();
	private JLabel cl = new JLabel();
	
	ChatBot(){
		
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.setSize(400, 400);
		jf.getContentPane().setBackground(Color.CYAN);
		jf.setTitle("ChatBot");
		jf.add(ca);
		jf.add(cf);
		ca.setSize(370, 310);
		ca.setLocation(1, 1);
		ca.setBackground(Color.BLACK);
		cf.setSize(300, 20);
		cf.setLocation(1, 320);
		jf.add(cb);
		cl.setText("SEND");
		cb.add(cl);
		cb.setSize(400, 20);
		cb.setLocation(300, 320);
		
		cb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(e.getSource()==cb) {
					String txt = cf.getText().toLowerCase();
					ca.setForeground(Color.GREEN);
					ca.append("You >>> "+txt+"\n");
					cf.setText("");
					
					if(txt.contains("hi") || txt.contains("hey") || txt.contains("hello")) {
						replyMeth("Hi there");
					} else if(txt.contains("how are you")) {
						replyMeth("I'm good :) thankyou for asking.What about you?");
					} else if(txt.contains("what is your name")) {
						replyMeth("I'm the trending GUDDU BHAIYAA :):)");
					} else if(txt.contains("gender") || txt.contains("are you boy or girl?")) {
						replyMeth("I'm Female.Don't try to Flirt with me you Fell in LOVE :)");
					} else if(txt.contains("love you")) {
						replyMeth("I'm Feeling shy :) Love You Too sweetheart :)");
					} else if(txt.contains("bye")) {
						replyMeth("To soon :( Anyways Byee STAY HOME STAY SAFE..!!");
					} else if(txt.contains("which season you like?")) {
						replyMeth("I like WINTER :) and what about you?");
					} else if(txt.contains("i'm good")) {
						replyMeth("Good to know you :)");
					}
					else {
						replyMeth("I can't understand sorry dear");
					}
				}
			}
		});
		
	}
	
	public void replyMeth(String s) {
		ca.append("Chatbot-->"+s+"\n");
	}

}
