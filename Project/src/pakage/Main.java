package pakage;

import java.io.IOException;

public class Main {
    /**
     * @param args - по умолчанию
     * @throws IOException исключение в связи с тех. необходимостями
     */
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader("name.csv");
        Staff[] staff = new Staff[reader.k - 1];
        int j = 1;
        int i = 0;
        while (i < staff.length) {
            staff[i] = new Staff(reader.output[j]);
            j++;
            i++;
        }
        System.out.println(staff[0].toString());
        System.out.println(staff[staff.length - 1].toString());
        ReaderTest readerTest = new ReaderTest();
        readerTest.TestRead();
    }
}
