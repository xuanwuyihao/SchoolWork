package com.test;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Testpie {

	public static void main(String[] args) throws IOException {
		String title="�������޹�˾����";
		DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		dataset.addValue( 289088,"��Χ������","�ϰ�������");
		dataset.addValue( 6889088,"��Ŀ�ӵ�","�ϰ�������");
		dataset.addValue( 28328,"��Ϸ�ӵ�","�ϰ�������");
		dataset.addValue( 369088,"����ά��","�ϰ�������");
		dataset.addValue( 4229767,"��������","�ϰ�������");
		
		dataset.addValue( 389088,"��Χ������","�°�������");
		dataset.addValue( 4889088,"��Ŀ�ӵ�","�°�������");
		dataset.addValue( 48328,"��Ϸ�ӵ�","�°�������");
		dataset.addValue( 569088,"����ά��","�°�������");
		dataset.addValue( 6229767,"��������","�°�������");
		
		JFreeChart chart=ChartFactory.createBarChart(title, "����","���루��λ��Ԫ��", dataset, PlotOrientation.VERTICAL,true,false,false);
		
		//���ò���
		//����
		chart.getTitle().setFont(new Font("΢���ź�", Font.BOLD, 25));
		
		//��ʾ��
		chart.getLegend().setItemFont(new Font("΢���ź�", Font.BOLD, 18));
		
		CategoryPlot plot=(CategoryPlot)chart.getPlot();
		//��������
		plot.getDomainAxis().setLabelFont(new Font("΢���ź�", Font.BOLD, 18));
		//С��ǩ����
		plot.getDomainAxis().setTickLabelFont(new Font("΢���ź�", Font.PLAIN, 15));
		
		//range
		plot.getRangeAxis().setLabelFont(new Font("�����п�", Font.PLAIN, 18));
		
		plot.setForegroundAlpha(0.6f);
		
		//����ط�
		ChartUtilities.saveChartAsJPEG(new File("G:\\456.jpg"), chart, 1200, 800);
		
		
	}
}