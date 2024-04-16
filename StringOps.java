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
        System.out.println(camelCase(" tWo    wordS"));
        int[] array = (allIndexOf("Hello world", 'l'));
        System.out.println(array[2]);

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
        String ans = "";
        String temp = "";
        int x = First(string);
        temp = string.substring(x);
        int i = 0;
        if (temp.charAt(i) > 64 && temp.charAt(i) < 91) {
            ans = ans + (char) (temp.charAt(i) + 32);
        } else {
            ans = ans + temp.charAt(i);
        }
        i++;
        while (temp.charAt(i) != 32) {
            if (temp.charAt(i) > 64 && temp.charAt(i) < 91) {
                ans = ans + (char) (temp.charAt(i) + 32);
            } else {
                ans = ans + temp.charAt(i);
            }
            i++;
        }
        temp = temp.substring(i);
        i = 0;
        while (i < temp.length()) {
            if (temp.charAt(i) == 32) {
                SkipSpace(temp, i);
                i++;
                if (temp.charAt(i) > 64 && temp.charAt(i) < 91) {
                    ans = ans + temp.charAt(i);
                    i++;
                } else {
                    ans = ans + (char) (temp.charAt(i) - 32);
                    i++;
                }
            } else {
                if (temp.charAt(i) > 64 && temp.charAt(i) < 91) {
                    ans = ans + (char) (temp.charAt(i) + 32);
                    i++;
                } else {
                    ans = ans + temp.charAt(i);
                    i++;
                }
            }
        }
        return ans;
    }

    public static int[] allIndexOf(String string, char chr) {
        int[] temp = new int[string.length()];
        int j = 0;
        for (int x = 0; x < string.length(); x++) {
            if (string.charAt(x) == chr) {
                temp[j] = x;
                j++;
            }
        }
        int i = 0;
        int length = 0;
        if (temp[0] == 0) {
            length++;
            i++;
        }
        while (i < string.length()) {
            if (temp[i] != 0) {
                length++;
            }
            i++;
        }
        int[] ans = new int[length];
        for (int x = 0; x < length; x++) {
            ans[x] = temp[x];
        }
        return ans;
    }

    public static int SkipSpace(String string, int i) {
        while (string.charAt(i) < 65) {
            i++;
        }
        return i;
    }

    public static int First(String string) {
        int i = 0;
        while (string.charAt(i) == 32) {
            i++;
        }
        return i;
    }
}
