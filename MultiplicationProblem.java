
/**
 * Describes a multiplication problem.
 */
public class MultiplicationProblem implements MathProblem
{
    private int x, y;
    
    public MultiplicationProblem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * This method required to implement MathProblem
     */
    public boolean checkAnswer(int ans) {
        return ans == x * y;
    }
    
    public String toString() {
        return x + " * " + y;
    }
}
