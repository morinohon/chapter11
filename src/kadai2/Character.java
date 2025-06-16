package kadai2;

public abstract class Character {
    public abstract void attack(Matango m);
    String name;
    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }
}