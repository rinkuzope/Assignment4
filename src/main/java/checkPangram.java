public class checkPangram {
    public static void main(String[] args) {
        String s = "Kaizoku ou ni ore wa naru";
        System.out.println("String is:" + s);
        System.out.println(isPangram(s.toLowerCase()));
    }

    private static boolean isPangram(String s) {

        if (s.length() < 26)
        {
            return false;
        }
        else
        {
            for (char i = 'a'; i <= 'z'; i++)
                if (s.indexOf(i) < 0)
                {
                    return false;
                }
        }
        return true;
    }

}

