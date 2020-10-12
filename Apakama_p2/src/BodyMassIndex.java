public class BodyMassIndex {
    protected double height;
    protected double weight;
    protected double score;

    public BodyMassIndex(double h, double w) {
        height = h;
        weight = w;
    }

    public double score() {
        score = 703 * weight / (height * height);
        score *= 100;
        score = Math.round(score);
        score /= 100;
        return score;
    }

    public String category() {
        if (score <= 18.5)
            return "Underweight";
        else if (score > 18.5 && score < 25)
            return "Normal weight";
        else if (score >= 25 && score < 30)
            return "Overweight";
        else
            return "Obesity";
    }
}
