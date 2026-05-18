package pekan7_2511533011;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511533011 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3011;
    private JLabel[] labelArray_3011;
    private JButton stepButton_3011, resetButton_3011, setButton_3011;
    private JTextField inputField_3011;
    private JPanel panelArray_3011;
    private JTextArea stepArea_3011;
    private int i_3011 = 1, j_3011;
    private boolean sorting_3011 = false;
    private int stepCount_3011 = 1;
    
	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511533011() {
		setTitle("Insertion Sort Langkah per Langkah");
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
	    
	    // Event Langkah Selanjutnya\
	    stepButton_3011.addActionListener(e -> performStep_3011());
	    
	    // Event reset
	    resetButton_3011.addActionListener(e -> reset_3011 ());
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
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	                + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    i_3011 = 1;
	    stepCount_3011 = 1;
	    sorting_3011 = true;
	    stepButton_3011.setEnabled(true);
	    stepArea_3011.setText("");
	    panelArray_3011.removeAll();
	    labelArray_3011 = new JLabel[array_3011.length];
	    for (int k = 0; k < array_3011.length; k++) {
	        labelArray_3011[k] = new JLabel(String.valueOf(array_3011[k]));
	        labelArray_3011[k].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_3011[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_3011[k].setPreferredSize(new Dimension(50, 50));
	        labelArray_3011[k].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_3011.add(labelArray_3011[k]);
	    }
	    panelArray_3011.revalidate();
	    panelArray_3011.repaint();
	}
	    private void performStep_3011() {
	        if (i_3011 < array_3011.length && sorting_3011) {
	            int key_3011 = array_3011[i_3011];
	            j_3011 = i_3011 - 1;

	            StringBuilder stepLog_3011 = new StringBuilder();
	            stepLog_3011.append("Langkah ").append(stepCount_3011)
	                    .append(": Memasukkan ").append(key_3011).append("\n");

	            while (j_3011 >= 0 && array_3011[j_3011] > key_3011) {
	                array_3011[j_3011 + 1] = array_3011[j_3011];
	                j_3011--;
	            }

	            array_3011[j_3011 + 1] = key_3011;

	            updateLabels_3011();
	            stepLog_3011.append("Hasil: ")
	                    .append(arrayToString(array_3011))
	                    .append("\n\n");

	            stepArea_3011.append(stepLog_3011.toString());

	            i_3011++;
	            stepCount_3011++;

	            if (i_3011 == array_3011.length) {
	                sorting_3011 = false;
	                stepButton_3011.setEnabled(false);
	                JOptionPane.showMessageDialog(this, "Sorting selesai!");
	            }
	        }
		}
	    private void updateLabels_3011() {
	        for (int k_3011 = 0; k_3011 < array_3011.length; k_3011++) {
	            labelArray_3011[k_3011]
	                    .setText(String.valueOf(array_3011[k_3011]));
	        }
	    }

	    private void reset_3011() {
	        inputField_3011.setText("");
	        panelArray_3011.removeAll();
	        panelArray_3011.revalidate();
	        panelArray_3011.repaint();
	        stepArea_3011.setText("");
	        stepButton_3011.setEnabled(false);
	        sorting_3011 = false;
	        i_3011 = 1;
	        stepCount_3011 = 1;
	    }

	    private String arrayToString(int[] arr_3011) {
	        StringBuilder sb_3011 = new StringBuilder();

	        for (int k_3011 = 0; k_3011 < arr_3011.length; k_3011++) {
	            sb_3011.append(arr_3011[k_3011]);

	            if (k_3011 < arr_3011.length - 1) {
	                sb_3011.append(", ");
	            }
	        }

	        return sb_3011.toString();
	    }
}