package com.app.marjane_backend;


import com.app.marjane_backend.Service.Observer;
import com.app.marjane_backend.Service.implementation.ObservableImpl;
import com.app.marjane_backend.Service.implementation.ObserverImpl1;
import com.app.marjane_backend.Service.implementation.ObserverImpl2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(30);
        Observer observer1 = new ObserverImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverImpl2());
        observable.setState(70);
        observable.setState(50);
        observable.unsubscribe(observer1);

    }
}
