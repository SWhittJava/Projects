public class Towers {
    // Solution to the Towers of Hanoi game.
    private int numDiscs;    // Number of discs

    // Constructor param: the number of discs to use
    // Constructor calls the recursive method
    public Towers(int n) {
        this.numDiscs = n;
        // Move all discs from peg 1 to peg 3, using peg 2 as temporary
        moveDiscs(this.numDiscs, 1, 3, 2);
    }

    // The moveDiscs method displays each disc move via recursion
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            // 1) move top (num−1) discs from “from” to “temp”
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);

            // 2) move the bottom disc from “from” to “to”
            System.out.println("Move a disc from peg "
                               + fromPeg + " to peg " + toPeg);

            // 3) move the (num−1) from “temp” to “to”
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}