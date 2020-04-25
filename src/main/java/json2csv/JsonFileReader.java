package json2csv;

import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;

class JsonFileReader{

    public JsonFileReader(){
    }

    public String read(File file){
        if (file == null) return "";

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(file.toPath())) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e); 
        }
        return sb.toString();
    }
}
