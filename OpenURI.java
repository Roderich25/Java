import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;

public class OpenURI {

    public static void main(String[] args) throws Exception {
        
        //Create Desktop object
        Desktop desktop = Desktop.getDesktop();
        
        String google = "https://www.google.com.mx/search?q=";
        String params = URLEncoder.encode("Machine Learning");
        URI uri = new URI(google+params);        
        desktop.browse(uri);
        
    }
    
}
