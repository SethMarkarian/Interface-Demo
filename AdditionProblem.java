
/**
 * Describes an addition problem
 */
public class AdditionProblem implements MathProblem
{
    private int x, y;
    
    public AdditionProblem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * This method required to implement MathProblem
     */
    public boolean checkAnswer(int ans) {
        return ans == x + y;
    }
    
    public String toString() {
        return x + " + " + y;
    }
}
