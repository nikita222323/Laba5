package mortalkombatbversion.Actions;

import mortalkombatbversion.Player.Fighter;

public class Heal extends Action {

    @Override
    public String getType() {
        return "Heal";
    }

    @Override
    public void realisation(Fighter fighter1, Fighter fighter2, String fighter2ActionType) {
        switch (fighter2ActionType) {
            case "Hit" -> {
            }
            case "Block" -> {
                fighter1.setHealth((fighter1.getMaxHealth() - fighter1.getHealth()) / 2 + fighter1.getHealth());
            }
            case "Debuff" -> {
            }
            case "Heal" -> {
            }
        }
    }
}

