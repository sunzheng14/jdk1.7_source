package test;

/**
 * @author zhangyan
 * @version $ Id: User.java, v 0.1 2021/3/9 12:50 zhangyan Exp $
 */
public class User {

    private java.lang.String name;

    private java.lang.Integer age;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Integer getAge() {
        return age;
    }

    public void setAge(java.lang.Integer age) {
        this.age = age;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(((User) o).getName()) && age == ((User) o).getAge();
    }

    @java.lang.Override
    public int hashCode() {
        return age;
    }
}
