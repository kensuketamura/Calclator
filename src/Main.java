import java.io.IOException;

import nez.Parser;
import nez.ast.Tree;
import nez.main.CommandContext;


public class Main {

	public final static void main(String[] args) {
		try {
			CommandContext c = new CommandContext();
			c.parseCommandOption(args, false/* nezCommand */);
			Parser p = c.newParser();
			Tree<?> node = p.parseCommonTree(c.nextInput());
			if(node != null){
			}
		} catch (IOException e) {
			System.exit(1);
		}
	}

}
