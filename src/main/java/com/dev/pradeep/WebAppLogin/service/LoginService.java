/**
 * @author pradekum
 *
 * 
 */
package com.dev.pradeep.WebAppLogin.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String name, String password) {
		if (name.equalsIgnoreCase("pradeep")
				&& password.equalsIgnoreCase("pannu123")) {
			return true;
		} else
			return false;
	}

}
