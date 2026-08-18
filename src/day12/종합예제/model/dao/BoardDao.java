package day12.종합예제.model.dao;

import java.sql.PreparedStatement;

import day09.종합예제.model.dto.BoardDto;

public class BoardDao extends BaseDao{
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }


    // [3] 개별수정 DAO
    public boolean update( BoardDto boardDto ){
        try{
            String sql = "update board set content = ? where no = ? "; // 1.1 SQL 작성
            PreparedStatement
        // 1.1 SQL 작성
        // 1.2 SQL 기재
        // 1.3 SQL 내 ? 매개변수 대입
        // 1.4 SQL 실행
        // 1.5 실행 결과 반환
        }catch( SQLException e ){ System.out.println( e );}
        }
    }




}

