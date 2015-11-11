package MyPackage;

/**
 * Created by Sur.Vival on 12/11/2015.
 */
public class Memento {
    private MyClass myClass;
    private int mState;

    public Memento(MyClass myClass, int mState) {
        this.myClass = myClass;
        this.mState = mState;
    }

    public void restore() {

    }
}
