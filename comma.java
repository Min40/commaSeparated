import java.util.ArrayList;
import java.util.List;


public class comma {


public static void main(String[] args){


List<String> cities = Arrays.asList("Milan", 
                                    "London", 
                                    "New York", 
                                    "San Francisco");
		
String citiesCommaSeparated = String.join(",", cities);
 
System.out.println(citiesCommaSeparated);

}

}
