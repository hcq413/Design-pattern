package 亨元模式;

import java.io.IOException;
import java.util.HashMap;

public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static final BigCharFactory big = new BigCharFactory();

    public BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return big;
    }

    public synchronized BigChar getBigChar(char charname) throws IOException {
        BigChar bigChar = (BigChar) pool.get("" + charname);
        if (bigChar == null) {
            bigChar = new BigChar(charname);
            pool.put("" + charname, pool);
        }
        return bigChar;
    }
}
