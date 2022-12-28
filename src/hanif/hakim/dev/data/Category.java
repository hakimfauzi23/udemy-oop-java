package hanif.hakim.dev.data;

public class Category {

    private String id;
    private boolean expensive;

    /*
     * Setter and getter to implement encapsulation
     * Benefit is security (data validation, etc)
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return this.expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
