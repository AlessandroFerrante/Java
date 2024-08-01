// Client

import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static void main(String[] args) {
        List<Files> files = List.of(
            new FileC("fileC1.c", "20/luglio/2024", "1.1KB"),
            new FileJava("fileJava1.java", "20/luglio/2024", "1.2KB")
        );

        List<Files> copyList = new ArrayList<>();
        for (Files file : files)
            copyList.add(file.clone());

        copyList.forEach(System.out::println);
        
        System.out.println("==========================================");

        FileCache registry = new FileCache();
        registry.put(files);
        System.out.println(registry.get("DPPrototype"));
        System.out.println(registry.get("fileC1.c"));
        System.out.println(registry.get("fileJava1.java"));

    }

}
