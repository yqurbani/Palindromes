public class PalindromeChecker {

    public boolean isPalindrome(String input) {
        String filtered = filterString(input);
        CustomStack stack = new CustomStack();
        CustomQueue queue = new CustomQueue();

        for (char c : filtered.toCharArray()) {
            stack.push(c);
            queue.enqueue(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.dequeue()) {
                return false;
            }
        }

        return true;
    }

    private String filterString(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}