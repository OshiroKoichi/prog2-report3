import jp.ac.uryukyu.ie.e235707.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("戦士", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( !warrior.isDead() && !enemy.isDead()){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeaponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    
        
    }

    public static void attackTest(Hero hero, Enemy enemy) {
        int defaultHeroHp = hero.getHitPoint(); // hitPoint() を getHitPoint() に修正
        
        hero.attack(enemy);
        enemy.attack(hero);
    
        // アサーションを実行
        if (defaultHeroHp == hero.getHitPoint()) {
            System.out.println("攻撃テストが成功しました！");
        } else {
            System.out.println("攻撃テストが失敗しました！");
        }
    }
    
}