package flat_map_usage;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zapbuild on 3/3/15.
 */
public class FlatMap {
    public static void main(String[] args) {
        query("Hello, world!")
                .flatMap(new Func1<List<String>, Observable<String>>() {
                    @Override
                    public Observable<String> call(List<String> urls) {
                        return Observable.from(urls);
                    }
                })
                .filter(new Func1<String, Boolean>() {
                    @Override
                    public Boolean call(String s) {
                        return !s.equals("apple");
                    }
                })
                        //                .take(1)
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String url) {
                        System.out.println(url);
                    }
                });


        // the problem with this approach ???
//        query("Hello, world!")
//                .subscribe(new Action1<List<String>>() {
//                    @Override
//                    public void call(List<String> strings) {
//                        for (int i = 0; i < strings.size(); i++) {
//                            System.out.println(strings.get(i));
//                        }
//                    }
//                });

//        query("Hello people")
//                .subscribe(new Action1<List<String>>() {
//                    @Override
//                    public void call(List<String> strings) {
//                        Observable.from(strings).subscribe(new Action1<String>() {
//                            @Override
//                            public void call(String s) {
//                                System.out.println(s);
//                            }
//                        });
//                    }
//                });
    }

    private static Observable<List<String>> query(String s) {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        return Observable.just(list);

    }
}
