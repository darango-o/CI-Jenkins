public class Main {
    public static void main(String[] args) {
        String env = System.getenv("ENV");
        System.out.println("Env: "+env);
        System.out.println("The length of the environment word is: " + charCount(env));
    }

    private static int charCount(String word){
        return word.length();
    }
}