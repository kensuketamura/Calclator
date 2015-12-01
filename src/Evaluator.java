
public class Evaluator extends CalcVisitor {
	
	public int eval(CalcTree node){
		return node.accept(this);
	}

	@Override
	public int visit(Add node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int visit(Sub node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int visit(Mul node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int visit(Div node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int visit(Int node) {
		// TODO Auto-generated method stub
		return 0;
	}

}
