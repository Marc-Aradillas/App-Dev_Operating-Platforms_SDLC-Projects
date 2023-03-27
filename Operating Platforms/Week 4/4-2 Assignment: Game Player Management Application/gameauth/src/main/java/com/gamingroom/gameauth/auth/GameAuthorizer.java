/**
 * @author marcaradillas_snhu
 *
 */

package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // FIXME: Finish the authorize method based on BasicAuth Security Example
    	
    	if  (user != null && user.getRoles() != null && role != null) {
    		return user.getRoles().contains(role);
    	}
    	return false;
    	
    	/* 'authorize' method takes a 'GameUser' object and a 'role' string as input 
    	 * parameters, and returns a boolean value indicating whether the user 
    	 * is authorized to perform actions associated with the given role.
    	 * 
    	 * The method checks if the user is not null, the user has a non-null roles 
    	 * field, and the given role is not null. Then it checks if the user's roles 
    	 * contains the given role and returns true if it does, otherwise it returns 
    	 * false. This method can be used in conjunction with the 'RolesAllowed' 
    	 * annotation to protect resources in your application based on user roles. - Marc Aradillas
    	 */
    }
}