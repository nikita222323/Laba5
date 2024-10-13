package mortalkombatbversion.Player;

import javax.swing.ImageIcon;

public class Enemy extends Fighter {

    private String name;
    private ImageIcon icon;

    public Enemy(String name, int level, int maxHealth, int damage) {
        super(level, maxHealth, damage);
        this.name = name;
        this.icon = loadIcon(name);
    }

    @Override
    public String getName() {
        return name;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    private ImageIcon loadIcon(String enemyName) {
        String basePath = "/" + enemyName.replace(" ", "_").replace("-", "");

        String[] extensions = {".png", ".jpg", ".jpeg", ".gif"};
        for (String ext : extensions) {
            String imagePath = basePath + ext;
            if (getClass().getResource(imagePath) != null) {
                return new ImageIcon(getClass().getResource(imagePath));
            }
        }

        return new ImageIcon();
    }
}
