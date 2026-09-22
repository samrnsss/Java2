//for a given string convert each the first letter of each word to uppercase 
// hi, i am aashna
public class Qs02 {
    public static String toUppercase (String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i =1 ; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                //to return uppercase of the next character
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am aashna";
        System.out.println(toUppercase(str));
    }
}

