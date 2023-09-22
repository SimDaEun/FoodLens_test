import java.sql.Connection;
import java.sql.DriverManager;

public class kk{
	public static void main(String[] args) {
		getConnection();
		
	}
	public static void getConnection() {
	      
	      try {
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         String jdbc_url = "jdbc:mysql://localhost:3306/LocalCurrency?useUnicode=true" + "&characterEncoding=UTF8&serverTimezone=UTC";
	         Connection con = DriverManager.getConnection(jdbc_url, "root","simdaeun1007");
	         System.out.println("데이터베이스에 접속했습니다!");
	         }catch(Exception e) {
	            System.out.println("DB 접속 오류:"+e);
	         }
	   }
}