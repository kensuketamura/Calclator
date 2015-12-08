
public class Evaluator extends CalcVisitor {
	
	public Object eval(CalcTree node){
		return node.accept(this);
	}

	@Override
	public Object visit(Add node) {
		// TODO
		return null;
	}

	@Override
	public Object visit(Sub node) {
		// TODO
		return null;
	}

	@Override
	public Object visit(Mul node) {
		// TODO
		return null;
	}

	@Override
	public Object visit(Div node) {
		// TODO
		return null;
	}

	@Override
	public Object visit(Int node) {
		// TODO
		return null;
	}
	
	@Override
	public Object visit(GreaterThanEquals node) {
		// TODO
		return null;
	}
	
	@Override
	public Object visit(LessThanEquals node) {
		// TODO
		return null;
	}
	
	@Override
	public Object visit(GreaterThan node) {
		// TODO
		return null;
	}
	
	@Override
	public Object visit(LessThan node) {
		// TODO
		return null;
	}
	
	@Override
	public Object visit(NotEquals node) {
		// TODO
		return null;
	}
	
	public Object visit(Equals node) {
		// TODO
		return null;
	}

}
