package hanif.hakim.dev.application;

import hanif.hakim.dev.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("SPE Solution");

        Company.Employee employee = company.new Employee();
        employee.setName("Hanif Fauzi");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Not Available");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Dodi");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
