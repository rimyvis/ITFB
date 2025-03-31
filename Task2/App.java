public class App {
    public static void main(String[] args) {
        Reader reader = new Reader("Баланов Иван", "220958", "Мех-Мат", "21.11.1996", "+7-999-999-99-99");
        
        reader.status();
        reader.takeBook(3);
        reader.returnBook(1);
        //reader.status();
    }
}