package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;

import org.junit.Test;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
/** 
 * @author luoxuyang 
 * @version 创建时间：2015年12月21日 下午8:17:00 
 * 类说明 
 */
public class test {
	
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
	
	
	


}
