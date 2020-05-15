import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class AntlrParser {
    public static void main (String[] args) throws IOException {
    	
        CharStream charStream = CharStreams.fromFileName("test");
        EasyJLexer easyJLexer = new EasyJLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream((easyJLexer));
        EasyJParser easyJParser = new EasyJParser(commonTokenStream);

        for(Token x :easyJLexer.getAllTokens()) {

        	System.out.println( x.getType() + ": " +  x.getText());

        }
        
    }
}
