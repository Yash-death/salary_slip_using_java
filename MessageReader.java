
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageReader {
    ResourceBundle bundle;
    Locale locale = new Locale("hi", "IN");
    
    MessageReader(){ 
    // Locale locale = new Locale("en", "US");
    bundle = ResourceBundle.getBundle("message",locale);
    }
    public Locale getLocale(){
        return  locale;
    }
    public String getMessage(String key){
        return bundle.getString(key);
    }
}
