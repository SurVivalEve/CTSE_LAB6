package MyPackage;

/**
 * Created by Sur.Vival on 12/11/2015.
 */
public class MyClass {
    private int state;

    public MyClass() {
    }

    public MyClass(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
    public void doAction() {
        state++;
    }
}
