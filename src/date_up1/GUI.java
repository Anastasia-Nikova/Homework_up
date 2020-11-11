package date_up1;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI 
{

	public static void main(String[] args) 
	{
		
		JFrame window = new JFrame();
		window.setBounds(100, 200, 800, 400);
		window.setVisible(true);
		window.setLayout(null);
		
		
		JLabel tabMonday = new JLabel( "Monday" );
		tabMonday.setBounds(50,20,100,30);
		window.add(tabMonday);
		
		JLabel tabTuesday = new JLabel( "Tuesday" );
		tabTuesday.setBounds(150,20,100,30);
		window.add(tabTuesday);
		
		JLabel tabWednesday = new JLabel( "Wednesday" );
		tabWednesday.setBounds(260,20,100,30);
		window.add(tabWednesday);
		
		JLabel tabThursday = new JLabel( "Thursday" );
		tabThursday.setBounds(370,20,100,30);
		window.add(tabThursday);
		
		JLabel tabFriday = new JLabel( "Friday" );
		tabFriday.setBounds(490,20,100,30);
		window.add(tabFriday);
		
		JLabel tabSaturday = new JLabel( "Saturday" );
		tabSaturday.setBounds(590,20,100,30);
		window.add(tabSaturday);
		
		JLabel tabSunday = new JLabel( "Sunday" );
		tabSunday.setBounds(700,20,100,30);
		window.add(tabSunday);
		
	
		int y = 50;
		int x = 20;
		JPanel [][] MondayPanels = new JPanel[7][6];
		for( int i = 0; i<MondayPanels.length; i++ )
		{
			y = 50;
			for( int k = 0; k<MondayPanels[i].length; k++ )
			{
				MondayPanels[i][k] = new JPanel();
				
				MondayPanels[i][k].setBounds(x,y,100,40);
				MondayPanels[i][k].setBackground(Color.pink);
				window.add(MondayPanels[i][k]);
				y += 50;
			}
			x += 110;
		}
		window.repaint();

	 }
}


