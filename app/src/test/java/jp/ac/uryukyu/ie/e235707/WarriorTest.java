package jp.ac.uryukyu.ie.e235707;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {
    public static void main(String[] args) {
        // テスト対象のWarriorインスタンスを生成
        Warrior warrior = new Warrior("戦士", 10, 5);

        // ダミーのLivingThingを生成
        LivingThing enemy = new LivingThing("敵", 10, 5);

        // attackWithWeaponSkillを3回実行して結果をチェック
        for (int i = 0; i < 3; i++) {
            int enemyHitPoints = enemy.getHitPoint();
            warrior.attackWithWeaponSkill(enemy);
            int damage = enemyHitPoints - enemy.getHitPoint();
            // attackメソッドが期待通りのダメージを与えたかを手動で確認
            int expectedDamage = (int) (5 * 1.5);
            assertEquals(expectedDamage, damage);
        }
    }
}