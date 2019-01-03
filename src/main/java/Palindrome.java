public class Palindrome {
    int flag = 0;
    String reverse;

    public String reverseInput(String s) {
        // reverse the given String
        reverse = new StringBuffer(s).reverse().toString();
        return (reverse);
    }

    // check whether the string is palindrome or not
    public String checkpalindrome(String s) {
        reverse = new StringBuffer(s).reverse().toString();
        if (s.equals(reverse)) {

            flag = 1;
        }
        return (reverse);
    }
    public void main(String[] args) {
        if (flag==1)
        {
            System.out.println("It is a Palindrome");
        }
    }
}
