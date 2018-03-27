package com.test;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		String title="�������޹�˾����";
		DefaultPieDataset dataset=new DefaultPieDataset();
		dataset.setValue("��Χ������", 289088);
		dataset.setValue("��Ŀ�ӵ�", 6889088);
		dataset.setValue("��Ϸ�ӵ�", 28328);
		dataset.setValue("���ά��", 369088);
		dataset.setValue("�������", 4229767);
		
		JFreeChart chart=ChartFactory.createPieChart3D(title, dataset, true, false, false);
		//���ò���
		chart.getTitle().setFont(new Font("����", Font.BOLD, 18));
		
		chart.getLegend().setItemFont(new Font("����", Font.PLAIN, 18));
		//��ͼ����
		PiePlot plot=(PiePlot)chart.getPlot();
		plot.setLabelFont(new Font("����", Font.PLAIN, 18));
		
		//���÷���Ч��
		plot.setExplodePercent("��Ϸ�ӵ�", 0.1f);
		plot.setExplodePercent("��Χ����", 0.2f);
		//����͸����
		plot.setForegroundAlpha(0.7f);
		
		//���ñ���
		//���ñ�ǩ������
						//{0}:��˾����
						//{1}:����
						//{2}:�ٷֱ�
						//{3}:����
						//{4}:
		plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}({1}/{3}-{2})"));
		//�����ַ
		ChartUtilities.saveChartAsJPEG(new File("G:\\123.jpg"),chart,800,600);
	}
}
