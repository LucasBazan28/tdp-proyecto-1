package launcher;
import gui.SimplePresentationScreen;
import entities.*;
public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            		SimplePresentationScreen frame; 
            		Student Lucas;
            		
            		Lucas = new Student(135035, "Bazan", "Lucas", "LucasBazan28@gmail.com", "https://github.com/LucasBazan28", "/images/Bazan Perfil.png");
            		frame = new SimplePresentationScreen(Lucas);
            		frame.setVisible(true);
            	}
            	catch(Exception e) {
            		e.printStackTrace();
            	}
            }
        });
    }
}