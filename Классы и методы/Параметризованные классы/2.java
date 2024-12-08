/*
Конструкции <? extends T> и <? super T> делают методы более универсальными и гибкими, позволяя работать с разными типами данных при сохранении безопасности типов. 
<? extends T> используется для ограничения сверху, чтобы безопасно читать данные типа `T` или его подклассов.  
<? super T> применяется для ограничения снизу, чтобы безопасно добавлять данные типа `T` или его суперклассов.  
Они помогают контролировать допустимые типы и обеспечивают надёжную работу с обобщениями в Java.
*/

class Wrapper1<T extends Number> { // T должен быть Number
    public T item;

    public Wrapper1(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Wrapper2<T super Integer> { // T должен быть Integer или его НАДкласс
    public T item;

    public Wrapper2(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class Main {
    public static void main(String[] args) {
        Wrapper1<Integer> intWrapper = new Wrapper1<>(42);
        System.out.println("Wrapper1 item: " + intWrapper.getItem());

        Wrapper1<Double> doubleWrapper = new Wrapper1<>(3.14);
        System.out.println("Wrapper1 item: " + doubleWrapper.getItem());

        Wrapper2<Object> objectWrapper = new Wrapper2<>(new Object());
        objectWrapper.setItem(42); 
        System.out.println("Wrapper2 item: " + objectWrapper.getItem());
    }
}
