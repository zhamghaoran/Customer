import java.util.ArrayList;

public class custmerlist {
    private ArrayList<customrer_detail> customer = new ArrayList<>();
    public custmerlist() {
    }
    public void add(String name,int age,String sex,String email) {
        customer.add(new customrer_detail(name,age,email,sex));
    }
    public boolean delete(int index) {
        if(customer.size() > index) {
            customer.remove(index - 1);
            return true;
        }
        else
            return false;
    }
    public boolean change(int index,String name,int age,String sex,String email) {
        if(customer.size() > index) {
            customer.set(index - 1,new customrer_detail(name,age,email,sex));
            return true;
        }
        else return false;
    }
    public void show() {
        for(customrer_detail i : customer)
            i.prin();
    }
    public void fin(int index) {
        index -= 1;
        System.out.println(customer.get(index).getName());
        System.out.println(customer.get(index).getAge());
        System.out.println(customer.get(index).getEmail());
        System.out.println(customer.get(index).getSex());
    }
}
