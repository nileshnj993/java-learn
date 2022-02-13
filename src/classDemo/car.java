package classDemo;

public class car {
    private int ID;
    private String regNo;
    private String company;
    private String name;

    public car(int ID, String regNo, String company, String name) {
        this.ID = ID;
        this.regNo = regNo;
        this.company = company;
        this.name = name;
    }

    @Override
    public String toString() {
        return "car{" +
                "ID=" + ID +
                ", regNo='" + regNo + '\'' +
                ", company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
