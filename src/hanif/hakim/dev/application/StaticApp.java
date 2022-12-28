package hanif.hakim.dev.application;

import hanif.hakim.dev.data.Constant;
import hanif.hakim.dev.data.Country;
import hanif.hakim.dev.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(2, 3, 4, 5));

        Country.City city = new Country.City();
        city.setName("Cilacap");

        System.out.println(city.getName());
    }
}
