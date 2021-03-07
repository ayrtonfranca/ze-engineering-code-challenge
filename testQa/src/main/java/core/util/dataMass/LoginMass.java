package core.util.dataMass;

import core.util.jsonReader.MassDataReader;

public class LoginMass {

	private String user_email;
	private String user_password;
	
	public String getUser_email() {
		return user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	
	public LoginMass(String file_json, String id_mass) {
		this.user_email = MassDataReader.QueryData(file_json, id_mass, "user_email").toString();
		this.user_password = MassDataReader.QueryData(file_json, id_mass, "user_password").toString();
	}

}