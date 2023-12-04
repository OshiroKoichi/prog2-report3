package jp.ac.uryukyu.ie.e235707;

public class Warrior extends LivingThing {

    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent) {
        if (getHitPoint() > 0 && !isDead()) {
            if (!opponent.isDead()) {
                double damage = 5 * 1.5;
                int tdamage = (int) damage;
                System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), tdamage);
                opponent.wounded(tdamage);
                if (!opponent.isDead()) {
                    opponent.attack(this);
                }
            } else {
                System.out.printf("%sはすでに死んでいて攻撃できません。\n", opponent.getName());
            }
        } else {
            System.out.printf("%sは死んでいて攻撃できません。\n", this.getName());
        }
    }
    
}