package test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;





import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

/** 
 * @author luoxuyang 
 * @version 创建时间：2015年12月21日 下午8:17:00 
 * 类说明 
 */
public class Mytest {
	
	public static void main(String[] args) throws JsonProcessingException, IOException {
		 ObjectMapper Mapper = new ObjectMapper();
		String data="{ \"final_decision\":\"Review\",\"final_score\":20,\"hit_rules\":[{\"decision\":\"Accept\",\"id\":\"30634\",\"name\":\"7天内设备或账户借款次数过多\",\"parentUuid\":\"\",\"score\":10,\"uuid\":\"23d1167d8d554653bf86c2bba9854b5f\"},{\"decision\":\"Accept\",\"id\":\"30636\",\"name\":\"1天内设备使用过多账户进行借款\",\"parentUuid\":\"\",\"score\":10,\"uuid\":\"7e9bb9d429824c9f904a61552744ece4\"}],\"policy_name\":\"借款策略集\",\"policy_set\":[{\"hit_rules\":[{\"decision\":\"Accept\",\"id\":\"30634\",\"name\":\"7天内设备或账户借款次数过多\",\"parentUuid\":\"\",\"score\":10,\"uuid\":\"23d1167d8d554653bf86c2bba9854b5f\"},{\"decision\":\"Accept\",\"id\":\"30636\",\"name\":\"1天内设备使用过多账户进行借款\",\"parentUuid\":\"\",\"score\":10,\"uuid\":\"7e9bb9d429824c9f904a61552744ece4\"}],\"policy_decision\":\"Review\",\"policy_mode\":\"Weighted\",\"policy_name\":\"异常借款_安卓\",\"policy_score\":20,\"policy_uuid\":\"47259b489233413083e2e4e9ad0a23d8\",\"risk_type\":\"suspiciousLoan\"},{\"policy_decision\":\"Accept\",\"policy_mode\":\"Weighted\",\"policy_name\":\"机构代办_安卓\",\"policy_score\":0,\"policy_uuid\":\"c4e12c4243ba4eef809596608ff2208d\",\"risk_type\":\"agency\"},{\"policy_decision\":\"Accept\",\"policy_mode\":\"WorstMatch\",\"policy_name\":\"失信借款_安卓\",\"policy_score\":0,\"policy_uuid\":\"f385f7869f00447686f07f09cfc1893d\",\"risk_type\":\"creditRisk\"}],\"policy_set_name\":\"借款策略集\",\"risk_type\":\"suspiciousLoan_review\",\"seq_id\":\"1448263211214-09162933\",\"spend_time\":86,\"success\":true}";
		JsonNode jsonTree = Mapper.readTree(data);
		System.out.println(jsonTree.get("final_decision").getTextValue());
		System.out.println(jsonTree.get("final_score").getValueAsLong());
		if(true){
			return;
		}
		System.out.println(jsonTree.get("hit_rules").toString());
		System.out.println(jsonTree.get("success").getBooleanValue());
		jsonTree.get("hit_rules").toString();
		
		
	}
	/**
	 * @author luoxuyang
@date2015年12月22日下午2:31:38
	 * @throws IOException
	 */
	@Test
	public void  Test () throws IOException{
		String str = "hello";
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bo);
		oos.writeObject(str );

		
		
		byte[] ba = bo.toByteArray();
		
		String string = Arrays.toString(ba);		
		byte[] bytes = "hello".getBytes();
		
		

		
	}
	//developer
	@Test
	public void test_switch(){
		int channel =1 ;
		switch(channel){
		case 0 :
			System.out.println(0);
			break;
		case 997 :
			System.out.println("wap");
			break;
		case 998 :
			System.out.println("android");
				break;
		case 999 :
			System.out.println("ios");
			break;
		default :
			System.out.println("default");
			break;
	}
		
		//System.out.println(name.isEmpty());
	}
	/**
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws ParseException 
	 */
@Test
public void sql() throws ClassNotFoundException, SQLException, ParseException{
	String sql ="select time_join  from nwd_fund_financial_ext where rownum = 1 ";
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.168:1521:orcl","nwd","NWD123");
	 Statement statement = connection.createStatement();

	ResultSet resultSet = statement.executeQuery(sql);
	while(resultSet.next()){
		String dateStr = resultSet.getDate(1).toString();
		System.out.println(dateStr);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date  = sdf.parse(dateStr);
		String format = sdf.format(date);
		System.out.println(format);
	}
	
	
	statement.close();
	connection.close();
}
	
	@Test
public void query() throws ClassNotFoundException, SQLException{
	String sql="select CREATE_TIME from NWD_ACT_WEIXINVC where ROWNUM =1";

	

}
@SuppressWarnings("deprecation")
@Test
public void  dateFormat() throws ParseException{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	String strDate = "2015/11/23 13:35:24";
	Date date=sdf.parse(strDate);
	
	
	System.out.println(date.toString());
	}	
	
}
