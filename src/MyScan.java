import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Joshua on 6/23/2015.
 */
public class MyScan extends JFrame implements ActionListener{
    private int DEFAULT_WIDTH = 500;
    private int DEFAULT_HEIGHT = 200;
    private JButton loadScan;
    private JButton original;
    private JPanel mainPane;
    private JPanel rows;
    private String originalImage;
    private SoundMaker sound;
    public MyScan(){
        setLocation(200, 200);
        setTitle("Image Scanner");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sound = new SoundMaker();

        loadScan = new JButton();
        original = new JButton();
        mainPane = new JPanel();

        rows = new JPanel();

        mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));
        rows.setLayout(new BoxLayout(rows, BoxLayout.X_AXIS));
        originalImage = "images/cutecat.jpg";

        loadScan.setText("Play");
        original.setText("Pause");
        loadScan.addActionListener(this);
        original.addActionListener(this);

        rows.add(Box.createHorizontalGlue());
        rows.add(loadScan);
        rows.add(Box.createRigidArea(new Dimension(5,20)));
        rows.add(original);
        rows.add(Box.createHorizontalGlue());

        mainPane.add(rows);

        add(mainPane);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("In my listener");
        if(e.getSource() ==loadScan){
            System.out.println("Play");
            sound.play();
        }else if(e.getSource() == original){
            System.out.println("Pause");
            sound.pauseMe();
        }
    }
}
