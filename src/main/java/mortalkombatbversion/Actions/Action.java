package mortalkombatbversion.Actions;

import mortalkombatbversion.Player.Fighter;

public abstract class Action {
    public abstract String getType();
    public abstract void realisation(Fighter fighter1, Fighter fighter2, String fighter2ActionType);
}
