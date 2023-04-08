package NestedClass;

public class OuterClass {
    int classVariable = 15;
    public OuterClass(){
        System.out.println("I'm the Outer Class's Constructor");
    }
    private void showOuterDetails(){
        System.out.println("Class Variable: " + classVariable);
    }

    public void localInnerClass(){
        int methodVariable = 2;
        System.out.println("Method Variable: " + methodVariable);
        class LocalInnerClass{
            int localInnerVariable = 10;

            public LocalInnerClass(){
                System.out.println("I'm Local Inner Class's Constructor");
                showOuterDetails();
            }

            void showDetails(){
                System.out.println("Local Inner Class's Variable: " + localInnerVariable);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass( );
        localInnerClass.showDetails();
    }

    public class NonStaticInnerClass{
        int nonStaticInnerClassVariable = 7;
        public NonStaticInnerClass(){
            System.out.println("I'm Non Static Inner Class's Constructor");
        }
        void showDetails() {
            System.out.println("Non Static Inner Class's Variable: " + nonStaticInnerClassVariable);
            showOuterDetails();
        }
    }

    public static class StaticInnerclass{
        int staticInnerClassVariable = 5;
        public StaticInnerclass(){
            System.out.println("I'm Static Inner Class's Constructor");
        }
        void showDetails(){
            System.out.println("Static Inner Class's Variable: " + staticInnerClassVariable);
        }
    }
}

class NestedClassTest{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        //outer.showOuterDetails();
        outer.localInnerClass();

        System.out.println();

        OuterClass.NonStaticInnerClass nonStaticInnerClass = outer.new NonStaticInnerClass();
        nonStaticInnerClass.showDetails();

        System.out.println();

        OuterClass.StaticInnerclass staticInnerclass = new OuterClass.StaticInnerclass();
        staticInnerclass.showDetails();

    }
}
