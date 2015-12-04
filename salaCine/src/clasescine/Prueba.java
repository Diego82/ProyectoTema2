package clasescine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane textPane = new JTextPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(96)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(109, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		textPane.setText(" aaaaaaaaaaaaaaaa aaaaaaaaaa aaaaaaaaaa aaaaaaa a a a aa sd f as df asdf asdfasdfgasd fasdgfas df asdf as dfg sd fa sdf as dgdf gbv adgb ad fbgadbf aqbgf a<xdbgaqdbgtfaqdbg awdrbhabh adrw gbh abgf aqerbt xaqc axdbg drgb qerbgtfqabtf rgtaaaaaaaaaaaaaaaa aaaaaaaaaa aaaaaaaaaa aaaaaaa a a a aa sd f as df asdf asdfasdfgasd fasdgfas df asdf as dfg sd fa sdf as dgdf gbv adgb ad fbgadbf aqbgf a<xdbgaqdbgtfaqdbg awdrbhabh adrw gbh abgf aqerbt xaqc axdbg drgb qerbgtfqabtf rgtaaaaaaaaaaaaaaaa aaaaaaaaaa aaaaaaaaaa aaaaaaa a a a aa sd f as df asdf asdfasdfgasd fasdgfas df asdf as dfg sd fa sdf as dgdf gbv adgb ad fbgadbf aqbgf a<xdbgaqdbgtfaqdbg awdrbhabh adrw gbh abgf aqerbt xaqc axdbg drgb qerbgtfqabtf rgtaaaaaaaaaaaaaaaa aaaaaaaaaa aaaaaaaaaa aaaaaaa a a a aa sd f as df asdf asdfasdfgasd fasdgfas df asdf as dfg sd fa sdf as dgdf gbv adgb ad fbgadbf aqbgf a<xdbgaqdbgtfaqdbg awdrbhabh adrw gbh abgf aqerbt xaqc axdbg drgb qerbgtfqabtf rgtaaaaaaaaaaaaaaaa aaaaaaaaaa aaaaaaaaaa aaaaaaa a a a aa sd f as df asdf asdfasdfgasd fasdgfas df asdf as dfg sd fa sdf as dgdf gbv adgb ad fbgadbf aqbgf a<xdbgaqdbgtfaqdbg awdrbhabh adrw gbh abgf aqerbt xaqc axdbg drgb qerbgtfqabtf rgtaaaaaaaaaaaaaaaa aaaaaaaaaa aaaaaaaaaa aaaaaaa a a a aa sd f as df asdf asdfasdfgasd fasdgfas df asdf as dfg sd fa sdf as dgdf gbv adgb ad fbgadbf aqbgf a<xdbgaqdbgtfaqdbg awdrbhabh adrw gbh abgf aqerbt xaqc axdbg drgb qerbgtfqabtf rgt aaaaaaaaaaaaaaaa aaaaaaaaaa aaaaaaaaaa aaaaaaa a a a aa sd f as df asdf asdfasdfgasd fasdgfas df asdf as dfg sd fa sdf as dgdf gbv adgb ad fbgadbf aqbgf a<xdbgaqdbgtfaqdbg awdrbhabh adrw gbh abgf aqerbt xaqc axdbg drgb qerbgtfqabtf rgt");
	}
}
