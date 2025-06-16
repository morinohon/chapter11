package kadai2;

public class Wizard extends Character {
    int attackDamage = 7;

    @Override
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("魔法使いは火の玉を放った!");
        System.out.println("敵に" + this.attackDamage + "のダメージをあたえた！");
    }
}
