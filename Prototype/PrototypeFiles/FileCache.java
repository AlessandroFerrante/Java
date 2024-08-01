import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileCache {
    private final Map<String, Files> cache = new HashMap<>();     

    public FileCache() {
        FileJava fileJava = new FileJava("DPPrototype", "23/07/2024", "1KB");
        FileC fileC = new FileC("Socket", "23/07/2024", "2KB");

        cache.put("DPPrototype", fileJava );
        cache.put("Socket", fileC);
    }

    public Files get(String key){
        return cache.get(key).clone();
    }

    public void put(List<Files> files) {
        files.forEach(file -> cache.put(file.getFilename(), file));
    }
}
