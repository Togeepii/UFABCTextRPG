package UFABCTextRPG;

import java.util.Vector;

/**
 *
 * @author Tiago
 */
public class Location {

    private String m_roomTitle;
    private String m_roomDesc;
    private Vector m_vecExits;
    private Vector<Creature> m_creatures;

    //construtor vazio
    public Location() {
        m_roomTitle = new String();
        m_roomDesc = new String();
        m_vecExits = new Vector();
        m_creatures = new Vector();
    }

    //construtor parcial
    public Location(String title) {
        m_roomTitle = title;
        m_roomDesc = new String();
        m_vecExits = new Vector();
        m_creatures = new Vector();
    }

    //construtor final
    public Location(String title, String desc) {
        m_roomTitle = title;
        m_roomDesc = desc;
        m_vecExits = new Vector();
        m_creatures = new Vector();
    }

    // metodo tostring
    public String toString() {
        return m_roomTitle;
    }

    //pegar titulo
    public String getTitle() {
        return m_roomTitle;
    }

    //setar titulo
    public void setTitle(String tituloLocal) {
        m_roomTitle = tituloLocal;
    }

    //pegar desccrição
    public String getDescription() {
        return m_roomDesc;
    }

    //setar descrição
    public void setDescription(String descLocal) {
        m_roomDesc = descLocal;
    }

    //adicionar saida
    public void addExit(Exit exit) {
        m_vecExits.addElement(exit);
    }

    //remover saida
    public void removeExit(Exit exit) {
        if (m_vecExits.contains(exit)) {
            m_vecExits.removeElement(exit);
        }
    }

    //retornar vetor de saidas
    public Vector getExits() {
        return (Vector) m_vecExits.clone();
    }
    //adiciona criatura
    public void addCreature(Creature creature) {
        m_creatures.addElement(creature);
    }
    //remove criatura
    public void removeCreature(Creature creature) {
        if (m_creatures.contains(creature)) {
            m_creatures.removeElement(creature);
        }
    }
    //retorna vetor de criaturas
    public Vector getCreatures() {
        return (Vector) m_creatures.clone();
    }
    //retorna criatura em posição especifica
    public Creature getCreatureAt(int i){
        return m_creatures.get(i);
    }
}
