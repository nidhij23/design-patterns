package org.example.designpatternsjava.creational.prototype;

public class Document implements Cloneable{
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch(CloneNotSupportedException e ){
            throw  new RuntimeException();
        }
    }

    public void print() {
        System.out.println(title + " : " + content);
    }
}
