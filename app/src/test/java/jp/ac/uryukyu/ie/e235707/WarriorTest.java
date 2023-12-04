package jp.ac.uryukyu.ie.e235707;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    public void testAttackWithWeaponSkill() {
        // テスト対象のWarriorインスタンスを生成
        Warrior warrior = new Warrior("戦士", 10, 5);

        // ダミーのLivingThingを生成
        LivingThing enemy = new LivingThing("敵", 10, 5);

        // attackWithWeaponSkillを3回実行して結果をチェック
        for (int i = 0; i < 3; i++) {
            int enemyHitPoints = enemy.getHitPoint();
            if(enemy.isAlive()){
                warrior.attackWithWeaponSkill(enemy);
            int expectedDamage =(int) (5 * 1.5);
            int damage = enemyHitPoints - enemy.getHitPoint();
            System.out.printf("Enemy Hit Points: %d, Damage: %d\n", enemyHitPoints, damage);
            System.out.printf("Expected Damage: %d, Actual Damage: %d\n", expectedDamage, damage);
            assertEquals(expectedDamage, damage, 0.0001);
            }else{
                System.out.println("敵はすでに死んでいて攻撃できません。");
            }
        }
    }
}
