import nez.ast.CommonTree;


public class Translator {
	public static CalcTree translate(CommonTree node){
		switch (node.getTag().getSymbol()) {
		case "Add":
			return new Add(translate(node.get(0)), translate(node.get(1)));
		case "Sub":
			return new Sub(translate(node.get(0)), translate(node.get(1)));
		case "Mul":
			return new Mul(translate(node.get(0)), translate(node.get(1)));
		case "Div":
			return new Div(translate(node.get(0)), translate(node.get(1)));
		case "Int":
			return new Int(Integer.parseInt(node.toText()));
		case "LessThan":
			return new LessThan(translate(node.get(0)), translate(node.get(1)));
		case "GreaterThan":
			return new GreaterThan(translate(node.get(0)), translate(node.get(1)));
		case "LessThanEquals":
			return new LessThanEquals(translate(node.get(0)), translate(node.get(1)));
		case "GreaterThanEquals":
			return new GreaterThanEquals(translate(node.get(0)), translate(node.get(1)));
		case "Equals":
			return new Equals(translate(node.get(0)), translate(node.get(1)));
		case "NotEquals":
			return new NotEquals(translate(node.get(0)), translate(node.get(1)));
		case "LogicalAnd":
			return new LogicalAnd(translate(node.get(0)), translate(node.get(1)));
		case "LogicalOr":
			return new LogicalOr(translate(node.get(0)), translate(node.get(1)));
		default:
			break;
		}
		return null;
	}
}
