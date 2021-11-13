package Worker;
//Công nhân gồm: id, tên, điện thoại, address, lương, số ngày làm. có phương thức tính lương(lương * ngày)
//        Kỹ sư gồm:id, tên, điện thoại, address,hệ số lương, lương, số ngày làm. có phương thức tính lương.(Lương * hệ số* ngày);
//        Thiết kế các Class sao cho hợp lý.

public class Worker {
    private int id;
    private static int idNumber = 1;
    private String name;
    private int phone;
    private String address;
    private int salary;
    private int workDay;

    public Worker(int id, String name, int phone, String address, int salary, int workDay) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.workDay = workDay;
        this.id = idNumber++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
}
