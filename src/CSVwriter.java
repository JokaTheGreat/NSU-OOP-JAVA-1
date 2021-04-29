import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class CSVwriter {
    public static void print(FileWriter output, Map<String, Integer> sortedMap, int totalWords) throws IOException {
        Iterator<Map.Entry<String, Integer>> itr = sortedMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            output.write(entry.getKey() + "," + entry.getValue() + "," + Math.ceil((double)entry.getValue() / totalWords * 100 * 100) / 100 + "%\n");
        }
        output.close();
    }
}
