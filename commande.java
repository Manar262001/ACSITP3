import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class commande extends JDialog{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton ajouterButton;
    private JButton modifierButton;
    private JButton supprimerButton;
    private JTable tablemed;



    private void createUIComponents() {

    }

    String[] tqble = {"IDmedicament","NOMmedicament","quantité","prix"};

    private void createTable(){

        tablemed.setModel(new DefaultTableModel(
                null,
                tqble));
    }
    public static void main(String[] args) {
        commande maCommande = new commande();

    }

}
