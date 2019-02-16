package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Expand;
 


public class test {
	
	/** 
     * 解压缩  
     * @param sourceFile 要解压缩的文件的路径 
     * @param destDir 解压缩后的目录路径 
     * @throws Exception 
     */  
    public static void deCompress(String sourceFile,String destDir) throws Exception{    
        //创建需要解压缩的文件对象  
    	File file = new File(sourceFile);
        if (!file.exists()){  
            throw new RuntimeException(sourceFile + "不存在！");  
        }  
        //创建解压缩的文件目录对象  
        File destDiretory  = new File(destDir);  
        if(!destDiretory.exists()){  
            destDiretory.mkdirs();  
        }  
        /* 
         * 保证文件夹路径最后是"/"或者"\" 
         * charAt()返回指定索引位置的char值 
         */  
        char lastChar = destDir.charAt(destDir.length()-1);  
        if(lastChar!='/'&&lastChar!='\\'){  
            //在最后加上分隔符  
            destDir += File.separator;  
        }  
        
        unzip(sourceFile, destDir);  
    }  
    
    
    /** 
     * 解压方法 
     * 需要ant.jar 
     */  
    private static void unzip(String sourceZip,String destDir) throws Exception{  
        try{  
            Project p = new Project();  
            Expand e = new Expand();  
            e.setProject(p);  
            e.setSrc(new File(sourceZip));  
            e.setOverwrite(false);  
            e.setDest(new File(destDir));  
            e.execute();  
        }catch(Exception e){  
            throw e;  
        }  
    }  
	
	 static void run(String namecsv) throws IOException{
	String cName = namecsv;
	File csFile = new File(cName);
	File[] tempList = csFile.listFiles();
	String csvFileName= tempList[1].toString();
    //System.out.print(csvFileName);
    
       
	InputStreamReader read;
	try {
		read = new InputStreamReader(
				new FileInputStream(csvFileName),"gbk");
	
	BufferedReader br= new BufferedReader(read);
	br.readLine();
	String s = null;
	
	
	
	
	List<String> l= new ArrayList<String>();
	l.clear();
	
	while ((s = br.readLine()) != null) {
		String[] data = s.split(",");
		StringBuffer colVals = new StringBuffer();
		colVals.setLength(0);
		//System.out.print(data);
		for (int j = 0; j < data.length; j++) {
			colVals.append(data[j]);
			//colVals.append("|");
		}
		l.add(colVals.toString());
		//System.out.print(l);
		
	}
	
	System.out.print(l);
	br.close();
	
	
	read.close();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public static void main(String[] args) throws IOException    
    {  
		
		try {
			String sourceFile = "/Users/Richard/Desktop/csv.zip";
			test.unzip("/Users/Richard/Desktop/csv.zip", "/Users/Richard/Desktop/");
//			File file = new File("/Users/Richard/Desktop/__MACOSX/csv/");  
//			File[] list= file.listFiles();
//	        String sourceFileName= list[0].getName();
	        //String sourceFileName_1 =sourceFileName.substring(0, sourceFileName.indexOf("."));
	        String namecsv= "/Users/Richard/Desktop/csv/";
	        test.run(namecsv);
//	        System.out.println("!!!!!!"+ sourceFileName_1);
//			System.out.println("!!!!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("!!!!!2222!");
			e.printStackTrace();
		}
       
    } 
//	// 拷贝到服务器端磁盘
//	try {
//		dataFile1 = EPMFileUtil
//				.creatDataFile(EPMFilePaths.CSV_LOAD_PATH
//						+ "/" + zipFileName);
//	} catch (IOException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//		e1.printStackTrace();
//		result[0] = "F";
//		result[1] = "创建数据文件遇到未处理异常，请尝试重新上传或与系统管理员联系！日志如下："
//				+ e1.toString();
//		request.getSession().setAttribute("LogString",
//				result[1]);
//		return result;
//	}
//
//	EPMFileUtil.clearFileContent(dataFile1);
//
//	FileUtils.copyInputStreamToFile(item
//			.getInputStream(), dataFile1);
//	//拷贝文件
//	 try {  
//		 dataFile1.renameTo(new File( EPMFilePaths.CSV_BACKUP_PATH
//					+ "/" + dataFile1.getName()));
//
//     	} catch (Exception e1) {  
//     	// TODO Auto-generated catch block
//			e1.printStackTrace();
//			e1.printStackTrace();
//			result[0] = "F";
//			result[1] = "移动ZIP数据文件遇到未处理异常，请尝试重新上传或与系统管理员联系！日志如下："
//					+ e1.toString();
//			request.getSession().setAttribute("LogString",
//					result[1]);
//			return result; 
//        }  
//	//解压缩文件
//	EPMFileUtil
//			.unCSVFile(EPMFilePaths.CSV_LOAD_PATH
//					+ "/" + zipFileName, EPMFilePaths.CSV_LOAD_PATH
//					+ "/" );
//	
//	String fName=EPMFilePaths.CSV_LOAD_PATH
//			+ "/" + "__MACOSX" +"/" + zipFileNameIgnore + "/";
//	
//	File csFile = new File(fName);
//	File[] tempList = csFile.listFiles();
//	String csvFileName= tempList[0].toString();
//    
//			
//	String csvContentType= csvFileName.substring(csvFileName.lastIndexOf("."));
//
//	if (".CSV".equalsIgnoreCase(csvContentType)) {
//		
//		
//		InputStreamReader read = new InputStreamReader(
//				new FileInputStream(csvFileName),"gbk");
//				
//		BufferedReader br= new BufferedReader(read);
//
//		// 创建数据文件存储被处理SHEET的内容
//		try {
//			dataFile2 = EPMFileUtil
//					.creatDataFile(EPMFilePaths.XLS_RAW_DATA_PATH
//							+ "/"
//							+ "CSV_CD_FILE_"
//							+ new SimpleDateFormat(
//									"yyyyMMddhhmmss")
//									.format(new Date())
//							+ ".DATA");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//			e1.printStackTrace();
//			result[0] = "F";
//			result[1] = "创建数据文件遇到未处理异常，请尝试重新上传或与系统管理员联系！日志如下："
//					+ e1.toString();
//			request.getSession().setAttribute("LogString",
//					result[1]);
//			return result;
//		}
//
//		EPMFileUtil.clearFileContent(dataFile2);
//
//		// 处理CSV
//		String s = null;
//		
//		StringBuffer colVals = new StringBuffer();
//		while ((s = br.readLine()) != null) {
//			String[] data = s.split(",");
//			//System.out.print(data);
//			for (int j = 0; j < data.length; j++) {
//				colVals.append(data[j]);
//				//colVals.append("|");
//			}
//			
//			
//			colVals.append("\r\n");
//		}
//		read.close();
//		
//		EPMFileUtil.addString(dataFile2, colVals.toString());
//		
//		
//
//	} else {
//		result[0] = "F";
//		result[1] = "目前仅支持Excel-2003版本（默认以.csv为后缀）文件的处理，请选择正确的文件上传！";
//		request.getSession().setAttribute("LogString",
//				result[1]);
//		return result;
//	}
//
//
//	// 清除本次上传数据文件
//	EPMFileUtil.removeFile(dataFile1);
//	FileUtils.deleteDirectory(new File(EPMFilePaths.CSV_LOAD_PATH
//			+ "/" + "__MACOSX"));
//	
	

}

