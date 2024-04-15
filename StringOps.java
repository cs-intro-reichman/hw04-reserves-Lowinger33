public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("Hello World"));
        System.out.println(capVowelsLowRest("One two tHRee world"));
        System.out.println(camelCase("Hello World"));
        System.out.println(camelCase("   Intro   to     coMPUter    sCIEncE"));

    }

    public static String capVowelsLowRest(String string) {
        int n = string.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == 32) {
                ans = ans + string.charAt(i);
            }
            if (string.charAt(i) > 96 && string.charAt(i) < 123) {
                if (string.charAt(i) == 97 || string.charAt(i) == 101 || string.charAt(i) == 105
                        || string.charAt(i) == 111 || string.charAt(i) == 117) {
                    ans = ans + (char) (string.charAt(i) - 32);
                } else {
                    ans = ans + string.charAt(i);
                }
            }
            if (string.charAt(i) > 64 && string.charAt(i) < 91) {
                if (string.charAt(i) != 65 && string.charAt(i) != 69 && string.charAt(i) != 73 && string.charAt(i) != 79
                        && string.charAt(i) != 65) {
                    ans = ans + (char) (string.charAt(i) + 32);
                } else {
                    ans = ans + string.charAt(i);
                }
            }
        }
        return ans;
    }

    public static String camelCase(String string) {
        int i = 0;
        SkipSpace(string, i);
        i++;
        String ans = "";
        while (string.charAt(i) != 32) {
            if (string.charAt(i) > 64 && string.charAt(i) < 91) {
                ans = ans + (char) (string.charAt(i) + 32);
            } else {
                ans = ans + string.charAt(i);
            }
            i++;
        }
        for (int j = i; j < string.length(); j++) {
            if (string.charAt(j) > 64 && string.charAt(j) < 91) {
                ans = ans + (char) (string.charAt(j) + 32);
            }
            if (string.charAt(j) > 96 && string.charAt(j) < 123) {
                ans = ans + string.charAt(j);
            }
            if (string.charAt(j) == 32) {
                SkipSpace(string, j);
                j++;
                if (string.charAt(j) > 64 && string.charAt(j) < 91) {
                    ans = ans + string.charAt(j);
                } else {
                    ans = ans + (char) (string.charAt(j) - 32);
                }
            }

        }
        return ans;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }

    public static int SkipSpace(String string, int i) {
        while (string.charAt(i) == 32) {
            i++;
        }
        return i;
    }
}
