public class Main {
    public static void main(String[] args) {
        String env = System.getenv("ENV");
        System.out.println("Env: "+env);
        CharacterCounter cc = new CharacterCounter();
        System.out.println("The length of the environment word is: " + cc.charCount(env));
    }
}