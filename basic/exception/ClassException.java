package basic.exception;


/*static {
	System.out.println("First item is this");
}
*/

public class ClassException {
	
	public static void main(String args[]) {
		
		try {
			int i = 1/0;
			throw new Exception("Exception");
			
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		} finally {
			System.out.println("Executing finally");
		}
	}

}
