package jihe.zuoye2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author czq
 * @version 1.0
 */
public class C {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(new Book("红楼梦",100,"曹雪芹"));
        arrayList.add(new Book("西游记",10,"曹雪芹"));
        arrayList.add(new Book("水浒传",9,"曹雪芹"));
        arrayList.add(new Book("三国演义",80,"曹雪芹"));
        arrayList.add(new Book("西游记",10,"曹雪芹"));


//        for(Object p:arrayList){
//            System.out.println(p);
//        }

//        System.out.println(arrayList.get(0));

        Book.maopao(arrayList);
        for(Object o:arrayList){
            System.out.println(o);
        }
    }
}
class Book{
    private String name;
    private int price;
    private String author;

    public static void maopao(ArrayList book){
        Object book1 = null;
        for (int i = 0; i <book.size() - 1; i++) {
            for (int j = 0; j <book.size()-i-1; j++) {
                Book b1 = (Book) book.get(j);
                Book b2 = (Book) book.get(j+1);
                if(b1.getPrice() > b2.getPrice()){
                    book.set(j,b2);
                    book.set(j+1,b1);
                }
            }
        }

    }


    @Override
    public String toString() {
        return "名称: " + name + '\t' +
                "价格： " + price + "\t"+
                "作者: " + author ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
