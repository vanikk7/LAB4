package pakage;

/**
 * @author VS
 */
class Subdivision {
    private final String id;
    private final String name;

    public Subdivision(String name) {
        this.name = name;
        this.id = generation();
    }

    /**
     * @return Случайное число
     */
    protected static String generation() {
        return Integer.toString((int) (Math.random() * 100000));
    }

    @Override
    public String toString() {
        return "Subdivision{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
