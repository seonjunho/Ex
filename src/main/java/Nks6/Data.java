package Nks6;

class Data { int x; }

    class PrimitiveParamEx {
        public static void main(String[] args) {
            Data d = new Data();
            d.x = 10;
            System.out.println("main() : x = " +d.x);

            change(d.x);
            System.out.println("After change(d.x)");
            System.out.println("main() : x = " + d.x);

        }
        static void change(int x){
            x = 100;
            System.out.println("chage() : x =" +x);
        }
    }

