package Business.Abstracts;

public interface VerificationService {

	void sendVerifyMail(String email);
	void verifyMail(String email);
	boolean checkVerifyAccount(String email);
}
