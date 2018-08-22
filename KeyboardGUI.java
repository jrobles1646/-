package keyboard;
import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class KeyboardGUI extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static Scanner input;

	public static void main(String[] args)
	{
		char letter;
		JFrame frame = new JFrame();
		input = new Scanner(System.in);
		while (true)
		{
		System.out.print("Enter a character to convert to cyrillic: ");
		
		letter = input.next().charAt(0);
		letter = QWERTYtoJCUKEN.QWERTYtoJCUKEN(letter);
		System.out.printf("%c\n", letter);
		}
		
	}
}
