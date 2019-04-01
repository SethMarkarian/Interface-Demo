/**
 * A Quiz contains an ArrayList of MathProblem objects.
 */
import java.util.*;
public class Quiz
{
    private List<MathProblem> problems;
    private int i;
    
    public Quiz(int n) {
        problems = new ArrayList<MathProblem>();
        
        // Fill list with problems.
        for(int i = 0; i < n; i++) {
            int x = (int) (10 * Math.random());
            int y = (int) (10 * Math.random());
            MathProblem p;
            if(Math.random() < 0.5)
                p = new AdditionProblem(x, y);
            else
                p = new MultiplicationProblem(x, y);
            problems.add(p);
        }
        
        i = 0;
    }
    
    public void displayProblem() {
        System.out.print((i + 1) + ") " + problems.get(i) + " = ");
    }
    
    public void checkAnswer(int ans) {
        System.out.println(problems.get(i).checkAnswer(ans));
        i++;
        if (i == problems.size()) {
            i = 0;
        }
    }
}
