package jp.ne.yonem.pattern.Facade.Sample.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {

    private final Writer writer;

    public HtmlWriter(Writer writer) { // コンストラクタ
        this.writer = writer;
    }

    public void title(String title) throws IOException { // タイトルの出力
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    public void paragraph(String msg) throws IOException { // 段落の出力
        writer.write("<p>" + msg + "</p>\n");
    }

    public void link(String href, String caption) throws IOException { // リンクの出力
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailAddress, String username) throws IOException { // メールアドレスの出力
        link("mailto:" + mailAddress, username);
    }

    public void close() throws IOException { // 閉じる
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
