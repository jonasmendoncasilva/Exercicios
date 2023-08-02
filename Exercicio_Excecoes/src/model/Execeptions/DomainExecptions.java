package model.Execeptions;

public class DomainExecptions extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainExecptions (String msg) {
		super(msg);
	}
}
