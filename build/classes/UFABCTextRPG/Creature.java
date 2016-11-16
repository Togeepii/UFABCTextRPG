package UFABCTextRPG;

public class Creature {

    private String m_name;
    private String m_desc;
    private int m_health;
    private int m_maxHealth;
    private int m_str, m_def;

    Creature() {
        m_name = null;
        m_desc = null;
        m_maxHealth = 0;
        m_health = 0;
        m_str = 0;
        m_def = 0;
    }

    public Creature(String name, String desc, int health, int str, int def) {
        m_name = name;
        m_desc = desc;
        m_maxHealth = health;
        m_health = health;
        m_str = str;
        m_def = def;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public String getDesc() {
        return m_desc;
    }

    public void setDesc(String desc) {
        m_desc = desc;
    }

    public int getHealth() {
        return m_health;
    }

    public void setHealth(int health) {
        m_health = health;
    }

    public int getMaxHealth() {
        return m_maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        m_maxHealth = maxHealth;
    }

    public int getStr() {
        return m_str;
    }

    public void setStr(int str) {
        m_str = str;
    }

    public int getDef() {
        return m_def;
    }

    public void setDef(int def) {
        m_def = def;
    }
}
