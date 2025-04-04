package git_test2;

public class hello {

	String message="안녕하세요";
	public String say() {
		return message;		
	}
	public hello(){
		this("안녕하세요");
	}
	public hello(String message){
		this.message=message;
	}

}

