package pekan8_2511533011;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class BubbleSortGUI_2511533011 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3011;
    private JLabel[] labelArray_3011;
    private JButton stepButton_3011, resetButton_3011, setButton_3011;
    private JTextField inputField_3011;
    private JPanel panelArray_3011;
    private JTextArea stepArea_3011;
    private int i_3011 = 0, j_3011; // i_3011 diinisialisasi 0 agar sinkron dengan setArrayFromInput
    private boolean sorting_3011 = false;
    private int stepCount_3011 = 1;
    
    /**
     * Create the frame.
     */
    public BubbleSortGUI_2511533011() {
        setTitle("Bubble Sort Langkah per Langkah"); // Disesuaikan dengan logika Bubble Sort di bawah
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_3011 = new JPanel(new FlowLayout());
        inputField_3011 = new JTextField(30);
        setButton_3011 = new JButton("Set Array");
        inputPanel_3011.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_3011.add(inputField_3011);
        inputPanel_3011.add(setButton_3011);

        // Panel array visual
        panelArray_3011 = new JPanel();
        panelArray_3011.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_3011 = new JPanel();
        stepButton_3011 = new JButton("Langkah Selanjutnya");
        resetButton_3011 = new JButton("Reset");
        stepButton_3011.setEnabled(false);
        controlPanel_3011.add(stepButton_3011);
        controlPanel_3011.add(resetButton_3011);
        
        // Area teks untuk log langkah-langkah
        stepArea_3011 = new JTextArea(8, 60);
        stepArea_3011.setEditable(false);
        stepArea_3011.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3011 = new JScrollPane(stepArea_3011);

        // Tambahkan panel ke frame
        add(inputPanel_3011, BorderLayout.NORTH);
        add(panelArray_3011, BorderLayout.CENTER);
        add(controlPanel_3011, BorderLayout.SOUTH);
        add(scrollPane_3011, BorderLayout.EAST);
        
        // Event Set Array
        setButton_3011.addActionListener(e -> setArrayFromInput_3011());
        
        // Event Langkah Selanjutnya
        stepButton_3011.addActionListener(e -> performStep_3011());
        
        // Event reset
        resetButton_3011.addActionListener(e -> reset_3011());
    }

    private void setArrayFromInput_3011() {
        String text = inputField_3011.getText().trim();
        if (text.isEmpty()) return;
        String[] parts = text.split(",");
        array_3011 = new int[parts.length];
        try {
            for (int k = 0; k < parts.length; k++) {
                array_3011[k] = Integer.parseInt(parts[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
                    + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        i_3011 = 0;
        j_3011 = 0;
        stepCount_3011 = 1;
        sorting_3011 = true;
        stepButton_3011.setEnabled(true);
        stepArea_3011.setText("");
        panelArray_3011.removeAll();
        labelArray_3011 = new JLabel[array_3011.length];
        for (int k = 0; k < array_3011.length; k++) {
            labelArray_3011[k] = new JLabel(String.valueOf(array_3011[k]));
            labelArray_3011[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3011[k].setOpaque(true);
            labelArray_3011[k].setBackground(Color.WHITE);
            labelArray_3011[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3011[k].setPreferredSize(new Dimension(50, 50));
            labelArray_3011[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3011.add(labelArray_3011[k]);
        }
        panelArray_3011.revalidate();
        panelArray_3011.repaint();
    }

    private void performStep_3011() {
        if (!sorting_3011 || i_3011 >= array_3011.length - 1) {
            sorting_3011 = false;
            stepButton_3011.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }
        
        resetHighlights_3011(); // Perbaikan: Memanggil method pembantu dengan benar
        
        StringBuilder stepLog = new StringBuilder();
        labelArray_3011[j_3011].setBackground(Color.CYAN);
        labelArray_3011[j_3011 + 1].setBackground(Color.CYAN);
        
        if (array_3011[j_3011] > array_3011[j_3011 + 1]) {
            // Swap
            int temp = array_3011[j_3011];
            array_3011[j_3011] = array_3011[j_3011 + 1];
            array_3011[j_3011 + 1] = temp;
            labelArray_3011[j_3011].setBackground(Color.RED);
            labelArray_3011[j_3011 + 1].setBackground(Color.RED);
            stepLog.append("Langkah ").append(stepCount_3011).append(": Menukar elemen ke-")
                    .append(j_3011).append(" (").append(array_3011[j_3011 + 1]).append(") dengan ke-")
                    .append(j_3011 + 1).append(" (").append(array_3011[j_3011]).append(")\n");
        } else {
            stepLog.append("Langkah ").append(stepCount_3011).append(": Tidak ada pertukaran antara ke-")
                    .append(j_3011).append(" (").append(array_3011[j_3011]).append(") dan ke-").append(j_3011 + 1).append("\n");
        }
        
        stepLog.append("Hasil: ").append(arrayToString_3011(array_3011)).append("\n\n");
        stepArea_3011.append(stepLog.toString());
        updateLabels_3011();
        
        j_3011++;
        if (j_3011 >= array_3011.length - i_3011 - 1) {
            j_3011 = 0;
            i_3011++;
        }
        stepCount_3011++;
        
        if (i_3011 >= array_3011.length - 1) {
            sorting_3011 = false;
            stepButton_3011.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_3011() {
        for (int k = 0; k < array_3011.length; k++) {
            labelArray_3011[k].setText(String.valueOf(array_3011[k]));
        }
    }

    private void resetHighlights_3011() { // Perbaikan: Nama method disinkronkan
        for (JLabel label : labelArray_3011) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset_3011() { // Perbaikan: Nama method disinkronkan
        inputField_3011.setText("");
        panelArray_3011.removeAll();
        panelArray_3011.revalidate();
        panelArray_3011.repaint();
        stepArea_3011.setText("");
        stepButton_3011.setEnabled(false);
        sorting_3011 = false;
        i_3011 = 0;
        j_3011 = 0;
        stepCount_3011 = 1;
    }

    private String arrayToString_3011(int[] arr) { // Perbaikan: Nama method disinkronkan
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);
            if (k < arr.length - 1) sb.append(", ");
        }
        return sb.toString();
    } 

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
            BubbleSortGUI_2511533011 gui = new BubbleSortGUI_2511533011();
            gui.setVisible(true);
        });
    }
}