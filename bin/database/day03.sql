drop database if exists database;

create database database;   -- ctrl+shift

use mydb0807;

create table test(          -- create table 테이블명( 속성명 타입 제약 조건 , 속성명 타입 제약 조건 )
    번호 int auto_increment ,
    constraint primary key( 번호 ) ,
    이름 varchar(30) not null unique ,
    개수 int default 2 
);
-- DML : 조작어 , 1) insert  레코드 삽입 2) select 레코드 조회 3) update 레코드 수정 4) delete 레코드 삭제
-- 레코드란? 테이블 내 행/가로 단위
# [1] insert : insert into 테이블명( 속성명1 , 속성명2 ) vaules( 값 , 값2 )
insert into test( 번호 , 이름 , 개수 ) values( 1, "유재석" , 10 );

insert into test( 이름 , 개수 ) values( "강호동 , 20" ); -- 번호 값 제외한 삽입 , auto_increment 자동번호

insert intp test( 이름 ) values( " 신동엽 "); -- 번호(auto) , 개수(defalut) 제외한 삽입

-- insert into test( 이름 ) values( "유재석 " ); -- 이름(unique)는 중복 불가능 / 오류

insert into test values( 4, "하하", 30 ); -- 모든 속성값 순서대로 값 대입 시 속성명 생략

insert into test( 이름 ) values( "박명수" ) , ( "수박" ) , ( "바나나" );

# [2] select : select [*전체/속성명] from  테이블명 where 조건
select * from test; -- 테이블 내 모든 속성[*]의 레코드 조회
select 이름 from test; -- 테이블 내 'name' 속성명의 레코드
