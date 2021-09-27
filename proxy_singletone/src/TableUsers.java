import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TableUsers implements UsersInformationTable{
    @Override
    public String[] getUsersInformation() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(new File("BD.txt")));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e){
            System.out.println("Error: " + e);
        }
        return list.toArray(new String[list.size()]);
    }
}
