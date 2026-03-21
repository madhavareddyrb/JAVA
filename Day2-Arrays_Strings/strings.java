public class strings {
  public static void main(String[] args){

    //1.Reverse String
    String name = "madhava";
    String reverseName = "";
    for (int i = name.length()-1; i >= 0; i--){
      reverseName += name.charAt(i);
    }
    System.out.println(reverseName);
  }
}
