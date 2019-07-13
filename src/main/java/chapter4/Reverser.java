package chapter4;

public class Reverser {
    public String reverse(String input) {
        CharStack stack = new CharStack(input.length());
        input.chars()
                .mapToObj(c -> (char) c)
                .forEach(stack::push);

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
