package test;

class MySuper {
    int number;
    MySuper(int i) { number = i; }
}
class MySub extends MySuper {
    int count;
    MySub(int count, int num) {
        super(num);
        this.count = count;
    }
}