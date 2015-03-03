package hello_world_retro;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by vardan sharma
 * Hello world in rx java using lambdas expressions
 */
public class HelloWorldRetro {
    public static void main(String[] args) {
        Observable.just("Hello, world!").map(new Func1<String, String>() {
            @Override
            public String call(String s) {
                return s + "vardan sharma";
            }
        })
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });
    }
}
