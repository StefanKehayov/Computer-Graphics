package views;

import java.io.File;
import javax.swing.filechooser.FileFilter;


public class FileFilters extends FileFilter {
    @Override
    public boolean accept(File file) {
        if (file.isDirectory())
            return true;
        String s = file.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1)
            if (s.substring(i + 1).toLowerCase().equals("jpg") ||
                    s.substring(i + 1).toLowerCase().equals("png") ||
                    s.substring(i + 1).toLowerCase().equals("bmp") ||
                    s.substring(i + 1).toLowerCase().equals("gif") ||
                    s.substring(i + 1).toLowerCase().equals("proj"))
                return true;

        return false;
    }

    @Override
    public String getDescription() {
        return "Accepted proj ,img ,png ,bmp, gif files only.";
    }
}
