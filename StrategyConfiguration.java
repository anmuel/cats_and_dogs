import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StrategyConfiguration {
  public static Properties getProperties() {
    Properties prop = new Properties();
	  InputStream input = null;

    try {
    	input = new FileInputStream("config.properties");

    	// load a properties file
    	prop.load(input);
    } catch (IOException ex) {
    	ex.printStackTrace();
    } finally {
    	if (input != null) {
    		try {
    			input.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }

    return prop;
  }
}
