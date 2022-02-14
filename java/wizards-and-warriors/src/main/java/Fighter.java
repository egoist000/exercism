abstract class Fighter {

    boolean isVulnerable() {
        return this.getClass().equals(Warrior.class) ? false : this.isVulnerable();
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    boolean spellReady = false;

    @Override
    boolean isVulnerable() {
        return !spellReady;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return spellReady ? 12 : 3;
    }

    void prepareSpell() {
        spellReady = true;
    }

}
