class HelloWorldApp {
    public static void main(String[] args) {
        while(true){
            System.out.println("Hello World!"); // Display the string.
            try {
                Thread.sleep(5000);
            } catch(Exception e) {
            }
        }
    }
}
