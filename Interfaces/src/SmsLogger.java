
public class SmsLogger implements Logger {

	@Override
	public void Log(String message) {
	
		System.out.println("sms gonderildi:"+message);
		
	}

}
