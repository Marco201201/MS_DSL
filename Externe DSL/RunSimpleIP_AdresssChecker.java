import org.antlr.v4.runtime.*;


public class RunSimpleIP_AdresssChecker {
    public static void main(String[] args) throws Exception {
        
        IP_AdressLexer lex = new IP_AdressLexer( new ANTLRInputStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
                
        IP_AdressParser parser = new IP_AdressParser (tokens);

        try {
            parser.checkip();

        } catch (RecognitionException e) {
            e.printStackTrace();            
        }
       
    }
}