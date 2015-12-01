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
		default:
			break;
		}
		return null;
	}
}
