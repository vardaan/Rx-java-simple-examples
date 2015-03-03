package hello_world;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Vardan sharma
 * Simple helloworld example in rx java
 */
public class HelloWorld {

    public static void main(String[] args) {
        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
                System.out.println(s);
            }

            @Override
            public void onCompleted() {
                System.out.println("I m complete");
            }

            @Override
            public void onError(Throwable e) {
            }
        };
        Observable<String> myObservable = Observable.create(
                new Observable.OnSubscribe<String>() {
                    @Override
                    public void call(Subscriber<? super String> sub) {
                        sub.onNext("Hello, world!");
                        sub.onCompleted();
                    }
                }
        );
        myObservable.subscribe(mySubscriber);
    }


}
