import java.util.ArrayList;
import java.util.List;

public abstract class CalcTree {
	List<CalcTree> child;

	public CalcTree() {
		this.child = new ArrayList<>();
	}

	public abstract void accept(CalcVisitor visitor);

}

abstract class BinaryExpr extends CalcTree {

	public BinaryExpr(CalcTree left, CalcTree right) {
		super();
		this.child.add(left);
		this.child.add(right);
	}
}

class Add extends BinaryExpr {

	public Add(CalcTree left, CalcTree right) {
		super(left, right);
	}

	@Override
	public void accept(CalcVisitor visitor) {
		visitor.visit(this);
	}

}

class Sub extends BinaryExpr {

	public Sub(CalcTree left, CalcTree right) {
		super(left, right);
	}

	@Override
	public void accept(CalcVisitor visitor) {
		visitor.visit(this);
	}

}

class Mul extends BinaryExpr {

	public Mul(CalcTree left, CalcTree right) {
		super(left, right);
	}

	@Override
	public void accept(CalcVisitor visitor) {
		visitor.visit(this);
	}

}

class Div extends BinaryExpr {

	public Div(CalcTree left, CalcTree right) {
		super(left, right);
	}

	@Override
	public void accept(CalcVisitor visitor) {
		visitor.visit(this);
	}

}

class Int extends CalcTree {
	int val;

	public Int(int val) {
		this.val = val;
	}

	@Override
	public void accept(CalcVisitor visitor) {
		visitor.visit(this);
	}

}
