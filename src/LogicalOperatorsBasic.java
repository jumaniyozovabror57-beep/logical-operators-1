public class LogicalOperatorsBasic {
    public static void main(String[] args) {
        System.out.println("=== AND (&&) Operator — both must be true ===");
        boolean hasTicket = true, isOldEnough = false;
        System.out.println("Has ticket: " + hasTicket + " | Is old enough: " + isOldEnough);
        System.out.println("Can enter (&&): " + (hasTicket && isOldEnough));

        System.out.println("\n=== OR (||) Operator — at least one true ===");
        boolean hasCash = false, hasCard = true;
        System.out.println("Has cash: " + hasCash + " | Has card: " + hasCard);
        System.out.println("Can pay (||): " + (hasCash || hasCard));

        System.out.println("\n=== NOT (!) Operator ===");
        boolean isRaining = true;
        System.out.println("Is raining: " + isRaining);
        System.out.println("Is NOT raining: " + !isRaining);

        System.out.println("\n=== Full Truth Table ===");
        boolean[] vals = {true, false};
        System.out.printf("%-6s %-6s | AND   | OR    | NOT A%n", "A", "B");
        System.out.println("-------+-------+-------+------");
        for (boolean a : vals)
            for (boolean b : vals)
                System.out.printf("%-6b %-6b | %-5b | %-5b | %-5b%n", a, b, a&&b, a||b, !a);

        // Short-circuit evaluation
        System.out.println("\n=== Short-Circuit Evaluation ===");
        int x = 0;
        boolean result = (x != 0) && (10 / x > 1);  // Safe: right side not evaluated
        System.out.println("(x!=0) && (10/x>1) = " + result + " — no division by zero!");
    }
}
