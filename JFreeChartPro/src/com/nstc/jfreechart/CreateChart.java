package com.nstc.jfreechart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class CreateChart {
	public static void main(String[] args)
    {
        DefaultPieDataset dpd=new DefaultPieDataset(); //����һ��Ĭ�ϵı�ͼ
        dpd.setValue("������Ա1", 25);  //��������
        dpd.setValue("�г���Ա1", 25);
        dpd.setValue("������Ա1", 45);
        dpd.setValue("������Ա1", 10);
        dpd.setValue("������Ա2", 10);
        
        JFreeChart chart=ChartFactory.createPieChart("ĳ��˾��Ա��֯����ͼ2",dpd,true,true,false); 
        //���Բ�����API�ĵ�,��һ�������Ǳ��⣬�ڶ���������һ�����ݼ���������������ʾ�Ƿ���ʾLegend�����ĸ�������ʾ�Ƿ���ʾ��ʾ�������������ʾͼ���Ƿ����URL
        
        ChartFrame chartFrame=new ChartFrame("ĳ��˾��Ա��֯����ͼ",chart); 
        //chartҪ����Java��������У�ChartFrame�̳���java��Jframe�ࡣ�õ�һ�������������Ƿ��ڴ������Ͻǵģ��������м�ı��⡣
        chartFrame.pack(); //�Ժ��ʵĴ�Сչ��ͼ��
        chartFrame.setVisible(true);//ͼ���Ƿ�ɼ�
        
    }
}
