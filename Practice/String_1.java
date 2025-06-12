import java.util.*;

public class String_1 {
    public static void userName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email");
        String email = sc.nextLine();
        String userName = email.substring(0, email.indexOf("@"));
        System.out.println(userName);
    }

    public static void reverseString(StringBuilder sb) {
        for (int i = 0; i < sb.length() / 2; i++) {
            int first = i;
            int last = sb.length() - i - 1;
            char firstChar = sb.charAt(first);
            char lastChar = sb.charAt(last);
            sb.setCharAt(first, lastChar);
            sb.setCharAt(last, firstChar);

        }
        System.out.println(sb);

    }

    public static void upperCase(String str) {
        String upperCaseString = "";
        int i;
        if (str.charAt(0) != ' ') {
            upperCaseString += Character.toUpperCase(str.charAt(0));
            i = 1;
        } else {
            i = 0;
        }

        for (i = i; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                upperCaseString += str.charAt(i);
                i++;
                if (i < str.length()) {
                    upperCaseString += Character.toUpperCase(str.charAt(i));
                }
            } else {
                upperCaseString += str.charAt(i);
            }
        }

        System.out.println(upperCaseString);
    }

    public static void stringCompression(StringBuilder sb) {
        // aabbccd => a2b2c3d
        String compressedString = "";
        for (int i = 0; i < sb.length(); i++) {
            int count = 1;
            while (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) { // i+1 tab hi check krna jab sb.lentgth se
                                                                              // chota ho
                count++;
                i++;
            }
            compressedString += sb.charAt(i) + Integer.toString(count);
        }
        System.out.println(compressedString);
    }

    public static void getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'W') {
                x--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                System.out.println("Wrong direction detected");
                break;
            }
        }

        Math.sqrt(y);
        double shortestPath = Math.sqrt(x * x + y * y);
        System.out.println("Shortest Path is: " + shortestPath);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        String path = "WNEENESENNN";
        getShortestPath(path);

    }
}
