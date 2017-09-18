import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */
public class FileIO {
    public static String chooseFile() {

        JFileChooser chooser;
        String fileName;
        FileNameExtensionFilter filter;
        int r;

        fileName = null;
        chooser = new JFileChooser();
        filter = new FileNameExtensionFilter("Text Files", "dat", "txt");
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(new File("."));
        r = chooser.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION)
            fileName = chooser.getSelectedFile().getAbsolutePath();

        return (fileName);

    }

    public static void processFile(String iFile, String oFile) {

        int i;
        BufferedReader iBuffer;
        String iLine;
        FileReader iReader;
        int lineNumber;
        BufferedWriter oBuffer;
        FileWriter oWriter;
        String[] values;
        OrderedList orderedList = new OrderedList();

        lineNumber = 0;
        try {
            iReader = new FileReader(iFile);
            iBuffer = new BufferedReader(iReader);

            oWriter = new FileWriter(oFile);
            oBuffer = new BufferedWriter(oWriter);

            for (lineNumber = 1; ; lineNumber++) {
                iLine = iBuffer.readLine();
                if (iLine == null)
                    break;
                values = iLine.split(" +");
                orderedList.addElement(new OrderedItem(values[0], Integer.parseInt(values[1]), null));

            }

            while (!(orderedList.isEmpty())) {
                OrderedItem item = (OrderedItem) orderedList.remove();
                String name = "Name = " + item.Name;
                oBuffer.write(name);
                oBuffer.newLine();

                String priority = "Priority = " + item.Priority;
                oBuffer.write(priority);
                
                oBuffer.newLine();
                oBuffer.newLine();
            }

            iBuffer.close();
            oBuffer.close();

        } catch (Exception e) {
            System.err.println("Reading failed at line " + lineNumber);
            e.printStackTrace(System.err);
        }
    }
}
