// Game Zone page 108

import javax.swing.JOptionPane;

public class MadLib
{
    public static void main(String[] args)
    {
        // Variables and constants
        // Input phase
        String noun1 = JOptionPane.showInputDialog(null, " Please enter a noun:");
        String noun2 = JOptionPane.showInputDialog(null, " Please enter a noun:");
        String adjective = JOptionPane.showInputDialog("Please enter an adjective:");
        String verb = JOptionPane.showInputDialog("Please enter a verb:");

        // Output phase
        JOptionPane.showMessageDialog(null,"Mary had a little " + noun1 + "\nIt's " + noun2 + " was " + adjective + " as snow" + "\nAnd everywhere that Mary " + verb + "\nThe " + noun1 + " was sure to go.");
    }
}