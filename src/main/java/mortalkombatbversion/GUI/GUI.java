package mortalkombatbversion.GUI;

import mortalkombatbversion.Game.Game;
import mortalkombatbversion.Mediator;
import mortalkombatbversion.Player.Item;
import mortalkombatbversion.DigitFilter;
import mortalkombatbversion.Player.Player;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends JFrame {

    Mediator mediator;
    Game game = new Game();
    int locationsNumber = 0;
    Item[] items = new Item[3];
    String nameButton = "";


    public GUI() {
        initComponents();
        try {
            game.readFromExcel();
        } catch (IOException ex) {

        }
        game.writeToTable(recordsTable);
        game.setEnemies();
        game.fight.location.setFullEnemiesList(game.getEnemies());
        playerIconLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fighter.gif")));
        attributesGroup.add(healthButton);
        attributesGroup.add(damageButton);
        itemsGroup.add(firstItemButton);
        itemsGroup.add(secondItemButton);
        itemsGroup.add(thirdItemButton);
        items[0] = new Item("Lesser Healing Potion", 0);
        items[1] = new Item("Greater Healing Potion", 0);
        items[2] = new Item("Cross of rebirth", 0);
        mediator = new Mediator(enemyHealthLabel, playerHealthLabel, endFightDialog, pointsValueLabel, experienceValueLabel,
                playerLevelLabel, enemyLevelLabel, playerDamageValueLabel, endRoundLabel, playerHealthBar,
                enemyHealthBar, endGameDialog, endGameWithoutLadderDialog, fightFrame, enemyDebuffLabel,
                victoryLabel, endGameWithoutLadderTitlleLabel, playerActionLabel, playerDebuffLabel, enemyActionLabel,
                firstItemButton, secondItemButton, thirdItemButton, enterNameField, recordsTable,
                cantUseItemDialog, itemsBagDialog, GIFLabel);
        game.fight.setMediator(mediator);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fightFrame = new JFrame();
        fightPanel = new JPanel();
        playerIconLabel = new JLabel();
        attackButton = new JButton();
        blockButton = new JButton();
        playerHealthBar = new JProgressBar();
        enemyIconLabel = new JLabel();
        enemyHealthBar = new JProgressBar();
        enemyHeroLabel = new JLabel();
        enemyDamageLabel = new JLabel();
        playerDamageLabel = new JLabel();
        playerDamageValueLabel = new JLabel();
        enemyDamageValueLabel = new JLabel();
        playerLevelLabel = new JLabel();
        fightLabel = new JLabel();
        playerHealthLabel = new JLabel();
        enemyHealthLabel = new JLabel();
        experinceTitleLabel = new JLabel();
        pointsTitleLabel = new JLabel();
        experienceValueLabel = new JLabel();
        pointsValueLabel = new JLabel();
        enemyLevelLabel = new JLabel();
        turnLabel = new JLabel();
        enemyActionLabel = new JLabel();
        playerHeroLabel = new JLabel();
        stunLabel = new JLabel();
        itemsButton = new JButton();
        locationLabel = new JLabel();
        enemyNumberLabel = new JLabel();
        playerActionLabel = new JLabel();
        enemyDebuffLabel = new JLabel();
        debuffButton = new JButton();
        playerDebuffLabel = new JLabel();
        endFightDialog = new JDialog();
        endFightPanel = new JPanel();
        endRoundLabel = new JLabel();
        nextRoundButton = new JButton();
        GIFLabel = new JLabel();
        endGameDialog = new JDialog();
        endGamePanel = new JPanel();
        victoryLabel = new JLabel();
        enterNameField = new JTextField();
        enterNameLabel = new JLabel();
        enterNameLabelBottom = new JLabel();
        endGameButton = new JButton();
        recordsTableDialog = new JDialog();
        recordsTablePanel = new JPanel();
        recordsTableLabel = new JLabel();
        recordsTableScrollPane = new JScrollPane();
        recordsTable = new JTable();
        closeRecordsTableButton = new JButton();
        endGameWithoutLadderDialog = new JDialog();
        endGameWithoutLadderPanel = new JPanel();
        endGameWithoutLadderTitlleLabel = new JLabel();
        notInLadderLabel = new JLabel();
        endGameWithoutLadderButton = new JButton();
        itemsBagDialog = new JDialog();
        itemsBagPanel = new JPanel();
        itemsBagLabel = new JLabel();
        firstItemButton = new JRadioButton();
        secondItemButton = new JRadioButton();
        thirdItemButton = new JRadioButton();
        useItemButton = new JButton();
        itemsGroup = new ButtonGroup();
        cantUseItemDialog = new JDialog();
        cantUseItemPanel = new JPanel();
        cantUseItemLabel = new JLabel();
        unavailableItemLabel = new JLabel();
        closeCantUseItemButton = new JButton();
        setLocationsFrame = new JFrame();
        setLocationsPanel = new JPanel();
        setLocationsLabel = new JLabel();
        setLocationsField = new JTextField();
        startWithLocationsButton = new JButton();
        levelUp = new JFrame();
        attributePanel = new JPanel();
        levelUpLabel = new JLabel();
        healthButton = new JRadioButton();
        damageButton = new JRadioButton();
        chooseAttributeButton = new JButton();
        attributesGroup = new ButtonGroup();
        panel = new JPanel();
        mkLabel = new JLabel();
        startButton = new JButton();
        seeResultsButton = new JButton();
        sureCloseFrame= new JFrame();
        sureClosePanel=new JPanel();
        sureCloseLabel=new JLabel();
        sureCloseButton=new JButton();

        fightPanel.setBackground(new java.awt.Color(255, 255, 255));


        attackButton.setBackground(new java.awt.Color(250, 31, 31));
        attackButton.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        attackButton.setForeground(new java.awt.Color(0, 0, 0));
        attackButton.setText("Hit");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        blockButton.setBackground(new java.awt.Color(250, 31, 31));
        blockButton.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        blockButton.setForeground(new java.awt.Color(0, 0, 0));
        blockButton.setText("Block");
        blockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockButtonActionPerformed(evt);
            }
        });

        playerHealthBar.setBackground(new java.awt.Color(204, 204, 204));
        playerHealthBar.setForeground(new java.awt.Color(7, 51, 1));
        playerHealthBar.setMaximum(80);
        playerHealthBar.setMinimum(-1);

        enemyHealthBar.setBackground(new java.awt.Color(204, 204, 204));
        enemyHealthBar.setForeground(new java.awt.Color(7, 51, 1));
        enemyHealthBar.setMinimum(-1);

        enemyHeroLabel.setBackground(new java.awt.Color(0, 0, 0));
        enemyHeroLabel.setFont(new java.awt.Font("Impact", 2, 25)); // NOI18N

        enemyDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageLabel.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        enemyDamageLabel.setText("Damage");

        playerDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerDamageLabel.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        playerDamageLabel.setText("Damage");

        playerDamageValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerDamageValueLabel.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        playerDamageValueLabel.setForeground(new java.awt.Color(250, 31, 31));
        playerDamageValueLabel.setText("16");

        enemyDamageValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageValueLabel.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        enemyDamageValueLabel.setForeground(new java.awt.Color(250, 31, 31));
        enemyDamageValueLabel.setText("16");

        playerLevelLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerLevelLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        playerLevelLabel.setText("0 level");

        fightLabel.setBackground(new java.awt.Color(255, 255, 255));
        fightLabel.setFont(new java.awt.Font("Impact", 0, 46)); // NOI18N
        fightLabel.setForeground(new java.awt.Color(250, 31, 31));
        fightLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fightLabel.setText("FIGHT!");
        fightLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        playerHealthLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerHealthLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        playerHealthLabel.setForeground(new java.awt.Color(102, 102, 102));
        playerHealthLabel.setText("80/80");

        enemyHealthLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyHealthLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        enemyHealthLabel.setForeground(new java.awt.Color(102, 102, 102));
        enemyHealthLabel.setText("80/80");

        experinceTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        experinceTitleLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        experinceTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        experinceTitleLabel.setText("experience");

        pointsTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        pointsTitleLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        pointsTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        pointsTitleLabel.setText("points");

        experienceValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        experienceValueLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        experienceValueLabel.setForeground(new java.awt.Color(0, 0, 0));
        experienceValueLabel.setText("0/40");

        pointsValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        pointsValueLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        pointsValueLabel.setForeground(new java.awt.Color(0, 0, 0));
        pointsValueLabel.setText("00");

        enemyLevelLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyLevelLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        enemyLevelLabel.setText("1 level");

        turnLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        turnLabel.setHorizontalAlignment(SwingConstants.CENTER);

        enemyActionLabel.setFont(new java.awt.Font("Impact", 1, 20)); // NOI18N
        enemyActionLabel.setForeground(new java.awt.Color(250, 31, 31));
        enemyActionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        playerHeroLabel.setFont(new java.awt.Font("Impact", 2, 25)); // NOI18N
        playerHeroLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playerHeroLabel.setText("Fighter");

        stunLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        stunLabel.setHorizontalAlignment(SwingConstants.CENTER);

        itemsButton.setBackground(new java.awt.Color(0, 0, 0));
        itemsButton.setFont(new java.awt.Font("Impact", 1, 20)); // NOI18N
        itemsButton.setForeground(new java.awt.Color(250, 31, 31));
        itemsButton.setText("Items");
        itemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsButtonActionPerformed(evt);
            }
        });

        locationLabel.setText("Current location:");

        enemyNumberLabel.setText("Enemy number:");

        playerActionLabel.setFont(new java.awt.Font("Impact", 1, 20)); // NOI18N
        playerActionLabel.setForeground(new java.awt.Color(250, 31, 31));
        playerActionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        debuffButton.setBackground(new java.awt.Color(250, 31, 31));
        debuffButton.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        debuffButton.setForeground(new java.awt.Color(0, 0, 0));
        debuffButton.setText("Debuff");
        debuffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debuffButtonActionPerformed(evt);
            }
        });

        GroupLayout fightPanelLayout = new GroupLayout(fightPanel);
        fightPanel.setLayout(fightPanelLayout);

        fightPanelLayout.setHorizontalGroup(
                fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fightPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                        .addComponent(enemyDamageLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(enemyDamageValueLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                        .addGap(10, 10, 10)
                                                                                        .addComponent(enemyHeroLabel, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                        .addComponent(enemyHealthBar, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                                        .addGap(92, 92, 92)
                                                                                                        .addComponent(pointsTitleLabel))
                                                                                                .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(enemyHealthLabel)
                                                                                                        .addGap(62, 62, 62)
                                                                                                        .addComponent(pointsValueLabel)
                                                                                                        .addGap(108, 108, 108)
                                                                                                        .addComponent(experienceValueLabel))))
                                                                                .addGroup(GroupLayout.Alignment.TRAILING, fightPanelLayout.createSequentialGroup()
                                                                                        .addComponent(enemyDebuffLabel, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(129, 129, 129)))
                                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                .addComponent(enemyIconLabel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                                .addGap(72, 72, 72)
                                                                                                .addComponent(turnLabel, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(enemyActionLabel, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(stunLabel, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(playerActionLabel, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))))
                                                                .addGap(28, 28, 28))
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addComponent(locationLabel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(enemyNumberLabel)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(itemsButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(attackButton, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addComponent(playerDebuffLabel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(playerLevelLabel)
                                                                .addGap(26, 26, 26))
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                .addComponent(playerHealthBar, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(playerHealthLabel))
                                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                                .addComponent(playerDamageLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(playerDamageValueLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(45, 45, 45))
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addComponent(playerIconLabel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(60, 60, 60))
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addComponent(playerHeroLabel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(144, 144, 144))
                                                        .addGroup(GroupLayout.Alignment.LEADING, fightPanelLayout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addComponent(blockButton, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(debuffButton, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())))
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addGap(323, 323, 323)
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(fightLabel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(experinceTitleLabel))
                                                .addContainerGap())))
                        .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(fightPanelLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(enemyLevelLabel)
                                        .addContainerGap(854, Short.MAX_VALUE)))
        );
        fightPanelLayout.setVerticalGroup(
                fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, fightPanelLayout.createSequentialGroup()
                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addContainerGap(22, Short.MAX_VALUE)
                                                .addComponent(fightLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(experinceTitleLabel)
                                                        .addComponent(pointsTitleLabel))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(experienceValueLabel)
                                                        .addComponent(pointsValueLabel)
                                                        .addComponent(enemyHealthLabel)))
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(playerHealthBar, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                                        .addComponent(enemyHealthBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(playerHealthLabel)))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(playerDamageLabel)
                                        .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(enemyDamageLabel)
                                                .addComponent(enemyDamageValueLabel)
                                                .addComponent(playerDamageValueLabel)))
                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(enemyDebuffLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(enemyIconLabel, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(enemyHeroLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(locationLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(enemyNumberLabel))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(playerLevelLabel)
                                                                        .addComponent(playerDebuffLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(6, 6, 6)
                                                                .addComponent(playerIconLabel, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                                                .addComponent(enemyActionLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(playerActionLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(45, 45, 45)
                                                                .addComponent(turnLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(stunLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(playerHeroLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                                .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(attackButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(itemsButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(blockButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(debuffButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14))))
                        .addGroup(fightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(fightPanelLayout.createSequentialGroup()
                                        .addGap(229, 229, 229)
                                        .addComponent(enemyLevelLabel)
                                        .addContainerGap(380, Short.MAX_VALUE)))
        );

        GroupLayout fightFrameLayout = new GroupLayout(fightFrame.getContentPane());
        fightFrame.getContentPane().setLayout(fightFrameLayout);
        fightFrameLayout.setHorizontalGroup(
                fightFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fightFrameLayout.createSequentialGroup()
                                .addComponent(fightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        fightFrameLayout.setVerticalGroup(
                fightFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fightPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        endFightPanel.setBackground(new java.awt.Color(255, 255, 255));

        endRoundLabel.setBackground(new java.awt.Color(204, 204, 204));
        endRoundLabel.setFont(new java.awt.Font("Impact", 1, 30)); // NOI18N
        endRoundLabel.setForeground(new java.awt.Color(250, 31, 31));
        endRoundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        endRoundLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        nextRoundButton.setBackground(new java.awt.Color(204, 204, 204));
        nextRoundButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        nextRoundButton.setText("Next");
        nextRoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRoundButtonActionPerformed(evt);
            }
        });

        GroupLayout endFightPanelLayout = new GroupLayout(endFightPanel);
        endFightPanel.setLayout(endFightPanelLayout);

        endFightPanelLayout.setHorizontalGroup(
                endFightPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(endFightPanelLayout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addComponent(endRoundLabel, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)  // Левее, на одном уровне
                                .addGap(18, 18, 18)
                                .addComponent(nextRoundButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
                        .addComponent(GIFLabel, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)
        );

        endFightPanelLayout.setVerticalGroup(
                endFightPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(endFightPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(endFightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(endRoundLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nextRoundButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(GIFLabel, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );


        GroupLayout endFightDialogLayout = new GroupLayout(endFightDialog.getContentPane());
        endFightDialog.getContentPane().setLayout(endFightDialogLayout);
        endFightDialogLayout.setHorizontalGroup(
                endFightDialogLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(endFightDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(endFightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        endFightDialogLayout.setVerticalGroup(
                endFightDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(endFightDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(endFightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        endGamePanel.setBackground(new java.awt.Color(204, 204, 204));

        victoryLabel.setFont(new java.awt.Font("Impact", 3, 25)); // NOI18N
        victoryLabel.setForeground(new java.awt.Color(250, 31, 31));
        victoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        victoryLabel.setText("ПОБЕДА!");

        enterNameField.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        enterNameField.setHorizontalAlignment(JTextField.CENTER);
        enterNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameFieldActionPerformed(evt);
            }
        });

        enterNameLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        enterNameLabel.setForeground(new java.awt.Color(102, 102, 102));
        enterNameLabel.setText("Запишите свое имя");

        enterNameLabelBottom.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        enterNameLabelBottom.setForeground(new java.awt.Color(102, 102, 102));
        enterNameLabelBottom.setText("для таблицы рекордов");

        endGameButton.setBackground(new java.awt.Color(204, 204, 204));
        endGameButton.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        endGameButton.setForeground(new java.awt.Color(51, 51, 51));
        endGameButton.setText("Закончить игру");
        endGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameButtonActionPerformed(evt);
            }
        });

        GroupLayout endGamePanelLayout = new GroupLayout(endGamePanel);
        endGamePanel.setLayout(endGamePanelLayout);
        endGamePanelLayout.setHorizontalGroup(
                endGamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, endGamePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(endGameButton)
                                .addGap(14, 14, 14))
                        .addGroup(endGamePanelLayout.createSequentialGroup()
                                .addGroup(endGamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(endGamePanelLayout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addComponent(enterNameLabelBottom))
                                        .addGroup(endGamePanelLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(victoryLabel, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(endGamePanelLayout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addGroup(endGamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(enterNameField, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(enterNameLabel))))
                                .addContainerGap(62, Short.MAX_VALUE))
        );
        endGamePanelLayout.setVerticalGroup(
                endGamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(endGamePanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(victoryLabel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enterNameLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterNameLabelBottom)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(enterNameField, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endGameButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        GroupLayout endGameDialogLayout = new GroupLayout(endGameDialog.getContentPane());
        endGameDialog.getContentPane().setLayout(endGameDialogLayout);
        endGameDialogLayout.setHorizontalGroup(
                endGameDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(endGameDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(endGamePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        endGameDialogLayout.setVerticalGroup(
                endGameDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(endGameDialogLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(endGamePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        recordsTablePanel.setBackground(new java.awt.Color(253, 252, 252));

        recordsTableLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        recordsTableLabel.setForeground(new java.awt.Color(250, 31, 31));
        recordsTableLabel.setHorizontalAlignment(SwingConstants.CENTER);
        recordsTableLabel.setText("Таблица результатов");

        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "ИМЯ", "ОЧКИ"
                }
        )
        {
            Class[] types = new Class [] {
                    String.class, Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        });
        recordsTableScrollPane.setViewportView(recordsTable);

        closeRecordsTableButton.setBackground(new java.awt.Color(255, 255, 255));
        closeRecordsTableButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        closeRecordsTableButton.setForeground(new java.awt.Color(250, 31, 31));
        closeRecordsTableButton.setText("Закрыть");
        closeRecordsTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeRecordsTableButtonActionPerformed(evt);
            }
        });

        GroupLayout recordsTablePanelLayout = new GroupLayout(recordsTablePanel);
        recordsTablePanel.setLayout(recordsTablePanelLayout);
        recordsTablePanelLayout.setHorizontalGroup(
                recordsTablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(recordsTablePanelLayout.createSequentialGroup()
                                .addGroup(recordsTablePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(closeRecordsTableButton, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(recordsTablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(recordsTablePanelLayout.createSequentialGroup()
                                                        .addGap(160, 160, 160)
                                                        .addComponent(recordsTableLabel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(recordsTablePanelLayout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(recordsTableScrollPane, GroupLayout.PREFERRED_SIZE, 527, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        recordsTablePanelLayout.setVerticalGroup(
                recordsTablePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(recordsTablePanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(recordsTableLabel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recordsTableScrollPane, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeRecordsTableButton, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout recordsTableDialogLayout = new GroupLayout(recordsTableDialog.getContentPane());
        recordsTableDialog.getContentPane().setLayout(recordsTableDialogLayout);
        recordsTableDialogLayout.setHorizontalGroup(
                recordsTableDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(recordsTablePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        recordsTableDialogLayout.setVerticalGroup(
                recordsTableDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(recordsTablePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        endGameWithoutLadderPanel.setBackground(new java.awt.Color(204, 204, 204));

        endGameWithoutLadderTitlleLabel.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        endGameWithoutLadderTitlleLabel.setForeground(new java.awt.Color(250, 31, 31));
        endGameWithoutLadderTitlleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        endGameWithoutLadderTitlleLabel.setText("ПОБЕДА!");

        notInLadderLabel.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        notInLadderLabel.setForeground(new java.awt.Color(102, 102, 102));
        notInLadderLabel.setText("Извините, вы не в Топ-10 игроков");

        endGameWithoutLadderButton.setBackground(new java.awt.Color(204, 204, 204));
        endGameWithoutLadderButton.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        endGameWithoutLadderButton.setForeground(new java.awt.Color(51, 51, 51));
        endGameWithoutLadderButton.setText("Закончить игру");
        endGameWithoutLadderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameWithoutLadderButtonActionPerformed(evt);
            }
        });

        GroupLayout endGameWithoutLadderPanelLayout = new GroupLayout(endGameWithoutLadderPanel);
        endGameWithoutLadderPanel.setLayout(endGameWithoutLadderPanelLayout);
        endGameWithoutLadderPanelLayout.setHorizontalGroup(
                endGameWithoutLadderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                                .addGroup(endGameWithoutLadderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(endGameWithoutLadderTitlleLabel, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(notInLadderLabel, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(endGameWithoutLadderButton, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(68, Short.MAX_VALUE))
        );
        endGameWithoutLadderPanelLayout.setVerticalGroup(
                endGameWithoutLadderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(endGameWithoutLadderTitlleLabel, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(notInLadderLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(endGameWithoutLadderButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(56, Short.MAX_VALUE))
        );

        GroupLayout endGameWithoutLadderDialogLayout = new GroupLayout(endGameWithoutLadderDialog.getContentPane());
        endGameWithoutLadderDialog.getContentPane().setLayout(endGameWithoutLadderDialogLayout);
        endGameWithoutLadderDialogLayout.setHorizontalGroup(
                endGameWithoutLadderDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(endGameWithoutLadderPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        endGameWithoutLadderDialogLayout.setVerticalGroup(
                endGameWithoutLadderDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(endGameWithoutLadderPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        itemsBagPanel.setBackground(new java.awt.Color(148, 148, 148, 255));

        itemsBagLabel.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        itemsBagLabel.setForeground(new java.awt.Color(250, 31, 31));
        itemsBagLabel.setHorizontalAlignment(SwingConstants.CENTER);
        itemsBagLabel.setText("Сумка предметов");

        firstItemButton.setBackground(new java.awt.Color(204, 204, 204));
        firstItemButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        firstItemButton.setText("Lesser Healing Potion, 0 pcs");
        firstItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstItemButtonActionPerformed(evt);
            }
        });

        secondItemButton.setBackground(new java.awt.Color(204, 204, 204));
        secondItemButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        secondItemButton.setText("Greater Healing Potion, 0 pcs");
        secondItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondItemButtonActionPerformed(evt);
            }
        });

        thirdItemButton.setBackground(new java.awt.Color(204, 204, 204));
        thirdItemButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        thirdItemButton.setText("Cross of rebirth, 0 pcs");

        useItemButton.setBackground(new java.awt.Color(204, 204, 204));
        useItemButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        useItemButton.setForeground(new java.awt.Color(250, 31, 31));
        useItemButton.setText("Использовать");
        useItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useItemButtonActionPerformed(evt);
            }
        });

        GroupLayout itemsBagPanelLayout = new GroupLayout(itemsBagPanel);
        itemsBagPanel.setLayout(itemsBagPanelLayout);
        itemsBagPanelLayout.setHorizontalGroup(
                itemsBagPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(itemsBagPanelLayout.createSequentialGroup()
                                .addGroup(itemsBagPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(itemsBagPanelLayout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addGroup(itemsBagPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(secondItemButton)
                                                        .addComponent(thirdItemButton, GroupLayout.Alignment.LEADING)
                                                        .addComponent(firstItemButton, GroupLayout.Alignment.LEADING)
                                                        .addComponent(itemsBagLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(itemsBagPanelLayout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(useItemButton)))
                                .addContainerGap(105, Short.MAX_VALUE))
        );
        itemsBagPanelLayout.setVerticalGroup(
                itemsBagPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(itemsBagPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(itemsBagLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(firstItemButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondItemButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thirdItemButton)
                                .addGap(50, 50, 50)
                                .addComponent(useItemButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(54, Short.MAX_VALUE))
        );

        GroupLayout itemsBagDialogLayout = new GroupLayout(itemsBagDialog.getContentPane());
        itemsBagDialog.getContentPane().setLayout(itemsBagDialogLayout);
        itemsBagDialogLayout.setHorizontalGroup(
                itemsBagDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(itemsBagPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        itemsBagDialogLayout.setVerticalGroup(
                itemsBagDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(itemsBagPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cantUseItemPanel.setBackground(new java.awt.Color(255, 255, 255));

        cantUseItemLabel.setFont(new java.awt.Font("Impact", 1, 20)); // NOI18N
        cantUseItemLabel.setForeground(new java.awt.Color(250, 31, 31));
        cantUseItemLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cantUseItemLabel.setText("Вы не можете использовать ");

        unavailableItemLabel.setFont(new java.awt.Font("Impact", 1, 20)); // NOI18N
        unavailableItemLabel.setForeground(new java.awt.Color(250, 31, 31));
        unavailableItemLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unavailableItemLabel.setText("этот предмет");

        closeCantUseItemButton.setBackground(new java.awt.Color(204, 204, 204));
        closeCantUseItemButton.setFont(new java.awt.Font("Impact", 0, 25)); // NOI18N
        closeCantUseItemButton.setForeground(new java.awt.Color(250, 31, 31));
        closeCantUseItemButton.setText("ОК");
        closeCantUseItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCantUseItemButtonActionPerformed(evt);
            }
        });

        GroupLayout cantUseItemPanelLayout = new GroupLayout(cantUseItemPanel);
        cantUseItemPanel.setLayout(cantUseItemPanelLayout);
        cantUseItemPanelLayout.setHorizontalGroup(
                cantUseItemPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(cantUseItemPanelLayout.createSequentialGroup()
                                .addContainerGap(82, Short.MAX_VALUE)
                                .addGroup(cantUseItemPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, cantUseItemPanelLayout.createSequentialGroup()
                                                .addComponent(cantUseItemLabel)
                                                .addGap(58, 58, 58))
                                        .addGroup(GroupLayout.Alignment.TRAILING, cantUseItemPanelLayout.createSequentialGroup()
                                                .addComponent(unavailableItemLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addGap(135, 135, 135))))
                        .addGroup(cantUseItemPanelLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(closeCantUseItemButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        cantUseItemPanelLayout.setVerticalGroup(
                cantUseItemPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(cantUseItemPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(cantUseItemLabel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unavailableItemLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(closeCantUseItemButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
        );

        GroupLayout cantUseItemDialogLayout = new GroupLayout(cantUseItemDialog.getContentPane());
        cantUseItemDialog.getContentPane().setLayout(cantUseItemDialogLayout);
        cantUseItemDialogLayout.setHorizontalGroup(
                cantUseItemDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(cantUseItemPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cantUseItemDialogLayout.setVerticalGroup(
                cantUseItemDialogLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(cantUseItemPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setLocationsLabel.setText("<html>Сколько локаций вы хотите пройти?</html>");
        setLocationsLabel.setBackground(new java.awt.Color(204, 204, 204));
        setLocationsLabel.setFont(new java.awt.Font("Impact", 1, 25)); // NOI18N
        setLocationsLabel.setForeground(new java.awt.Color(250, 31, 31));
        PlainDocument doc = (PlainDocument) setLocationsField.getDocument();
        doc.setDocumentFilter(new DigitFilter());

        setLocationsField.setText("");
        setLocationsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLocationsFieldActionPerformed(evt);
            }
        });


        startWithLocationsButton.setFont(new java.awt.Font("Impact", 0, 15));
        startWithLocationsButton.setText("Начать");
        startWithLocationsButton.setBackground(new java.awt.Color(204, 204, 204));;
        startWithLocationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startWithLocationsButtonActionPerformed(evt);
            }
        });

        GroupLayout setLocationsPanelLayout = new GroupLayout(setLocationsPanel);
        setLocationsPanel.setLayout(setLocationsPanelLayout);
        setLocationsPanelLayout.setHorizontalGroup(
                setLocationsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(setLocationsPanelLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(setLocationsLabel, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))
                        .addGroup(setLocationsPanelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(setLocationsField, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startWithLocationsButton)
                                .addGap(18, 18, 18))
        );
        setLocationsPanelLayout.setVerticalGroup(
                setLocationsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(setLocationsPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(setLocationsLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(setLocationsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(setLocationsField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(startWithLocationsButton))
                                .addGap(27, 27, 27))
        );

        GroupLayout setLocationsFrameLayout = new GroupLayout(setLocationsFrame.getContentPane());
        setLocationsFrame.getContentPane().setLayout(setLocationsFrameLayout);
        setLocationsFrameLayout.setHorizontalGroup(
                setLocationsFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(setLocationsFrameLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(setLocationsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setLocationsFrameLayout.setVerticalGroup(
                setLocationsFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(setLocationsFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(setLocationsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        levelUpLabel.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        levelUpLabel.setForeground(new java.awt.Color(250, 31, 3));
        levelUpLabel.setText("Что вы хотите улучшить?");

        healthButton.setFont(new java.awt.Font("Impact", 0, 20));
        healthButton.setText("Здоровье");
        healthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthButtonActionPerformed(evt);
            }
        });

        damageButton.setSelected(true);
        damageButton.setFont(new java.awt.Font("Impact", 0, 20));
        damageButton.setText("Урон");

        chooseAttributeButton.setFont(new java.awt.Font("Impact", 0, 20));
        chooseAttributeButton.setText("ОК");
        chooseAttributeButton.setBackground(new java.awt.Color(204, 204, 204));
        chooseAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseAttributeButtonActionPerformed(evt);
            }
        });

        GroupLayout attributePanelLayout = new GroupLayout(attributePanel);
        attributePanel.setLayout(attributePanelLayout);
        attributePanelLayout.setHorizontalGroup(
                attributePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(attributePanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(healthButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(damageButton)
                                .addGap(32, 32, 32))
                        .addGroup(attributePanelLayout.createSequentialGroup()
                                .addGroup(attributePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(attributePanelLayout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(levelUpLabel))
                                        .addGroup(attributePanelLayout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(chooseAttributeButton)))
                                .addContainerGap(90, Short.MAX_VALUE))
        );
        attributePanelLayout.setVerticalGroup(
                attributePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(attributePanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(levelUpLabel)
                                .addGap(66, 66, 66)
                                .addGroup(attributePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(healthButton)
                                        .addComponent(damageButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(chooseAttributeButton)
                                .addGap(35, 35, 35))
        );

        GroupLayout levelUpLayout = new GroupLayout(levelUp.getContentPane());
        levelUp.getContentPane().setLayout(levelUpLayout);
        levelUpLayout.setHorizontalGroup(
                levelUpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(levelUpLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(attributePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        levelUpLayout.setVerticalGroup(
                levelUpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(levelUpLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(attributePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        mkLabel.setFont(new java.awt.Font("Impact", 0, 38)); // NOI18N
        mkLabel.setForeground(new java.awt.Color(250, 31, 31));
        mkLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mkLabel.setVerticalAlignment(SwingConstants.CENTER);
        mkLabel.setText("Mortal Kombat");

        startButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        startButton.setText("Начать новую игру");
        startButton.setBackground(new java.awt.Color(204, 204, 204));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        seeResultsButton.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        seeResultsButton.setText("Посмотреть таблицу результатов");
        seeResultsButton.setBackground(new java.awt.Color(204, 204, 204));
        seeResultsButton.setHorizontalAlignment(SwingConstants.TRAILING);
        seeResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeResultsButtonActionPerformed(evt);
            }
        });

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(seeResultsButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                        .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mkLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(mkLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(seeResultsButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        setLocationsFrame.setVisible(true);
        setLocationsFrame.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_startButtonActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        game.fight.hit(1, game.getResults(), locationsNumber, game.getEnemies());
    }//GEN-LAST:event_attackButtonActionPerformed

    private void blockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockButtonActionPerformed
        game.fight.hit(0, game.getResults(), locationsNumber, game.getEnemies());
    }//GEN-LAST:event_blockButtonActionPerformed

    private void nextRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRoundButtonActionPerformed
        locationLabel.setText("Текущая локация: " + game.fight.location.getCurrentLocation() + "/" + locationsNumber);
        locationLabel.setFont(new java.awt.Font("Impact", 0, 15));
        locationLabel.setForeground(new java.awt.Color(250, 31, 31));
        if ((game.fight.location.getCurrentEnemyNumber() + 1) <= game.fight.location.getEnemiesAtLocation().size()) {
            enemyNumberLabel.setText(" ");
        } else {
            enemyNumberLabel.setText(" ");
        }
        fightFrame.setVisible(true);
        if (game.action.checkExperience(game.fight.getPlayer())) {
            game.action.levelUp(game.fight.getPlayer(), game.getEnemies());
            game.fight.location.setFullEnemiesList(game.getEnemies());
            levelUp.setVisible(true);
            levelUp.setBounds(300, 200, 430, 350);
        }
        game.fight.setEnemy(game.fight.location.getCurrentEnemy());
        enemyIconLabel.setIcon(game.fight.getEnemy().getIcon());
        enemyDamageValueLabel.setText(Integer.toString(game.fight.getEnemy().getDamage()));
        enemyHealthLabel.setText(Integer.toString(game.fight.getEnemy().getHealth()) + "/" + Integer.toString(game.fight.getEnemy().getMaxHealth()));
        enemyHeroLabel.setText(game.fight.getEnemy().getName());
        mediator.setHealthBar(game.fight.getEnemy());
        enemyHealthBar.setMaximum(game.fight.getEnemy().getMaxHealth());
        game.fight.newRound();

        mediator.setNewRoundTexts(game.fight.getPlayer(), game.fight.getEnemy(), game.fight.getPlayer().getItems());


        endFightDialog.dispose();

    }//GEN-LAST:event_nextRoundButtonActionPerformed

    private void enterNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameFieldActionPerformed

    private void endGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameButtonActionPerformed
        String playerName = enterNameField.getText().trim();
        if (playerName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Введите имя!.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                game.endGameTop(game.fight.getPlayer(), enterNameField, recordsTable);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            endGameDialog.dispose();
            enterNameField.setText("");
        }
    }//GEN-LAST:event_endGameButtonActionPerformed

    private void closeRecordsTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeRecordsTableButtonActionPerformed
        recordsTableDialog.dispose();
    }//GEN-LAST:event_closeRecordsTableButtonActionPerformed

    private void seeResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeResultsButtonActionPerformed
        recordsTableDialog.setVisible(true);
        recordsTableDialog.setBounds(100, 100, 580, 450);
    }//GEN-LAST:event_seeResultsButtonActionPerformed

    private void endGameWithoutLadderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameWithoutLadderButtonActionPerformed
        endGameWithoutLadderDialog.dispose();
    }//GEN-LAST:event_endGameWithoutLadderButtonActionPerformed

    private void firstItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstItemButtonActionPerformed

    private void secondItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondItemButtonActionPerformed

    private void useItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useItemButtonActionPerformed
        if (firstItemButton.isSelected()) {
            nameButton = "First item";
        }
        if (secondItemButton.isSelected()) {
            nameButton = "Second item";
        }
        if (thirdItemButton.isSelected()) {
            nameButton = "Third item";
        }
        Player player = game.fight.getPlayer();
        game.action.useItem(player, ((Player) player).getItems(), nameButton, mediator);
        mediator.setHealthBar(player);
        playerHealthLabel.setText(player.getHealth() + "/" + player.getMaxHealth());
        mediator.setBagText(player.getItems());
    }//GEN-LAST:event_useItemButtonActionPerformed

    private void itemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsButtonActionPerformed
        itemsBagDialog.setVisible(true);
        itemsBagDialog.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_itemsButtonActionPerformed

    private void closeCantUseItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCantUseItemButtonActionPerformed
        cantUseItemDialog.dispose();
    }//GEN-LAST:event_closeCantUseItemButtonActionPerformed

    private void startWithLocationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startWithLocationsButtonActionPerformed
        setLocationsFrame.setVisible(false);
        locationsNumber = Integer.parseInt(setLocationsField.getText());
        game.fight.location.newGameLocation();
            if (locationsNumber > 0) {
                locationLabel.setText("Текущая локация: " + game.fight.location.getCurrentLocation() + "/" + locationsNumber);
                locationLabel.setFont(new java.awt.Font("Impact", 0, 15));
                locationLabel.setForeground(new java.awt.Color(250, 31, 31)); game.fight.setPlayer(game.newPlayer(mediator, items));
                game.fight.location.setEnemiesAtLocation(game.fight.getPlayer().getLevel());
                game.fight.newGameFight(game.getEnemies());
                fightFrame.setVisible(true);
                fightFrame.setSize(1000, 700);
                fightFrame.setLocationRelativeTo(null);
                if ((game.fight.location.getCurrentEnemyNumber() + 1) <= game.fight.location.getEnemiesAtLocation().size()) {
                    enemyNumberLabel.setText(" ");
                } else {
                    enemyNumberLabel.setText(" ");
                }
                game.fight.setEnemy(game.fight.location.getCurrentEnemy());
                enemyIconLabel.setIcon(game.fight.getEnemy().getIcon());
                enemyDamageValueLabel.setText(Integer.toString(game.fight.getEnemy().getDamage()));
                enemyHealthLabel.setText(Integer.toString(game.fight.getEnemy().getHealth()) + "/" + Integer.toString(game.fight.getEnemy().getMaxHealth()));
                enemyHeroLabel.setText(game.fight.getEnemy().getName());
                mediator.setHealthBar(game.fight.getEnemy());
                enemyHealthBar.setMaximum(game.fight.getEnemy().getMaxHealth());

                game.fight.newRound();

                mediator.setNewRoundTexts(game.fight.getPlayer(), game.fight.getEnemy(), game.fight.getPlayer().getItems());

                endFightDialog.dispose();
            } else {
                JOptionPane.showMessageDialog(setLocationsFrame, "Пожалуйста, выберете количество больше 0");
            }
    }//GEN-LAST:event_startWithLocationsButtonActionPerformed

    private void setLocationsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLocationsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setLocationsFieldActionPerformed

    private void healthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthButtonActionPerformed

    private void chooseAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseAttributeButtonActionPerformed
        if (healthButton.isSelected()) {
            game.action.addHealthPlayer(game.fight.getPlayer());
        } else {
            game.action.addDamagePlayer(game.fight.getPlayer());
        }
        mediator.setNewRoundTexts(game.fight.getPlayer(), game.fight.getEnemy(), game.fight.getPlayer().getItems());
        levelUp.dispose();
    }//GEN-LAST:event_chooseAttributeButtonActionPerformed

    private void debuffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debuffButtonActionPerformed
        game.fight.hit(2, game.getResults(), locationsNumber, game.getEnemies());
    }//GEN-LAST:event_debuffButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JFrame sureCloseFrame;
    private JPanel sureClosePanel;
    private JButton sureCloseButton;
    private JLabel sureCloseLabel;
    private JLabel GIFLabel;
    private JButton attackButton;
    private JPanel attributePanel;
    private ButtonGroup attributesGroup;
    private JButton blockButton;
    private JDialog cantUseItemDialog;
    private JLabel cantUseItemLabel;
    private JPanel cantUseItemPanel;
    private JButton chooseAttributeButton;
    private JButton closeCantUseItemButton;
    private JButton closeRecordsTableButton;
    private JRadioButton damageButton;
    private JButton debuffButton;
    private JDialog endFightDialog;
    private JPanel endFightPanel;
    private JButton endGameButton;
    private JDialog endGameDialog;
    private JPanel endGamePanel;
    private JButton endGameWithoutLadderButton;
    private JDialog endGameWithoutLadderDialog;
    private JPanel endGameWithoutLadderPanel;
    private JLabel endGameWithoutLadderTitlleLabel;
    private JLabel endRoundLabel;
    private JLabel enemyActionLabel;
    private JLabel enemyDamageLabel;
    private JLabel enemyDamageValueLabel;
    private JLabel enemyDebuffLabel;
    private JProgressBar enemyHealthBar;
    private JLabel enemyHealthLabel;
    private JLabel enemyHeroLabel;
    private JLabel enemyIconLabel;
    private JLabel enemyLevelLabel;
    private JLabel enemyNumberLabel;
    private JTextField enterNameField;
    private JLabel enterNameLabel;
    private JLabel enterNameLabelBottom;
    private JLabel experienceValueLabel;
    private JLabel experinceTitleLabel;
    private JFrame fightFrame;
    private JLabel fightLabel;
    private JPanel fightPanel;
    private JRadioButton firstItemButton;
    private JRadioButton healthButton;
    private JDialog itemsBagDialog;
    private JLabel itemsBagLabel;
    private JPanel itemsBagPanel;
    private JButton itemsButton;
    private ButtonGroup itemsGroup;
    public static JFrame levelUp;
    private JLabel levelUpLabel;
    private JLabel locationLabel;
    private JLabel mkLabel;
    private JButton nextRoundButton;
    private JLabel notInLadderLabel;
    private JPanel panel;
    private JLabel playerActionLabel;
    private JLabel playerDamageLabel;
    private JLabel playerDamageValueLabel;
    private JLabel playerDebuffLabel;
    private JProgressBar playerHealthBar;
    private JLabel playerHealthLabel;
    private JLabel playerHeroLabel;
    private JLabel playerIconLabel;
    private JLabel playerLevelLabel;
    private JLabel pointsTitleLabel;
    private JLabel pointsValueLabel;
    private JTable recordsTable;
    private JDialog recordsTableDialog;
    private JLabel recordsTableLabel;
    private JPanel recordsTablePanel;
    private JScrollPane recordsTableScrollPane;
    private JRadioButton secondItemButton;
    private JButton seeResultsButton;
    private JTextField setLocationsField;
    private JFrame setLocationsFrame;
    private JLabel setLocationsLabel;
    private JPanel setLocationsPanel;
    private JButton startButton;
    private JButton startWithLocationsButton;
    private JLabel stunLabel;
    private JRadioButton thirdItemButton;
    private JLabel turnLabel;
    private JLabel unavailableItemLabel;
    private JButton useItemButton;
    private JLabel victoryLabel;

}

