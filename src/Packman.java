import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Packman extends JPanel implements KeyListener{

	
	Player[] jugadores;
	int jugadorIndex;
	
	public Packman()
	{
		jugadores = new Player[10];
		jugadorIndex = 0;
		
		addKeyListener(this);
		
	}
	


	@Override
	public void paint(Graphics g) {

		super.paint(g);
		
		Graphics g2d = (Graphics2D) g;
		
		for(int i = 0; i<10;i++)
		{
			
			if(jugadores[i]!= null)
			{
				g2d.setColor(jugadores[i].getColor());
				g2d.fillRect(jugadores[i].getPosX(),jugadores[i].getPosY(),jugadores[i].getAncho(),jugadores[i].getAlto());
			}
			
		}
		
	}
	
	public void addPlayer(Player newPlayer)
	{
		
		jugadores[jugadorIndex] = newPlayer;
		jugadorIndex++;
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println( e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	public Player[] getJugadores() {
		return jugadores;
	}



	public void setJugadores(Player[] jugadores) {
		this.jugadores = jugadores;
	}


	
}