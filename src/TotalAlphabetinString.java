public class TotalAlphabetinString {

        public static void main(String[] args){
            String s = "Java is important computer Language";
            // create sentence
            int totalcount =s.length();
            // find specific Alphabet in sentence
            int totalcount_findalphabet=s.replace("a","").length();
            int count=totalcount-totalcount_findalphabet;
            System.out.println("Total Number of a is :" +count);
        }
}
