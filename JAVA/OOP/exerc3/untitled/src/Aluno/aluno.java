package Aluno;

public class aluno {
    public String name;
    public double score1, score2, score3;

    //public double missing =  calc - 90;
    public double calc(){
        return score1 + score2 + score3;
    }
    public double missing(){
        return 60- calc();
    }

    public String toString(){
        return "MISSING " + String.format("%.2f", missing()) + " POINTS";
    }

}
