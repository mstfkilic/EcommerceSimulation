package Core;

import Google.GoogleManager;

public class GoogleManagerAdapters implements GoogleService {

	@Override
	public void signUpWithGoogle(String message) {
		// TODO Auto-generated method stub
		GoogleManager googleManager = new GoogleManager();
		googleManager.signUpWithGoogle(message);
		
	}

}
