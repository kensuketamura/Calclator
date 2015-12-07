
public class Evaluator extends CalcVisitor {
	
	public Object eval(CalcTree node){
		return node.accept(this);
	}

	@Override
	public Object visit(Add node) {
		int left = (int) node.child.get(0).accept(this);
		int right = (int) node.child.get(1).accept(this);
		return left + right;
	}

	@Override
	public Object visit(Sub node) {	
	int left = (int) node.child.get(0).accept(this);
	int right = (int) node.child.get(1).accept(this);
		return left - right;
	}

	@Override
	public Object visit(Mul node) {
		int left = (int) node.child.get(0).accept(this);
		int right = (int) node.child.get(1).accept(this);
		return left * right;
	}

	@Override
	public Object visit(Div node) {
		int left = (int) node.child.get(0).accept(this);
		int right = (int) node.child.get(1).accept(this);
		return left / right;
	}

	@Override
	public Object visit(Int node) {
		return node.val;
	}
	
	@Override
	public Object visit(GreaterThanEquals node) {
		int left = (int) node.child.get(0).accept(this);
		int right = (int) node.child.get(1).accept(this);
		return ( left >= right ) ? true : false;
	}
	
	@Override
	public Object visit(LessThanEquals node) {
		int left = (int) node.child.get(0).accept(this);
		int right = (int) node.child.get(1).accept(this);
		return ( left <= right ) ? true : false;
	}
	
	@Override
	public Object visit(GreaterThan node) {
		int left = (int) node.child.get(0).accept(this);
		int right = (int) node.child.get(1).accept(this);
		return ( left > right ) ? true : false;
	}
	
	@Override
	public Object visit(LessThan node) {
		int left = (int) node.child.get(0).accept(this);
		int right = (int) node.child.get(1).accept(this);
		return ( left < right ) ? true : false;
	}
	
	@Override
	public Object visit(NotEquals node) {
		Object left = node.child.get(0).accept(this);
		Object right = node.child.get(1).accept(this);
		return ( left != right ) ? true : false;
	}
	
	public Object visit(Equals node) {
		Object left = node.child.get(0).accept(this);
		Object right = node.child.get(1).accept(this);
		return ( left == right ) ? true : false;
	}

}
