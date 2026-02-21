package org.example.designpatternsjava.behavioral.memento;

public class Editor {
    private String content;

    public void type(String text) {
        content=text;
    }

    public String getContent(){
        return content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content=memento.getContent();
    }
}
