public class Client {
    public static void main(String[] args) {
        CharDisplay h = new CharDisplay('H');
        StringDisplay display = new StringDisplay("Helloworld");
        StringDisplay stringDisplay = new StringDisplay("你好世界");
        h.display();
        display.display();
        stringDisplay.display();

    }
}
