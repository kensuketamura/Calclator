
public abstract class CalcVisitor {
	public abstract int visit(Add node);

	public abstract int visit(Sub node);

	public abstract int visit(Mul node);

	public abstract int visit(Div node);

	public abstract int visit(Int node);
}
