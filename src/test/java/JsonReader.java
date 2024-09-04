import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonReader {

    public static List<Map<String, String>> readJsonFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, String>> users = null;
        try {
            users = objectMapper.readValue(new File(filePath), new TypeReference<List<Map<String, String>>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
