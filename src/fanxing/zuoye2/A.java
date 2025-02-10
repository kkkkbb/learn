package fanxing.zuoye2;

import java.util.*;

/**
 * @author czq
 * @version 1.0
 */
public class A {
    public static void main(String[] args) {

        DAO<User> userDAO = new DAO<>(new HashMap<>());

        userDAO.save("1",new User(18,45,"czq"));
        userDAO.save("2",new User(188,445,"wadad"));
        userDAO.save("3",new User(19,45,"cawdasq"));

        System.out.println( userDAO.get("1"));

        userDAO.update("3",new User(199,45555,"dsad"));
        System.out.println(userDAO);


        for(Object o:userDAO.list()){
            System.out.println(o);
        }

        userDAO.delete("2");

        for(Object o:userDAO.list()){
            System.out.println(o);
        }
    }
}
class DAO<T>{
//    private Object String;
    private Map<String,T> map ;

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}';
    }

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list() {



        return new ArrayList<>(map.values());
    }

    public void delete(String id ){
        map.remove(id);
    }

}

class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}