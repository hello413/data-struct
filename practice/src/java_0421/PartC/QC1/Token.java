package java_0421.PartC.QC1;

public class Token {
    TokenType type;
    String value;
    
    public Token(TokenType type, String value) {
    	this.type = type;
    	this.value = value;
    }
    
    public String show() {
    	return type.toString() + " " + value;
    }
}
