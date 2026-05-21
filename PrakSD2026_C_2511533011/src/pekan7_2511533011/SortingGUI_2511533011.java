package pekan7_2511533011;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;

public class SortingGUI_2511533011 extends JFrame {

    private static final long serialVersionUID = 1L;

    // INPUT FIELD
    private JTextField namaField_3011;
    private JTextField nimField_3011;
    private JTextField prodiField_3011;

    // BUTTON
    private JButton tambahButton_3011;
    private JButton hapusButton_3011;
    private JButton sortButton_3011;

    // COMBO BOX
    private JComboBox<String> comboSort_3011;

    // TEXT AREA
    private JTextArea areaData_3011;
    private JTextArea areaLangkah_3011;

    // DATA
    private ArrayList<Mahasiswa_2511533011> list_3011;

    public SortingGUI_2511533011() {

        setTitle("GUI Sorting Mahasiswa");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        list_3011 = new ArrayList<>();

        // PANEL INPUT
        JPanel panelInput_3011 = new JPanel(new FlowLayout());

        namaField_3011 = new JTextField(10);
        nimField_3011 = new JTextField(10);
        prodiField_3011 = new JTextField(10);

        tambahButton_3011 = new JButton("Tambah");
        hapusButton_3011 = new JButton("Hapus (1 Data)");
        sortButton_3011 = new JButton("Mulai Sorting");

        comboSort_3011 = new JComboBox<>();
        comboSort_3011.addItem("Insertion Sort");
        comboSort_3011.addItem("Selection Sort");
        comboSort_3011.addItem("Bubble Sort");

        panelInput_3011.add(new JLabel("Nama"));
        panelInput_3011.add(namaField_3011);

        panelInput_3011.add(new JLabel("NIM"));
        panelInput_3011.add(nimField_3011);

        panelInput_3011.add(new JLabel("Prodi"));
        panelInput_3011.add(prodiField_3011);

        panelInput_3011.add(tambahButton_3011);
        panelInput_3011.add(hapusButton_3011);
        panelInput_3011.add(comboSort_3011);
        panelInput_3011.add(sortButton_3011);

        // AREA
        areaData_3011 = new JTextArea();
        areaData_3011.setEditable(false);

        areaLangkah_3011 = new JTextArea();
        areaLangkah_3011.setEditable(false);

        JSplitPane splitPane_3011 = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(areaData_3011),
                new JScrollPane(areaLangkah_3011)
        );

        splitPane_3011.setDividerLocation(450);

        add(panelInput_3011, BorderLayout.NORTH);
        add(splitPane_3011, BorderLayout.CENTER);

        // EVENT
        tambahButton_3011.addActionListener(e -> tambahData_3011());
        hapusButton_3011.addActionListener(e -> hapusData_3011());
        sortButton_3011.addActionListener(e -> mulaiSorting_3011());
    }

    // ================= TAMBAH DATA =================
    private void tambahData_3011() {

        String nama_3011 = namaField_3011.getText().trim();
        String nim_3011 = nimField_3011.getText().trim();
        String prodi_3011 = prodiField_3011.getText().trim();

        if (nama_3011.isEmpty() || nim_3011.isEmpty() || prodi_3011.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Input tidak boleh kosong!");
            return;
        }

        list_3011.add(new Mahasiswa_2511533011(nama_3011, nim_3011, prodi_3011));
        tampilData_3011();

        namaField_3011.setText("");
        nimField_3011.setText("");
        prodiField_3011.setText("");
    }

    // ================= TAMPIL DATA =================
    private void tampilData_3011() {

        areaData_3011.setText("");

        for (Mahasiswa_2511533011 mhs_3011 : list_3011) {
            areaData_3011.append(mhs_3011.toString() + "\n");
        }
    }

    // ================= HAPUS 1 DATA (BERDASARKAN NIM) =================
    private void hapusData_3011() {

        String nimHapus_3011 = JOptionPane.showInputDialog(
                this, "Masukkan NIM yang ingin dihapus");

        if (nimHapus_3011 == null || nimHapus_3011.trim().isEmpty()) {
            return;
        }

        boolean ditemukan_3011 = false;

        for (int i_3011 = 0; i_3011 < list_3011.size(); i_3011++) {

            if (list_3011.get(i_3011)
                    .getNim_3011()
                    .equalsIgnoreCase(nimHapus_3011)) {

                list_3011.remove(i_3011);
                ditemukan_3011 = true;
                break;
            }
        }

        if (ditemukan_3011) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            tampilData_3011();
        } else {
            JOptionPane.showMessageDialog(this, "NIM tidak ditemukan");
        }
    }

    // ================= SORTING =================
    private void mulaiSorting_3011() {

        if (list_3011.size() <= 1) {
            JOptionPane.showMessageDialog(this, "Data belum cukup untuk sorting!");
            return;
        }

        areaLangkah_3011.setText("");

        String pilihan_3011 = comboSort_3011.getSelectedItem().toString();

        if (pilihan_3011.equals("Insertion Sort")) {
            insertionSort_3011();
        } else if (pilihan_3011.equals("Selection Sort")) {
            selectionSort_3011();
        } else {
            bubbleSort_3011();
        }
    }

    // ================= INSERTION SORT =================
    private void insertionSort_3011() {

        areaLangkah_3011.append("=== INSERTION SORT ===\n\n");

        new Thread(() -> {

            for (int i_3011 = 1; i_3011 < list_3011.size(); i_3011++) {

                Mahasiswa_2511533011 key_3011 = list_3011.get(i_3011);
                int j_3011 = i_3011 - 1;

                while (j_3011 >= 0 &&
                        list_3011.get(j_3011).getNama_3011()
                                .compareToIgnoreCase(key_3011.getNama_3011()) > 0) {

                    list_3011.set(j_3011 + 1, list_3011.get(j_3011));
                    j_3011--;
                }

                list_3011.set(j_3011 + 1, key_3011);

                final int langkah_3011 = i_3011 + 1;

                SwingUtilities.invokeLater(() -> {
                    tampilData_3011();
                    areaLangkah_3011.append("Langkah " + langkah_3011 + " : " + tampilNama_3011() + "\n");
                });

                delay_3011();
            }

        }).start();
    }

    // ================= SELECTION SORT =================
    private void selectionSort_3011() {

        areaLangkah_3011.append("=== SELECTION SORT ===\n\n");

        new Thread(() -> {

            for (int i_3011 = 0; i_3011 < list_3011.size() - 1; i_3011++) {

                int minIndex_3011 = i_3011;

                for (int j_3011 = i_3011 + 1; j_3011 < list_3011.size(); j_3011++) {

                    if (list_3011.get(j_3011).getNama_3011()
                            .compareToIgnoreCase(list_3011.get(minIndex_3011).getNama_3011()) < 0) {
                        minIndex_3011 = j_3011;
                    }
                }

                Mahasiswa_2511533011 temp_3011 = list_3011.get(i_3011);
                list_3011.set(i_3011, list_3011.get(minIndex_3011));
                list_3011.set(minIndex_3011, temp_3011);

                final int langkah_3011 = i_3011 + 1;

                SwingUtilities.invokeLater(() -> {
                    tampilData_3011();
                    areaLangkah_3011.append("PASS " + langkah_3011 + " : " + tampilNama_3011() + "\n");
                });

                delay_3011();
            }

        }).start();
    }

    // ================= BUBBLE SORT =================
    private void bubbleSort_3011() {

        areaLangkah_3011.append("=== BUBBLE SORT ===\n\n");

        new Thread(() -> {

            for (int i_3011 = 0; i_3011 < list_3011.size() - 1; i_3011++) {

                for (int j_3011 = 0; j_3011 < list_3011.size() - i_3011 - 1; j_3011++) {

                    if (list_3011.get(j_3011).getNama_3011()
                            .compareToIgnoreCase(list_3011.get(j_3011 + 1).getNama_3011()) > 0) {

                        Mahasiswa_2511533011 temp_3011 = list_3011.get(j_3011);
                        list_3011.set(j_3011, list_3011.get(j_3011 + 1));
                        list_3011.set(j_3011 + 1, temp_3011);
                    }
                }

                final int langkah_3011 = i_3011 + 1;

                SwingUtilities.invokeLater(() -> {
                    tampilData_3011();
                    areaLangkah_3011.append("PASS " + langkah_3011 + " : " + tampilNama_3011() + "\n");
                });

                delay_3011();
            }

        }).start();
    }

    // ================= DELAY =================
    private void delay_3011() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // ================= TAMPIL NAMA =================
    private String tampilNama_3011() {

        String hasil_3011 = "[";

        for (int i_3011 = 0; i_3011 < list_3011.size(); i_3011++) {

            hasil_3011 += list_3011.get(i_3011).getNama_3011();

            if (i_3011 != list_3011.size() - 1) {
                hasil_3011 += ", ";
            }
        }

        return hasil_3011 + "]";
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new SortingGUI_2511533011().setVisible(true);
        });
    }
}