public class Child{

    private String childName;
    private String childBirthDay;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirthDay() {
        return childBirthDay;
    }

    public void setChildBirthDay(String childBirthDay) {
        this.childBirthDay = childBirthDay;
    }

    @Override
    public String toString() {
        return String.format("%s %s", childName, childBirthDay);
    }
}