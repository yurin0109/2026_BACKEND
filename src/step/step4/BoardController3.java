package step.step4;

public class BoardController3 {
    private static final BoardDto[] boards = new BoardDto[100];
        public static boolean doPost( String content , String writer ){
            BoardDto board = new BoardDto( content , writer );
            for( int index = 0; index <= boards.length-1; index++ ){
                if( boards[index] == null ){
                    boards[index] = board;
                    return true;
                }
            }
            return false;
        }
        public static BoardDto[] doget(){
            return boards;
        }
}
