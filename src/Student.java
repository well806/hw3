abstract class Student {
    protected String fullName;
    protected int course;
    protected double lastExamScore;

    public Student(String fullName, int course, double lastExamScore) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamScore = lastExamScore;
    }

    public abstract void writeExam();

    @Override
    public String toString() {
        return "Студент: " + fullName + ", Курс: " + course + ", Оценка за последний экзамен: " + lastExamScore;
    }
}

class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamScore) {
        super(fullName, course, lastExamScore);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " с направления ИУ пишет экзамен по информатике.");
    }
}

class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamScore) {
        super(fullName, course, lastExamScore);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " c направления ФН пишет экзамен по математике.");
    }
}

