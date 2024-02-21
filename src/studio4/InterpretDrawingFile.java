package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		
		String[] n = in.nextLine().split(" ");
		
		String shapeType = n[0];
		int redComponent = Integer.parseInt(n[1]);
		int greenComponent = Integer.parseInt(n[2]);
	    int blueComponent = Integer.parseInt(n[3]);
	    boolean isFilled = Boolean.parseBoolean(n[4]);
	    
	    
	    System.out.println(isFilled);
	}
	
	
}
