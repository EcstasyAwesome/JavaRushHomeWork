package com.javarush.test.level24.lesson06.home03;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

//2. В классе Util в методе getAllJeans добавьте пропущенную часть java-кода:
//        2.1) разберитесь в том, что уже есть в методе getAllJeans класса Util
//        2.2) создайте абстрактный class AbstractJeans от интерфейса Jeans с одним абстрактным методом, реализуйте остальные методы
//        2.3) создайте классы Levis и Denim от AbstractJeans, реализуйте оставшийся метод
//        2.4) в классе AbstractJeans реализуйте метод toString() используя  Alt+Insert -> toString()
//        2.5) метод toString класса AbstractJeans должен начинаться с имени сабкласса, например, Levis{id=1, length=34, size=6, price=150.0}
public class Util {
    protected static Collection<Object[]> jeansArray = new LinkedList<>();

    static {
        jeansArray.add(new Object[]{1, Company.Levis, 34, 6, 150.0});
        jeansArray.add(new Object[]{2, Company.Denim, 35, 8, 154.0});
        jeansArray.add(new Object[]{3, Company.Colins, 32, 6, 120.0});
        jeansArray.add(new Object[]{4, Company.CalvinKleinJeans, 31, 8, 125.0});
    }

    public static List<Jeans> getAllJeans() {

        //add your code here
        abstract class AbstractJeans implements Jeans{
            int length;
            int size;
            int id;
            double price;

            protected AbstractJeans(int id, int length, int size, double price)
            {
                this.id = id;
                this.length = length;
                this.size = size;
                this.price = price;
            }

            public int getId()
            {
                return id;
            }

            public double getPrice()
            {
                return price;
            }


            public int getLength()
            {
                return length;
            }

            public int getSize()
            {
                return size;
            }

            public String toString()
            {
                return this.getClass().getSimpleName()+"{" +
                        "id=" + id +
                        ", length=" + length +
                        ", size=" + size +
                        ", price=" + price +
                        '}';
            }
        }

        class Levis extends AbstractJeans{
            String TM;
            Levis(int id, int length, int size, double price)
            {
                super(id, length, size, price);
            }

            public String getTM()
            {
                return TM;
            }
        }

        class Denim extends AbstractJeans{
            String TM;
            Denim(int id, int length, int size, double price)
            {
                super(id, length, size, price);
            }

            public String getTM()
            {
                return TM;
            }
        }
        List<Jeans> allJeans = new LinkedList<>();

        for (Object[] obj : getJeansArray()) {
            int id = (int) obj[0];
            final Company company = (Company ) obj[1];
            int length = (int) obj[2];
            int size = (int) obj[3];
            double price = (double) obj[4];

            Jeans jeans = null;
            if (Company.Levis == company) {
                jeans = new Levis(id, length, size, price);
            } else
                if (Company.Denim == company) {
                    jeans = new Denim(id, length, size, price);
                } else {
                    jeans = new AbstractJeans(id, length, size, price) {
                        public String getTM() {
                            return company.fullName;
                        }
                    };
                }
            allJeans.add(jeans);
        }
        return allJeans;
    }

    public static Collection<Object[]> getJeansArray() {
        return jeansArray;
    }

    static enum Company {
        Levis ("Levi's"),
        Denim("Denim"),
        Colins("COLIN'S"),
        CalvinKleinJeans("Calvin Klein Jeans");

        final String fullName;
        Company(String name) {
            this.fullName = name;
        }
    }
}
