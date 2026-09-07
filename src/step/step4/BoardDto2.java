package step.step4;

public class BoardDto2 {
    private String content;
    private String writer;

    public BoardDto2() {}

    public BoardDto2(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    public String getContent() {return content;}

    public void setContent(String content) {this.content = content;}

    public String getWriter() {return writer;}

    public void setWriter(String writer) {this.writer = writer;}

    @Override
    public String toString() {
        return "BoardDto2 [content=" + content + ", writer=" + writer + "]";
    }
    

}
