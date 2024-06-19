package encapsulation;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double score;

    public Student() {
    }

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.score = 0;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        }
    }

    public void addScore(double score) {
        if (this.score + score >= 0 && this.score + score <= 10) {
            this.score += score;
        }
    }

    public void showInfo() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Score Level: %f\n", this.score);
        if (this.score < 4) {
            System.out.println("--> Yếu");
        } else if (this.score < 6) {
            System.out.println("--> Trung bình");
        } else if (this.score < 8) {
            System.out.println("--> Khá");
        } else {
            System.out.println("--> Giỏi");
        }
    }
}
