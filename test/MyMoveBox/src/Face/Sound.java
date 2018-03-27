package Face;

import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

class Sound {
	String path = new String("musics//"); //Ŀ¼

	String file = new String("nor.mid"); //Ĭ�ϵ������ļ�����

	Sequence seq; //����

	Sequencer midi; //����һ��Sequencer���͵ı���

	boolean sign;//��־��trueΪ���ڲ��ţ���֮û�в���

	//���췽��
	public Sound() {
		loadSound();
	}
	
	//��������
	void loadSound() {
		try {
			seq = MidiSystem.getSequence(new File(path + file)); //��ȡ�����ļ���I/O��������
			midi = MidiSystem.getSequencer(); //����һ�������豸������,��ʼ������
			midi.open(); //�������豸������
			midi.setSequence(seq); //���ļ������豸������
			midi.start(); //��ʼ����
			midi.setLoopCount(Sequencer.LOOP_CONTINUOUSLY); //����ѭ������
		}
		catch ( Exception ex ) {
			ex.printStackTrace();
		}
		sign = true;
	}

	
	 //������
	void stopSound() {
		if(isplay()){//�ж��Ƿ��ڲ���
			midi.stop(); //ֹͣ����
			midi.close();//�ر��豸
			sign = false;
		}
	}
	
	//�ж�sign��ֵ��Ϊ���ʾ�ڲ��ţ�����δ����
	boolean isplay() { 
		return sign;
	}

	 //���������ļ�����
	void setMusic(String e) {
		file = e;
	}
	
	public static void main(String[] args) {
		new Sound();
	}
}