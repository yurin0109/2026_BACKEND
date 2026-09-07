package step.step4;

public class BoardDto3 {

    private String content;
    private String writer;

    public BoardDto3() {}

    public BoardDto3(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public String getWriter() {return writer;}
    public void setWriter(String writer) {this.writer = writer;}

    @Override
    public String toString() {
        return "BoardDto3 [content=" + content + ", writer=" + writer + "]";
    }
}
