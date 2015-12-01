
public abstract class CalcVisitor {
	public abstract void visit(Add node);

	public abstract void visit(Sub node);

	public abstract void visit(Mul node);

	public abstract void visit(Div node);

	public abstract void visit(Int node);
}
