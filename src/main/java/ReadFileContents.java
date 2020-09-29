import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileContents {

    public static String getFileContents(String fileName){

        try{
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            StringBuffer sb = new StringBuffer();
            String line;

            while((line = br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }

            fr.close();
            return sb.toString();

        }catch(IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
