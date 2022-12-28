package hanif.hakim.dev.data;

// This is Outer Class!
public class Company {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // This is Inner Class!
    public class Employee {
        private String name;

        public String getCompany() {
            return Company.this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
