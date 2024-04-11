package battele_hand;


import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 class Testframe extends JFrame {
     // Variables declaration - do not modify    
                    
     JButton btnciseau;
     JButton btnpapier;
     JButton btnpiere;
     JLabel result;
     JLabel scorordi;
     JLabel scorplayer;
     JLabel screenordi;
     JLabel screenplayer;

    public Testframe() {
        initComponents();

    }

                             
    @SuppressWarnings("deprecation")
    private void initComponents() {
        
        scorplayer = new JLabel();
        scorordi = new JLabel();
        result = new JLabel();
        btnpapier = new JButton();
        btnpiere = new JButton();
        btnciseau = new JButton();
        screenplayer = new JLabel();
        screenordi = new JLabel();
        
        scorplayer.setBackground(new Color(102, 255, 255));
        scorplayer.setFont(new Font("Segoe Print", 1, 18)); 
        scorplayer.setHorizontalAlignment(SwingConstants.CENTER);
        scorplayer.setText("0");
        scorplayer.setOpaque(true);
        scorplayer.setBounds(40, 40, 150, 40);

        scorordi.setBackground(new Color(102, 255, 255));
        scorordi.setFont(new Font("Segoe Print", 1, 18)); 
        scorordi.setHorizontalAlignment(SwingConstants.CENTER);
        scorordi.setText("0");
        scorordi.setOpaque(true);
        scorordi.setBounds(320, 40, 150, 40);

        result.setBackground(new Color(102, 255, 255));
        result.setFont(new Font("Segoe Print", 1, 24)); 
        result.setForeground(new Color(0, 0, 255));
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setText("New Game");
        result.setOpaque(true);
        result.setBounds(140, 260, 250, 70);

        btnpapier.setBackground(new Color(153, 0, 255));
        btnpapier.setFont(new Font("Segoe Print", 1, 18)); 
        btnpapier.setForeground(new Color(255, 255, 255));
        btnpapier.setText("Papier");
        btnpapier.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnpapier.setCursor(new Cursor(HAND_CURSOR));
        btnpapier.setHorizontalTextPosition(SwingConstants.CENTER);
        btnpapier.setFocusable(false);
        btnpapier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnpapierActionPerformed(evt);
            }
        });
        btnpapier.setBounds(30, 360, 130, 80);
        
        btnpiere.setBackground(new Color(153, 0, 255));
        btnpiere.setFont(new Font("Segoe Print", 1, 18)); 
        btnpiere.setForeground(new Color(255, 255, 255));
        btnpiere.setText("Piere");
        btnpiere.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnpiere.setCursor(new Cursor(HAND_CURSOR));
        btnpiere.setHorizontalTextPosition(SwingConstants.CENTER);
        btnpiere.setFocusable(false);
        btnpiere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnpiereActionPerformed(evt);
            }
        });
        btnpiere.setBounds(200, 360, 130, 80);

        btnciseau.setBackground(new Color(153, 0, 255));
        btnciseau.setFont(new Font("Segoe Print", 1, 18)); 
        btnciseau.setForeground(new Color(255, 255, 255));
        btnciseau.setText("Ciseaux");
        btnciseau.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnciseau.setCursor(new Cursor(HAND_CURSOR));
        btnciseau.setHorizontalTextPosition(SwingConstants.CENTER);
        btnciseau.setFocusable(false);
        btnciseau.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnciseauActionPerformed(evt);
            }
        });
        btnciseau.setBounds(370, 360, 130, 80);
        
        screenplayer.setFont(new Font("Segoe Print", 1, 18)); 
        screenplayer.setHorizontalAlignment(SwingConstants.CENTER);
        screenplayer.setIcon(new ImageIcon("src//img//1.png")); 
        screenplayer.setBackground(new Color(0x123456));
        screenplayer.setOpaque(true);
        screenplayer.setBounds(40, 90, 150, 150);
        
        screenordi.setFont(new Font("Segoe Print", 1, 18)); 
        screenordi.setHorizontalAlignment(SwingConstants.CENTER);
        screenordi.setIcon(new ImageIcon("src//img//1.png")); 
        screenordi.setBackground(new Color(0x123456));
        screenordi.setOpaque(true);
        screenordi.setBounds(320, 90, 150, 150);

        this.setLayout(null);
        this.setSize(new Dimension(550, 507));
        this.setLocationRelativeTo(null);
        this.add(scorplayer);
        this.add(scorordi);
        this.add(result);
        this.add(btnpapier);
        this.add(btnpiere);
        this.add(btnciseau);
        this.add(screenplayer);
        this.add(screenordi);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }// </editor-fold>                        
    
    int scoreplayer=0 , scoreordi=0;
    int choixordi, choixplayer ;
    
    private void choixordinateur (){
        Random r = new Random();
        choixordi=r.nextInt(3);
        switch(choixordi){
            case 0 -> screenordi.setIcon(new ImageIcon("src//img//paper.png"));
            case 1 ->  screenordi.setIcon(new ImageIcon("src//img//rock.png"));
            case 2 ->  screenordi.setIcon(new ImageIcon("src//img//scissors.png"));
        }
        
    }
    
    
    private void winer(){
        if ( (choixordi == 0 && choixplayer == 0) || (choixordi == 1 && choixplayer == 1) || (choixordi == 2 && choixplayer == 2)) 
        {
            result.setText("Draw");
            scorordi.setText(String.valueOf(scoreordi));
            scorplayer.setText(String.valueOf(scoreplayer));
        }
        else if ( (choixordi == 0 && choixplayer == 1) || (choixordi == 1 && choixplayer == 2) || (choixordi == 2 && choixplayer == 0) ){ 
            this.scoreordi++;
            result.setText("The computer win");
            scorordi.setText(String.valueOf(scoreordi));
            scorplayer.setText(String.valueOf(scoreplayer));
        }
        else
        {
            this.scoreplayer++;
            result.setText("You Win ");
            scorordi.setText(String.valueOf(scoreordi));
            scorplayer.setText(String.valueOf(scoreplayer));
        }
    }
    
    private void terminer () {
        if (scoreplayer == 3) {
            int nbr = JOptionPane.showConfirmDialog(this, "Congratulation you win !! wish you continue", "end of game", JOptionPane.YES_NO_OPTION);
            if (nbr == 1 ) System.exit(0);
            else {
                scoreplayer=0;
                scoreordi=0;
                scorordi.setText(String.valueOf(scoreordi));
                scorplayer.setText(String.valueOf(scoreplayer));
                result.setText("New Game");
                screenplayer.setIcon(new ImageIcon("src//img//1.png"));
                screenordi.setIcon(new ImageIcon("src//img//1.png"));
            }
        }
        else if (scoreordi == 3) {
            int nbr = JOptionPane.showConfirmDialog(this, "Computer win !! wish you continue", "end of game", JOptionPane.YES_NO_OPTION);
            if (nbr == 1 ) System.exit(0);
            else {
                scoreplayer=0;
                scoreordi=0;
                result.setText("New Game");
                scorordi.setText(String.valueOf(scoreordi));
                scorplayer.setText(String.valueOf(scoreplayer));
                screenplayer.setIcon(new ImageIcon("src//img//1.png"));
                screenordi.setIcon(new ImageIcon("src//img//1.png"));
            }
        }
        
    }

    private void btnpapierActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screenplayer.setIcon(new ImageIcon("src//img//paper.png"));
        choixplayer =0;
        choixordinateur();
        winer();
        terminer();
    }                                         

    private void btnpiereActionPerformed(java.awt.event.ActionEvent evt) {                                         
        screenplayer.setIcon(new ImageIcon("src//img//rock.png"));
        choixplayer =1;
        choixordinateur();
        winer();
        terminer();
    }                                        

    private void btnciseauActionPerformed(java.awt.event.ActionEvent evt) {                                          
        screenplayer.setIcon(new ImageIcon("src//img//scissors.png"));
        choixplayer =2;
        choixordinateur();
        winer();
        terminer();
    }                                         

                       
}

public class Themain {
    public static void main(String args[]) {
        Testframe frame = new Testframe(); //creates a frame
        frame.setTitle("Rock paprer scissors"); //sets title of frame
        ImageIcon image = new ImageIcon("src//img//logo.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground( new Color(0x123456));
        frame.setVisible(true);
        
         
    }
}


