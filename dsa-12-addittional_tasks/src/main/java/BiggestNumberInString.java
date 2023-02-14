public class BiggestNumberInString {

    public static void main(String[] args) {

        String str = "100klh564abc365bg";
       // System.out.println(extractMaximum(str));
        biggestNumber(str);

    }

    static int extractMaximum(String str) {
        int num = 0, res = 0;
        // Start traversing the given string
        for (int i = 0; i<str.length(); i++) {
            // If a numeric value comes, start converting it into an integer till there are consecutive numeric digits
            if (Character.isDigit(str.charAt(i)))
                num = num * 10 + (str.charAt(i)-'0');
                // Update maximum value
            else {
                res = Math.max(res, num);
                // Reset the number
                num = 0;
            }
        }
        // Return maximum value
        return Math.max(res, num); //returning max of those 2 numbers
    }

    static void biggestNumber(String s){
        for(char each:s.toCharArray()){
            if(Character.isLetter(each)){
                s=s.replace(each, '/');
            }
        }

        String[] arr=s.split("/");
        int max=0;
        for(String each: arr){
            try{
                if(Integer.parseInt(each)>max){
                    max=Integer.parseInt(each);
                }
            }catch (RuntimeException e){
            }

        }
        System.out.println(max);
    }


}
