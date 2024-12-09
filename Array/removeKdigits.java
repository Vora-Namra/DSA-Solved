import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        // Iterate through the digits of the number
        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);

            // Remove the top element if it's greater than the current digit and k > 0
            while (!st.isEmpty() && k > 0 && st.peek() > current) {
                st.pop();
                k--;
            }

            // Push the current digit onto the stack
            st.push(current);
        }

        // Remove any remaining digits if k > 0
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build the resulting string
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        // Reverse the string since the stack gives us digits in reverse order
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If the string is empty after removing leading zeros, return "0"
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
