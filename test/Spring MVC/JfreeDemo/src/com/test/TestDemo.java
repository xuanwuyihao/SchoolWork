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
		String title="逸罄有限公司汇总";
		DefaultPieDataset dataset=new DefaultPieDataset();
		dataset.setValue("外围总收入", 289088);
		dataset.setValue("项目接单", 6889088);
		dataset.setValue("游戏接单", 28328);
		dataset.setValue("软件维护", 369088);
		dataset.setValue("软件开发", 4229767);
		
		JFreeChart chart=ChartFactory.createPieChart3D(title, dataset, true, false, false);
		//设置参数
		chart.getTitle().setFont(new Font("楷体", Font.BOLD, 18));
		
		chart.getLegend().setItemFont(new Font("楷体", Font.PLAIN, 18));
		//绘图工具
		PiePlot plot=(PiePlot)chart.getPlot();
		plot.setLabelFont(new Font("楷体", Font.PLAIN, 18));
		
		//设置分裂效果
		plot.setExplodePercent("游戏接单", 0.1f);
		plot.setExplodePercent("外围收入", 0.2f);
		//设置透明度
		plot.setForegroundAlpha(0.7f);
		
		//设置比例
		//设置标签生成器
						//{0}:公司名称
						//{1}:销量
						//{2}:百分比
						//{3}:总量
						//{4}:
		plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}({1}/{3}-{2})"));
		//保存地址
		ChartUtilities.saveChartAsJPEG(new File("G:\\123.jpg"),chart,800,600);
	}
}
