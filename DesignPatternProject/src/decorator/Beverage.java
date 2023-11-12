package decorator;

public abstract class Beverage {
    public enum SIZE {
        TALL, GRANDE, VENTI;
    };
    SIZE size = SIZE.TALL;
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public SIZE getSize() {
        return this.size;
    }

    public abstract double cost();
}
