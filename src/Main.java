public class Main {
    public static void main(String[] args) {
        Student student1 = new IUStudent("Иванов Иван Иванович", 3, 4.5);
        Student student2 = new MathStudent("Петров Петр Петрович", 2, 3.7);

        System.out.println(student1);
        student1.writeExam();

        System.out.println(student2);
        student2.writeExam();


        StringArray stringArray = new StringArray();

        stringArray.addString("Практика");
        stringArray.addString("ИУ");
        stringArray.addString("Java");
        stringArray.addString("Программирование");

        System.out.println("Максимальная длина строки: " + stringArray.getMaxLengthString());
        System.out.println("Средняя длина строк: " + stringArray.getAverageLength());
    }
}