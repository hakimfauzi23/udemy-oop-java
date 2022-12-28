package hanif.hakim.dev.data;

/*
 * Car Interface inherit HasBrand Interface!
 * All HasBrand interface now is required in all class that implement this.
 * Interface can inherit more than one interface!
 */
public interface Car extends HasBrand, isMaintenance {
    void drive();

    int getTire();
}
