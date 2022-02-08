package 亨元模式;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 大号字符
 * 亨元对象,内部对象
 * @author 黄昌其
 * @date 2022/02/08
 */
public class BigChar {
    /**
     * 字符名称
     */
    private char charname;

    /**
     * 字体数据
     */
    private String fontdata;

    public BigChar(char charname) throws IOException {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".txt"));
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.println(fontdata);
    }
}