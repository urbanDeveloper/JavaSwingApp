package gui;
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class PersonFileFilter extends FileFilter {

	@Override
	public boolean accept(File file) {
		
		// returns the directory components.
		if (file.isDirectory()) {
			return true;
		}

		String name = file.getName();
		String extention = Utils.getFileExtention(name);

		if (extention == null) {
			return false;
		}

		if (extention.equals("per")) {
			return true;
		}

		return false;
	}

	@Override
	public String getDescription() {
		return " Person database files (*.per)";
	}

}
