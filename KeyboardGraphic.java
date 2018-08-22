package keyboard;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class KeyboardGraphic extends JComponent
{
	private static final long serialVersionUID = 1L;
	int KEYSIZE = 47;
	public Graphics[] keySquare = new Graphics[47];
	KeyboardGraphic()
	{
		for(int numKeys = 0; numKeys < KEYSIZE; numKeys++)
			for (int row = 0; row <= 13; row++)
				keySquare[numKeys].drawRect(0,row* 94,92,92);
	}//end constructor KeyboardGraphic()
}
