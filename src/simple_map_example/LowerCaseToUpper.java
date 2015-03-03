package simple_map_example;


import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by vardan sharma on 3/3/15.
 * A simple example to convert lowercase to uppercase using map operator in rx java
 *
 */
public class LowerCaseToUpper {
    public static void main(String[] args) {
        Observable.just("hello world in upper case").map(new Func1<String, String>() {
            @Override
            public String call(String s) {
                return s.toUpperCase();
            }
        }).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        });
    }
}
