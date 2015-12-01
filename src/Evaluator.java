
public class Evaluator extends CalcVisitor {
	
	public int eval(CalcTree node){
		return node.accept(this);
	}

	@Override
	public int visit(Add node) {
		int left = node.child.get(0).accept(this);
		int right = node.child.get(1).accept(this);
		return left + right;
	}

	@Override
	public int visit(Sub node) {	
	int left = node.child.get(0).accept(this);
	int right = node.child.get(1).accept(this);
		return left - right;
	}

	@Override
	public int visit(Mul node) {
		int left = node.child.get(0).accept(this);
		int right = node.child.get(1).accept(this);
		return left * right;
	}

	@Override
	public int visit(Div node) {
		int left = node.child.get(0).accept(this);
		int right = node.child.get(1).accept(this);
		return left / right;
	}

	@Override
	public int visit(Int node) {
		return node.val;
	}

}
