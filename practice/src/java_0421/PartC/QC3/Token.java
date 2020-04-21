package java_0421.PartC.QC3;

import java_0421.PartC.QC2.TokenType;

public class Token {

	TokenType type;

    public Token(TokenType type) {
    	this.type = type;
    }

    public String show() {
    	return type.value;
    }
}
