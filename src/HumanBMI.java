public class HumanBMI {
    private double weight;
    private double height;
    private double bmi;

    public HumanBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Вага і зріст мають бути більше 0");
        }
        this.weight = weight;
        this.height = height;
        recalculateBmi();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вага має бути більше 0");
        }
        this.weight = weight;
        recalculateBmi();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Зріст має бути більше 0");
        }
        this.height = height;
        recalculateBmi();
    }

    public String getBmiCategory() {
        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi < 25) {
            return "Norm";
        } else if (bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }

    private void recalculateBmi() {
        this.bmi = weight / (height * height);
    }
}

