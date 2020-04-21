package java_0421.PartC.QC2;

public class IntExp extends Exp {

	Integer value;
	
	public IntExp(Integer value) {
		this.value = value;
	}

	public Integer evaluate() {
		return value;
	}
	public String show() {
		return "" + value;
	}
}