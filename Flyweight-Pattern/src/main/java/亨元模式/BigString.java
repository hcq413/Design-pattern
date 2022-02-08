package 亨元模式;

import lombok.SneakyThrows;

public class BigString {
    private BigChar[] bigclass;

    @SneakyThrows
    public BigString(String string) {
        bigclass = new BigChar[string.length()];
        BigCharFactory instance = BigCharFactory.getInstance();
        for (int i = 0; i < bigclass.length; i++) {
            bigclass[i] = instance.getBigChar(string.charAt(0));
        }
    }

    public void print() {
        for (int i = 0; i < bigclass.length; i++) {
            bigclass[i].print();
        }
    }
}
