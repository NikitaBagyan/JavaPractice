public interface Rideable {

    void ride();

    default void swim() {
        System.out.println("Swim swim swim");
    }

}

