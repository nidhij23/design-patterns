package org.example.designpatternsjava;

import org.example.designpatternsjava.behavioral.chainofresponsibility.Approver;
import org.example.designpatternsjava.behavioral.chainofresponsibility.Director;
import org.example.designpatternsjava.behavioral.chainofresponsibility.JuniorApprover;
import org.example.designpatternsjava.behavioral.chainofresponsibility.SeniorApprover;
import org.example.designpatternsjava.behavioral.command.*;
import org.example.designpatternsjava.behavioral.iterator.MyIterator;
import org.example.designpatternsjava.behavioral.iterator.MyList;
import org.example.designpatternsjava.behavioral.mediator.ChatMediator;
import org.example.designpatternsjava.behavioral.mediator.ChatRoom;
import org.example.designpatternsjava.behavioral.mediator.ChatUser;
import org.example.designpatternsjava.behavioral.mediator.User;
import org.example.designpatternsjava.behavioral.memento.Editor;
import org.example.designpatternsjava.behavioral.memento.EditorMemento;
import org.example.designpatternsjava.behavioral.memento.History;
import org.example.designpatternsjava.behavioral.observer.NewsAgency;
import org.example.designpatternsjava.behavioral.observer.NewsChannel;
import org.example.designpatternsjava.behavioral.observer.Observer;
import org.example.designpatternsjava.behavioral.state.VendingMachine;
import org.example.designpatternsjava.behavioral.strategy.CreditCardPayment;
import org.example.designpatternsjava.behavioral.strategy.PayPalPayment;
import org.example.designpatternsjava.behavioral.strategy.PaymentContext;
import org.example.designpatternsjava.behavioral.strategy.UPIPayment;
import org.example.designpatternsjava.behavioral.template.Beverage;
import org.example.designpatternsjava.behavioral.template.Coffee;
import org.example.designpatternsjava.behavioral.template.Tea;
import org.example.designpatternsjava.behavioral.visitor.*;
import org.example.designpatternsjava.creational.prototype.prototyperegistry.CharacterRegistry;
import org.example.designpatternsjava.creational.prototype.prototyperegistry.GameCharacter;
import org.example.designpatternsjava.creational.prototype.prototyperegistry.Warrior;
import org.example.designpatternsjava.structural.adapter.PayPalAdapter;
import org.example.designpatternsjava.structural.adapter.PayPalService;
import org.example.designpatternsjava.structural.adapter.PaymentProcessor;
import org.example.designpatternsjava.structural.bridge.*;
import org.example.designpatternsjava.structural.composite.File;
import org.example.designpatternsjava.structural.composite.Folder;
import org.example.designpatternsjava.structural.decorator.Espresso;
import org.example.designpatternsjava.structural.decorator.Milk;
import org.example.designpatternsjava.structural.decorator.Sugar;
import org.example.designpatternsjava.structural.facade.HomeTheaterFacade;
import org.example.designpatternsjava.structural.facade.SoundSystem;
import org.example.designpatternsjava.structural.facade.StreamingDevice;
import org.example.designpatternsjava.structural.facade.TV;
import org.example.designpatternsjava.structural.flyweight.CharacterFactory;
import org.example.designpatternsjava.structural.flyweight.CharacterFlyweight;
import org.example.designpatternsjava.structural.proxy.Image;
import org.example.designpatternsjava.structural.proxy.ImageProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;


public class DesignPatternsDemo {
    private static final Logger log = LoggerFactory.getLogger(DesignPatternsDemo.class);

    public static void main(String[] args) {

        // Singleton
//        ConfigManager c1 = ConfigManager.getInstance();
//        ConfigManager c2 = ConfigManager.getInstance();
//
//        System.out.println(c1==c2);
//
//        ConfigManagerEnum e1 = ConfigManagerEnum.INSTANCE;
//        ConfigManagerEnum e2 = ConfigManagerEnum.INSTANCE;
//
//        System.out.println(c1==c2);

        //Factory
//        Payment payment = PaymentFactory.createPayment("CRYPTO");
//        payment.pay(1000);

        //Advanced Factory pattern
//        Logistics logistics = new RoadLogistics();
//        logistics.planDelivery();
//
//        logistics = new SeaLogistics();
//        logistics.planDelivery();

        //Abstract Factory
//        GUIFactory guiFactory;
//
//        String os ="WINDOWS";
//        if (os.equals("WINDOWS")) {
//            guiFactory = new WindowsFactory();
//        } else {
//            guiFactory = new MacFactory();
//        }
//
//        Application app = new Application((guiFactory));
//        app.render();

        // Builder Pattern
//        User user = new UserBuilder()
//                .name("John Doe")
//                .age(30)
//                .email("john.doe@example.com")
//                .phone("123-456-7890")
//                .address("123 Main St")
//                .build();
//        System.out.println(user);

    // Prototype Pattern
//        Document template = new Document(
//                "Invoice Template",
//                "Dear Customer..."
//        );
//
//        Document copy1 = template.clone().clone();
//        copy1.setTitle("Invoice for John");
//
//        copy1.print();

//        Warrior basicWarrior = new Warrior("Sword", 100);
//        CharacterRegistry.register("basicWarrior", basicWarrior);
//
//        GameCharacter player1 = CharacterRegistry.getClone("basicWarrior");
//        GameCharacter player2 = CharacterRegistry.getClone("basicWarrior");
//
//        player1.attack();
//        player2.attack();

        //Adapter Pattern
//        PaymentProcessor payment = new PayPalAdapter(new PayPalService());
//        payment.pay(100.0);

        //Decorator Pattern
//        Coffee coffee = new Espresso();
//        System.out.println(coffee.getDescription());
//        System.out.println(coffee.cost());
//        System.out.println("Adding Milk, Price will increase");
//        coffee = new Milk(coffee);
//        System.out.println(coffee.getDescription());
//        System.out.println(coffee.cost());
//        coffee = new Sugar(coffee);
//        System.out.println("Adding sugar, Price will increase");
//
//        System.out.println(coffee.getDescription());
//        System.out.println(coffee.cost());

        // Bridge Pattern
//        MessageSender email = new EmailSender();
//        MessageSender sms = new SMSSender();
//        Notification notification = new UrgentNotification(email);
//        Notification notification1 = new BasicNotification(sms);
//        notification.notifyUser("Server Down");

        // Composite
//        File file1 = new File("resume.pdf");
//        File file2 = new File("photo.jpg");
//
//        Folder documents = new Folder("Documents");
//        documents.add(file1);
//        Folder pictures = new Folder("Pictures");
//        pictures.add(file2);
//
//        Folder root = new Folder("Root");
//        root.add(documents);
//        root.add(pictures);
//
//        root.showDetails();

//        TV tv = new TV();
//        SoundSystem sound = new SoundSystem();
//        StreamingDevice device = new StreamingDevice();
//
//        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(tv, sound, device);
//        theaterFacade.watchMovie("Inception");

        //Flyweight
//        String text= "HELLO";
//        int x =0;
//        for (char c : text.toCharArray()) {
//            CharacterFlyweight character = CharacterFactory.getCharacter(c);
//            character.display(x++,0);
//            System.out.println(System.identityHashCode(character));
//        }

        //Proxy Pattern
//        Image image = new ImageProxy("photo.jpg");
//        image.display();
//        image.display();


        //Chain of responsibility
//        Approver junior = new JuniorApprover();
//        Approver senior = new SeniorApprover();
//        Approver director = new Director();
//
//        junior.setNext(senior);
//        senior.setNext(director);
//
//        junior.approve(500);
//        junior.approve(5000);
//        junior.approve(50000);

        // Command Pattern
//        Light light = new Light();
//        Command turnOn = new TurnOnCommand(light);
//        Command turnOff = new TurnOffCommand(light);
//
//        RemoteControl remote = new RemoteControl();
//
//        remote.setCommand(turnOn);
//        remote.pressButton();
//
//        remote.setCommand(turnOff);
//        remote.pressButton();

        // Iterator Pattern
//        MyList<String> list = new MyList<>(5);
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        MyIterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //Mediator

//        ChatMediator chatRoom = new ChatRoom();
//        User user1 = new ChatUser(chatRoom, "Alice");
//        User user2 = new ChatUser(chatRoom, "Bob");
//        User user3 = new ChatUser(chatRoom, "Charlie");
//
//        chatRoom.addUser(user1);
//        chatRoom.addUser(user2);
//
//        chatRoom.addUser(user3);
//        user1.send("Hello everyone");

     //Memento Pattern
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.type("Hello");
//        history.save(editor.save());
//
//        editor.type("Hello World");
//        history.save(editor.save());
//
//        editor.type("Hello World!!!");
//        System.out.println("Current:"+ editor.getContent());
//
//        editor.restore(history.undo());
//        System.out.println("After undo:" +editor.getContent());
//
//
//        editor.restore(history.undo());
//        System.out.println("After second undo:"+ editor.getContent());

        //Observer Pattern
//        NewsAgency agency = new NewsAgency();
//        Observer channel1 = new NewsChannel("Channel 1");
//        Observer channel2 = new NewsChannel("Channel 2");
//
//        agency.addObserver(channel1);
//        agency.addObserver(channel2);
//
//        agency.setNews("Breaking: Design Patterns Are Awesome!");

        // State Pattern

//        VendingMachine machine = new VendingMachine();
//
//        machine.pressButton();
//        machine.insertCoin();
//        machine.pressButton();
//        machine.pressButton();

        //Strategy Pattern

//        PaymentContext context = new PaymentContext();
//
//        context.setStrategy(new CreditCardPayment()
//        );
//        context.processPayment(100);
//
//        context.setStrategy((new PayPalPayment()));
//        context.processPayment(200);
//
//        context.setStrategy(new UPIPayment());
//        context.processPayment(300);

        // Template Pattern
//        Beverage tea = new Tea();
//        tea.prepareRecipe();
//
//        System.out.println("____");
//
//        Beverage coffee = new Coffee();
//        coffee.prepareRecipe();


        //Visitor Pattern

        List<Shape> shapes = Arrays.asList(
                new Circle(5),
                new Rectangle(4,6)
        );

        Visitor areaVisitor = new AreaVisitor();

        for (Shape shape: shapes){
            shape.accept(areaVisitor);
        }



    }
}