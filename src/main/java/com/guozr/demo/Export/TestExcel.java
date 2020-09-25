package com.guozr.demo.Export;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName TestExcel
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/22 14:31
 **/
public class TestExcel {


    public static void main(String[] args) throws Exception {
        HSSFWorkbook workbook = new HSSFWorkbook();                        // 创建工作簿对象
        String title = "武则天登基大典演讲稿";
        for (int x = 0; x < 2; x++) {
            HSSFSheet sheet = workbook.createSheet(title + x);                     // 创建工作表
            HashMap<String, Object> dataMap = new HashMap<String, Object>();
            List<HashMap<String, Object>> listMap = new ArrayList<HashMap<String, Object>>();
            for (int i = 0; i < 30; i++) {
                dataMap.put("datetime", new Date());
                dataMap.put("person", "武则天" + i);
                dataMap.put("type", "文本");
                dataMap.put("content", "今天朕登基！今天朕登基！今天朕登基！今天朕登基！今天朕登基！今天朕登基！");
                listMap.add(dataMap);
            }

            String[] rowsName = new String[]{"序号", "时间", "发言人", "类型", "消息"};
            List<Object[]> dataList = new ArrayList<Object[]>();
            Object[] objs = null;
            for (int i = 0; i < listMap.size(); i++) {
                HashMap<String, Object> data = listMap.get(i);
                objs = new Object[rowsName.length];
                objs[0] = i;
                objs[1] = data.get("datetime");
                objs[2] = data.get("person");
                objs[3] = data.get("type");
                objs[4] = data.get("content");
                dataList.add(objs);
            }

            ExcelExport ex = new ExcelExport(title, rowsName, dataList);
            ex.export(workbook, sheet, x);
        }
    }
}
