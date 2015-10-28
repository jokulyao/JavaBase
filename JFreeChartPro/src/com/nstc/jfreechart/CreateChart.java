package com.nstc.jfreechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class CreateChart {
	public static void main(String[] args)
    {
        DefaultPieDataset dpd=new DefaultPieDataset(); //建立一个默认的饼图
        dpd.setValue("管理人员1", 25);  //输入数据
        dpd.setValue("市场人员1", 25);
        dpd.setValue("开发人员1", 45);
        dpd.setValue("其他人员1", 10);
        dpd.setValue("其他人员2", 10);
        
        JFreeChart chart=ChartFactory.createPieChart("某公司人员组织数据图2",dpd,true,true,false); 
        //可以查具体的API文档,第一个参数是标题，第二个参数是一个数据集，第三个参数表示是否显示Legend，第四个参数表示是否显示提示，第五个参数表示图中是否存在URL
        
        ChartFrame chartFrame=new ChartFrame("某公司人员组织数据图",chart); 
        //chart要放在Java容器组件中，ChartFrame继承自java的Jframe类。该第一个参数的数据是放在窗口左上角的，不是正中间的标题。
        chartFrame.pack(); //以合适的大小展现图形
        chartFrame.setVisible(true);//图形是否可见
        
    }
}
