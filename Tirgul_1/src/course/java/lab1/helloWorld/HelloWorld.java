package course.java.lab1.helloWorld;

import course.java.lab1.data.Worker;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Worker[] workers = new Worker[10];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
            workers[i].setAge(25 + i);
        }

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getAge());
        }
    }
}
