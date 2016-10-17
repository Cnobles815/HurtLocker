/**
 * Created by christophernobles on 10/17/16.
 */
public class Parser {
    Main main = new Main();
    String raw = main.readRawDataToString();
    String altered;

    int  newlineCount = 0;

    public Parser() throws Exception {
    }

    public String returnRaw() throws Exception{
        raw = main.readRawDataToString();
        return raw;
    }

    public String upToHash(String input){
        String rawStub = "";
        String[] rawArray = raw.split("##");
        String section1 = rawArray[0];
        for(int i = 0; i < rawArray.length; i++){
            rawStub += rawArray[i];
        }
        return section1;
    }
}
