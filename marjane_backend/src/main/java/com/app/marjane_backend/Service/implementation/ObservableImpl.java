package com.app.marjane_backend.Service.implementation;

import com.app.marjane_backend.Service.Observable;
import com.app.marjane_backend.Service.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state = 0;

    private List<Observer> observers=new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }


    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
    for(Observer observer:observers){
        observer.update(state);
    }
    }

    public void setState(int state){
        this.state = state;
        notifyObservers();
    }
    public int getState(){
        return state;
    }


}
