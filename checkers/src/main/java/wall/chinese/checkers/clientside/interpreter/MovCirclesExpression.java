package wall.chinese.checkers.clientside.interpreter;

import wall.chinese.checkers.clientside.board.CogTypes;
import wall.chinese.checkers.clientside.board.VisualBoard;

/**
 * The Class MovCirclesExpression.
 */
public class MovCirclesExpression extends AbstractCirclesExpression {

	/**
	 * Instantiates a new mov circles expression.
	 *
	 * @param visualBoard the visual board
	 */
	public MovCirclesExpression(VisualBoard visualBoard) {
		super(visualBoard);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * wall.chinese.checkers.clientside.interpreter.AbstractCirclesExpression#
	 * interpreteQueries(java.lang.String[])
	 */
	@Override
	public void interpreteQueries(String[] queries) {
		visualBoard.mark(Integer.parseInt(queries[2]), CogTypes.EBP, false);
		visualBoard.mark(Integer.parseInt(queries[3]),
				CogTypes.valueOf(queries[1]), true);
	}

}
