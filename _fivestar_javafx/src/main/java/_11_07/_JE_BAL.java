package _11_07;

import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _JE_BAL extends Application {

    private Connection conn = null; // 일단 DB 연결을 나타낼 인스턴스 변수 conn을 생성

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Class.forName("org.sqlite.jdbc3.JDBC3Connection");
            conn = DriverManager.getConnection("jdbc:sqlite:sql/test.sqlite"); // conn에 DB연결을 건네주기
            // 신지수는 아마 그냥 무지성 복붙하느라 이 메시지를 읽지 못하겠지
            // 지수 포함 이 메시지 못찾고 대답 안하면
            // 무지성 복붙한 걸로 이해하고 자바 전공심화반 추가 +30시간 시킬거임.
            System.out.println("데이터베이스 연결 성공!");
        }
        catch (Exception e) {
            System.out.println("데이터베이스 연결 실패..");
            System.out.println(e);
        }
    }

    public Connection dbConnector() {
        try {
            if(conn == null) { // 아직 한번도 연결된 적이 없다면(아직 값이 null이라면) 연결 후, 연결된 거 반환해주기
                Class.forName("org.sqlite.jdbc3.JDBC3Connection");
                conn = DriverManager.getConnection("jdbc:sqlite:sql/test.sqlite");

                System.out.println("데이터베이스 연결 성공!");

                return conn; // 메서드니까 return 추가
            }
            else { // 연결이 이미 되어있었다면, 그냥 conn 다시 반환해주기.
                return conn;
            }
        }
        catch (Exception e) {
            System.out.println("데이터베이스 연결 실패..");
            System.out.println(e.getMessage());

            return null; // 메서드니까 return 추가. 근데 에러가 나면 아무것도 없다는 값인 null 반환
        }
    }
}
