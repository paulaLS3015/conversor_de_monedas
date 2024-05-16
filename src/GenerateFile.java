import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateFile {
    public void guardarJson(Badge badge) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter file = new FileWriter(badge.base_code()+".json");
        file.write(gson.toJson(badge));
        file.close();
    }
}
