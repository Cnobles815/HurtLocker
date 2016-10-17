/**
 * Created by christophernobles on 10/17/16.
 */
public class Parser {
    Main main = new Main();
    String raw = main.readRawDataToString();
    String[] altered;


    int  newlineCount = 0;

    public Parser() throws Exception {
    }

    public String returnRaw() throws Exception{
        raw = main.readRawDataToString();
        return raw;
    }

    public String upToHash(String input){
        altered = input.split("##");
        String section1 = altered[0];
        String section2 = altered[1];
        return section2;
    }

    public String listAll(String[] toList){
        return altered[0] +"\n" + altered[1];
    }
}
