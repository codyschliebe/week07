package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	public DbException() {
	}
	
	//I tried to add overrides but get an error message
	//plus they're not shown in the solution
	
	//@Override								
	public DbException(String message) {
		super(message);
		
	}
	
	//@Override								
	public DbException(Throwable cause) {
		super(cause);
	}
	
	//@Override
	public DbException(String message, Throwable cause) {
		super(message, cause);
	}

}
