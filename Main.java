package PracticeForCT1;

class PClass{
    void mFnc(){
        System.out.println("Hello from P Class!");
    }
    void mFnc(double d1){
        System.out.println("Double value: " + d1);
    }
}

class CClass extends PClass{
    void mFnc(){
        System.out.println("Hello from C class!");
        super.mFnc(11.22);
    }
    void mFnc(int a2, double d2){
        mFnc(d2);
        System.out.println("Integer value: " + a2);
    }
}
class Main {
    public static void main(String[] args) {
        PClass pObj = new PClass();
        CClass cObj = new CClass();

        pObj.mFnc();
        cObj.mFnc();
        cObj.mFnc(10,2.99);
        cObj.mFnc(3.145);
    }
}
