package ArrayProblems;

/** LongestPalindromicSubstring **/
public class  ManachersAlgoForLPS{

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // Transform the input string to include '#'
        StringBuilder modifiedString = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            modifiedString.append(c).append('#');
        }

        int n = modifiedString.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        int maxLen = 0, maxCenter = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Attempt to expand palindrome centered at i
            int a = i + (1 + p[i]);
            int b = i - (1 + p[i]);

            while (a < n && b >= 0 && modifiedString.charAt(a) == modifiedString.charAt(b)) {
                p[i]++;
                a++;
                b--;
            }

            // If palindrome centered at i expands past right,
            // adjust center and right position
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Update the longest palindrome information
            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(input));
    }
}

