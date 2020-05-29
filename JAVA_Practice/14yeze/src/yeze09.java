import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

public class yeze09 extends JFrame{
	Container pane;
	JLabel la = new JLabel();
	
	yeze09(){
		pane = getContentPane();
		pane.add(la);
		createMenu();
		this.setTitle("menu와 file chooser 예제");
		this.setSize(250,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void createMenu(){
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("file");
		JMenuItem openitem = new JMenuItem("Open");
		openitem.addActionListener(new ActionListener(){
			JFileChooser chooser = new JFileChooser();
			public void actionPerformed(ActionEvent arg0) {
				FileNameExtensionFilter filter = new FileNameExtensionFilter
						("JPG & GIF","jpg","gif");
				chooser.setFileFilter(filter);
				int ret = chooser.showOpenDialog(null);
				if (ret!=JFileChooser.APPROVE_OPTION){
					JOptionPane.showMessageDialog
					(null,"파일을 선택하지 않으셨네요ㅋ","경고",JOptionPane.WARNING_MESSAGE);
					return;
				}
				String filePath = chooser.getSelectedFile().getPath();
				la.setIcon(new ImageIcon(filePath));
				pack();
			}
		});
		fileMenu.add(openitem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze09();
	}

}
