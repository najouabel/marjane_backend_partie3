package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.Observer;

public class ObserverImpl1  implements Observer {

    @Override
    public void update(int state) {
        System.out.println("**************");
        System.out.println("Stae value= "+state);
        System.out.println("**************");
    }
}
