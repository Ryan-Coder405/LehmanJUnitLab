package lehmanjunitlab;

public class LehmanGradeBook {
    public boolean isPassing(int grade) {
        if(grade > 100){
            throw new IllegalArgumentException("can't be greater than 100");
        } else {
            return grade >= 70;
        }
        
    }

    public char getLetterGrade(int score){
        if (score >= 90){
            return 'A';
        } else if (score >= 80){
            return 'B';
        } else if (score >= 70){
            return 'C';
        } else {
            return 'F';
        }
    }
}

