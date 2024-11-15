package com.sngular.session.three;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrincipalSessionThree {
	public static void main(String ...args){
		String rawSQL = "";
		try (Connection connection = DatabaseConnection.getConnection();
			     PreparedStatement statement = connection.prepareStatement(rawSQL);
			     ResultSet resultSet = statement.executeQuery()) {
			
			List<Books> listOfBooks = new ArrayList<>();
			Map<String, Books> mapOfBooks = new HashMap<String, Books>();
			Set setOfBooks = new HashSet();
			
			setOfBooks.add(new Books());
			setOfBooks.add("Algo");
			setOfBooks.add(1);
			setOfBooks.add(new Exception());

			GenericExample<Books> generic = new GenericExample<Books>(new Books());
			
			while (resultSet.next()) {
				//  ResultSet
			}
		} catch (SQLException e) {
		    e.printStackTrace();;
		}
	}
}
