/***************************************************************************************
 *   *********************************************************************************
 *
 *     Jamison Czech
 *     Assignment #2
 *     Due September 20th, 2017
 *
 *    Asg 2 for ICS 462 – Linked Lists
 *    Program creates an ordered linked list and outputs list to a text file named
 *    Asg2Data_out.txt by the ordered elements of the linked list.
 *
 ***************************************************************************************/


public class Main {

    public static void main(String[] args) {
        int i;
        String iFile;
        String oFile;
        FileIO fileIO = new FileIO();

        /**
         * process file, choose file, and outputs file Asg2Data_out.txt
         * in a ordered linked list of elements
         */
        iFile = fileIO.chooseFile();
        if (iFile != null) {
            i = iFile.lastIndexOf('.');
            if (i >= 0)
                oFile = iFile.substring(0, i) + "_out" + iFile.substring(i);
            else
                oFile = iFile + "_out";
            fileIO.processFile(iFile, oFile);
        }

        System.out.println(iFile);//display file location


    }
}
