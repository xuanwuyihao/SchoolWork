package test;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Line_chare {
	public static void main(String[] args) throws IOException {
		 String title="逸罄有限公司汇总";
		 DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		 dataset.addValue( 289088,"外围总收入","上半年收入");
			dataset.addValue( 6889088,"项目接单","上半年收入");
			dataset.addValue( 28328,"游戏接单","上半年收入");
			dataset.addValue( 369088,"软件维护","上半年收入");
			dataset.addValue( 4229767,"软件开发","上半年收入");
			
			dataset.addValue( 389088,"外围总收入","下半年收入");
			dataset.addValue( 4889088,"项目接单","下半年收入");
			dataset.addValue( 48328,"游戏接单","下半年收入");
			dataset.addValue( 569088,"软件维护","下半年收入");
			dataset.addValue( 6229767,"软件开发","下半年收入");
			
			JFreeChart chart= ChartFactory.createLineChart(title, "季度", "销售（单位：元）", dataset, PlotOrientation.VERTICAL, true, false, false);
			
			//设置参数
			//中文
			chart.getTitle().setFont(new Font("华文行楷",Font.BOLD,18));
			//提示条
			chart.getLegend().setItemFont(new Font("华文行楷", Font.BOLD, 18));
			//画图工具
			CategoryPlot plot=(CategoryPlot)chart.getPlot();
			//域轴字体
			plot.getDomainAxis().setLabelFont(new Font("华文行楷",Font.BOLD, 18));
			plot.getDomainAxis().setTickLabelFont(new Font("华文行楷",Font.PLAIN,18));
			
			//range
			plot.getRangeAxis().setLabelFont(new Font("华文行楷", Font.PLAIN, 18));
			plot.setForegroundAlpha(0.6f);
			
			//保存地方
			ChartUtilities.saveChartAsJPEG(new File("G:\\789.jpg"), chart, 800, 800);
	}

}
