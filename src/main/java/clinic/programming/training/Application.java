package clinic.programming.training;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println("Inside Application");
    }
    
    public int countWords(String words) {
    	String[] separateWords = StringUtils.split(words, ' ');
    	return (separateWords == null) ? 0 : separateWords.length;
    }

    public void greet() {
        ArrayList<String> greetings = new ArrayList<String>();
        greetings.add("Hello");

        for (String greeting : greetings) {
            System.out.println("Greetings" + greeting);
        }

    }

    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
        app.greet();
        int count = app.countWords("Let's test this out.");
        System.out.println("COUNT: " + count);
    }
}