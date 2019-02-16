package excel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import common.Common;
import excel.vo.Data;
import util.DbUtil;

public class SaveData {

	@SuppressWarnings({ "rawtypes" })
	public void save() throws IOException, SQLException {
		ReadExcel xlsMain = new ReadExcel();
//		String[][] data = new String[5][300];
		String name=null;
//		List<String[][]> list = xlsMain.readXls();
		int list = xlsMain.readXls();

//		for (int i = 0; i < list.size(); i++) {
//			data = list.get(i);
//			for(int j=0; j<data.length;j++){
//				switch(j){
//				case 0:
//					name ="A";
//					break;
//				case 1:
//					name ="A1";
//					break;
//				case 2:
//					name ="C";
//					break;
//				case 3:
//					name ="Sc_in";
//					break;
//				case 4:
//					name ="Sc_out";
//					break;		
//				}
//				DbUtil.create(name);
//				for(int x=0; x<data[j].length; x++){
//					DbUtil.insert("insert into " + name +" values(?)", data[j][x]);
//				}
//			}
//		}
	}
}

