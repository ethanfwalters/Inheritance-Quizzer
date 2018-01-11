
public class Answer 
{
	private String instatiation;
	private String methodCall;
	private String answer;
	public Answer(String instatiation , String methodCall , String answer)
		{
		this.instatiation = instatiation;
		this.methodCall = methodCall ;
		this.answer = answer;
		}
	public String getInstatiation() {
		return instatiation;
	}
	public void setInstatiation(String instatiation) {
		this.instatiation = instatiation;
	}
	public String getMethodCall() {
		return methodCall;
	}
	public void setMethodCall(String methodCall) {
		this.methodCall = methodCall;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
