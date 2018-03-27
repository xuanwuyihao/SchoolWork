package common;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bean.QQUser;

import com.sun.awt.AWTUtilities;

public class TipUi extends JFrame {

	public TipUi(QQUser self) {

		// ȥ�����ڱ�����
		setUndecorated(true);
		setSize(257, 100);
		// ��ȡ��Ļ�Ŀ��
		int width = getToolkit().getScreenSize().width;
		// ��ȡ��Ļ�ĸ߶�
		int height = getToolkit().getScreenSize().height - 30;
		width = width - this.getWidth();
		Container c = getContentPane();

		// ͷ��
		JLabel face = new JLabel(new ImageIcon(self.getFace()));
		c.add(face);
		face.setBounds(2, 20, 60, 60);

		JLabel text = new JLabel("���ĺ���(" + self.getUname() + ")������!");
		c.add(text);
		text.setBounds(80, 40, 160, 20);
		text.setFont(new Font("΢���ź�", Font.PLAIN, 12));

		// ����ͼƬ
		JLabel bgimg = new JLabel(new ImageIcon("imgs/notic.png"));
		c.add(bgimg);

		this.addMouseListener(new MyMouseListener());
		setVisible(true);
		setAlwaysOnTop(true);// ������ʾ����ǰ��
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		try {

			// (���ڳ��ֵĴ���)�ı䴰������
			for (int i = 1; i <= 75; i++) {
				setLocation(width, height - (int) (i * 1.5));
				Thread.sleep(10);
			}
			// (������ʧ�ķ���)���ô��ڵ�͸����
			for (int i = 100; i >= 1; i--) {
				// ����͸���ȣ�1~0֮�䣬0����͸���ˣ�����������
				AWTUtilities.setWindowOpacity(this, 0.01f * i);
				Thread.sleep(50);
			}
			// �رմ���
			dispose();
		} catch (Exception e) {

		}
	}

	// ���ڼ���
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			// �رմ���
			dispose();
		}
	}

}
