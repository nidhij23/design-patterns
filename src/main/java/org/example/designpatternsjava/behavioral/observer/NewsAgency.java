package org.example.designpatternsjava.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NewsAgency implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(news);
        }
    }
}
