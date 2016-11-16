package UFABCTextRPG;

import java.util.Random;
import java.util.Scanner;

public class Battle {

    public static Creature player, enemy;
    static Scanner teclado = new Scanner(System.in);
    int bDef = 0;

    public Battle(Creature m_player, Creature m_enemy) {
        player = m_player;
        enemy = m_enemy;
        //System.out.println("your move");
    }

    //começa batalha
    @SuppressWarnings("empty-statement")
    public boolean run() {
        System.out.println(enemy.getDesc());
        System.out.println("Atacar ou defender?");
        while (!activate());
        //retorna se inimigo morreu
        return isDead(enemy);
    }

    public void attack(Creature a, Creature b) {

        int damage = a.getStr() / 2;
        Random ger = new Random();
        int defense = ger.nextInt(b.getDef()) + bDef;
        //int defense = b.getDef();
        damage = damage - defense;
        //erra se damage muito baixo
        if (damage < 1) {
            System.out.println("\n"+a.getName() + " errou o ataque!");
        } else {
            b.setHealth(b.getHealth() - damage);
            System.out.println("\n"+b.getName());
            if (b.getHealth() < 0) {
                System.out.println("HP: 0" + "/" + b.getMaxHealth()+"\n");
            } else {
                System.out.println("HP: " + b.getHealth() + "/" + b.getMaxHealth()+'\n');
            }
        }
        bDef = 0;
    }

    public void playerTurn() {
        String action = teclado.next();
        switch (action) {
            case "atacar":
                attack(player, enemy);
                break;
            case "defender":
                //se defender, aumenta defesa do player 
                bDef = (player.getDef() * 25) / 100;
                break;
        }
    }

    public void enemyTurn() {
        attack(enemy, player);
    }

    Boolean isDead(Creature a) {
        return a.getHealth() <= 0;
    }

    Boolean activate() {
        //random para ver quem ataca primeiro
        Random r = new Random();
        int i = r.nextInt(1);
        if (i == 0) {
            playerTurn();
            if (isDead(enemy)) {
                System.out.println(enemy.getName() + " morreu.\n");
                return true;
            }
            enemyTurn();
            if (isDead(player)) {
                System.out.println(player.getName() + " morreu.\n");
                enemy.setHealth(enemy.getMaxHealth());
                return true;
            }
        } else {
            enemyTurn();
            if (isDead(player)) {
                System.out.println(player.getName() + " morreu.\n");
                enemy.setHealth(enemy.getMaxHealth());
                return true;
            }
            playerTurn();
            if (isDead(enemy)) {
                System.out.println(enemy.getName() + " morreu.\n");
                return true;
            }
        }
        return false;
    }
}
