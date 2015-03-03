package hello_world_simple;


import rx.Observable;
import rx.functions.Action1;

/**
 * Created by Vardan sharma on 3/3/15.
 * <p/>
 * Simpler version of hello world using action
 */
public class HelloWorldSimple {
    public static void main(String[] args) {
        Observable<String> myObservable = Observable.just("Hello WOrld");

        Action1<String> onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        };
        myObservable.subscribe(onNextAction);
    }
}
