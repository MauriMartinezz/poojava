public class Patient extends User{

    private String birthday, blood;
    private double height, weight;

    public Patient(String name, String email){
        super(name, email);
    }

    public String getWeight() {
        return this.weight + " Kg";
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeight() {
        return height + "m";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Patient: \n" +
                super.toString() +
                " birthday='" + birthday + '\'' +
                ", blood='" + blood + '\'' +
                ", height=" + height +
                ", weight=" + weight;
    }
}
