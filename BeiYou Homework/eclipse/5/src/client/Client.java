package client;

import java.io.IOException;
import java.sql.SQLException;

import excel.SaveData;

public class Client {

	public static void main(String[] args) throws IOException, SQLException {
		SaveData saveData = new SaveData();
		saveData.save();
		System.out.println("end");
	}
}