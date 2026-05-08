class Demo {
    public static void ok() {
        System.out.println("ok start runging");

        System.out.println("ok end runging");
    }

    public static void main(String[] args) {
        System.out.println("main start runging");
        Demo.ok();
        System.out.println("main end runging");
        Demo.ok();
    }
}