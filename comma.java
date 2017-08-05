public class comma {


public static void main(String[] args){


List<String> str = new ArrayList<String>();
      
      str.add("One");
      str.add("Two");
      str.add("Three");
      str.add("Four");
      str.add("Five");
      
      
      for(String s: str){
      System.out.println(StringUtils.join(s,", "));
      
      }

}

}
