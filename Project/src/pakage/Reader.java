package pakage;

import java.io.*;
import java.util.LinkedList;

/**
 * @author VS
 */
public class Reader {

    protected String[][] output;
    protected int k;

    /**
     * @param input - путь до файла csv
     * @throws IOException
     */

    public Reader(String input) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(input));
        String line;
        LinkedList<String> linkedList = new LinkedList<>();
        int i = 0;
        while ((line = br.readLine()) != null) {
            i++;
            linkedList.add(line);
        }
        String[][] tmp = new String[i][1];
        for (int k = 0; k < i; k++) {
            for (int j = 0; j < 1; j++) {
                tmp[k][j] = linkedList.get(k);
            }
        }
        br.close();
        splitArray(tmp);
        this.k = i;
    }

    /**
     * @param tmp - Массив строк
     */

    private void splitArray(String[][] tmp) {
        output = new String[tmp.length][6];
        String count;
        String delimiter = ";";
        String[] out;
        for (int i = 0; i < tmp.length; i++) {
            count = tmp[i][0];
            out = count.split(delimiter);
            System.arraycopy(out, 0, output[i], 0, 6);
        }
    }

}