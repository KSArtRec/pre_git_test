package git_test2;

public class hello {
	String message;
	public hello(){
		this("안녕하세요");
	}
	public hello(String message){
		this.message=message;
	}
	public void say() {
		System.out.println(message);
		
	}
}
