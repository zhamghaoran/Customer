import java.util.Objects;

public class customrer_detail {
    private String name;
    private int age;
    private String email;
    private String sex;
    public customrer_detail() {
    }
    public customrer_detail(String name, int age, String email, String sex) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        customrer_detail that = (customrer_detail) o;
        return age == that.age && name.equals(that.name) && email.equals(that.email) && sex.equals(that.sex);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, sex);
    }
    public void prin() {
        System.out.println(" name: " + name + " age: " + age + " email: " + email + " sex: " + sex);
    }
}
