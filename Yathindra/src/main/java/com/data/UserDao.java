package com.data;
import com.service.*;

import java.util.List;

import javax.persistence.PersistenceException;

public interface UserDao {

	public String addNewUser(User username) throws PersistenceException;
	public String addNewPassword(User password) throws PersistenceException;
}
