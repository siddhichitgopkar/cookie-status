import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cookieStatus {
    private static final String link = "https://apps.auxiliary.uga.edu/Dining/BuildYourPlate//nutrition/viewMenu/bolton";
    public static void main (String args[]) {
	try {
	    URL menu = new URL(link);
	    URLConnection page = menu.openConnection();
	    BufferedReader in = new BufferedReader (new InputStreamReader(page.getInputStream(), "UTF-8"));
	    String inputLine;
	    StringBuilder a = new StringBuilder();
	    while ((inputLine = in.readLine()) != null)
		a.append(inputLine);
	    in.close();
	    
	    System.out.println(a.toString());
	} catch (IOException e) {
	    e.printStackTrace();
	} //try
    } //main
} //cookieStatus
