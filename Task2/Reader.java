public class Reader {
    private String fullName;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;
    private int bookCount;

    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
        this.bookCount = 0;
    }

    public void takeBook(int count) {
        if (count > 0) {
            bookCount += count;
            System.out.println(fullName + " взял книг: " + count + ". Книг на руках: " + bookCount);
        } else {
            System.out.println("Количество книг должно быть положительным.");
        }
    }

    public void returnBook(int count) {
        if (count > 0 && count <= bookCount) {
            bookCount -= count;
            System.out.println(fullName + " вернул книг: " + count + ". Книг на руках: " + bookCount);
        } else {
            System.out.println("Невозможно вернуть столько книг. Проверьте количество.");
        }
    }

    public void status() {
        System.out.println("Читатель: " + fullName);
        System.out.println("Номер билета: " + ticketNumber);
        System.out.println("Факультет: " + faculty);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Телефон: " + phone);
        System.out.println("Книг на руках: " + bookCount);
    }
}
