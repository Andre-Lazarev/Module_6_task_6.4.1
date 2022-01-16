public class SubClass extends SuperClass {
    SubClass(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public int add(int v) {
        return super.add(v) + a;
    }

    public void test(){
        if (this.a > this.b) {
            System.out.println("Параметр а больше чем параметр b на " + (this.a-this.b));
        } else
            System.out.println("Параметр b больше чем параметр а на " + (this.b-this.a));
    }
}
