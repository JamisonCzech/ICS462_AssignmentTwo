import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        int i;
        String iFile;
        String oFile;
        FileIO fileIO = new FileIO();

        iFile = fileIO.chooseFile();
        if (iFile != null) {
            i = iFile.lastIndexOf('.');
            if (i >= 0)
                oFile = iFile.substring(0, i) + "_out" + iFile.substring(i);
            else
                oFile = iFile + "_out";
            fileIO.processFile(iFile, oFile);
        }
        System.out.println(iFile);


    }
}
