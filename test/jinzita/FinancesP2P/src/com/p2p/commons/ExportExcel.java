package com.p2p.commons;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * 鍔熻兘: [POI瀹炵幇鎶婃暟鎹簱鏁版嵁瀵煎嚭鍒癊xcel]
 * 浣滆��: JML
 * 鐗堟湰: 1.0
 */
public class ExportExcel {

    /**
     * 鍔熻兘: 瀵煎嚭涓篍xcel宸ヤ綔绨�
     * 鍙傛暟: sheetName[宸ヤ綔绨夸腑鐨勪竴寮犲伐浣滆〃鐨勫悕绉癩
     * 鍙傛暟: titleName[琛ㄦ牸鐨勬爣棰樺悕绉癩
     * 鍙傛暟: headers[琛ㄦ牸姣忎竴鍒楃殑鍒楀悕]
     * 鍙傛暟: dataSet[瑕佸鍑虹殑鏁版嵁婧怾
     * 鍙傛暟: resultUrl[瀵煎嚭鐨別xcel鏂囦欢鍦板潃]
     * 鍙傛暟: pattern[鏃堕棿绫诲瀷鏁版嵁鐨勬牸寮廬
     */
    public static void exportExcel(String sheetName,String titleName,String[] headers,Collection<?> dataSet,String resultUrl,String pattern) {

        doExportExcel(sheetName,titleName,headers,dataSet,resultUrl,pattern);

    }

    /**
     * 鍔熻兘:鐪熸瀹炵幇瀵煎嚭
     */
    private static void doExportExcel(String sheetName,String titleName,String[] headers,Collection<?> dataSet,String resultUrl,String pattern) {

        // 澹版槑涓�涓伐浣滆杽
        HSSFWorkbook workbook = new HSSFWorkbook();

        // 鐢熸垚涓�涓伐浣滆〃
        HSSFSheet sheet = workbook.createSheet(sheetName);
        // 璁剧疆宸ヤ綔琛ㄩ粯璁ゅ垪瀹藉害涓�20涓瓧鑺�
        sheet.setDefaultColumnWidth((short) 20);
        //鍦ㄥ伐浣滆〃涓悎骞堕琛屽苟灞呬腑
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,headers.length-1));

        // 鍒涘缓[鏍囬]鏍峰紡
        HSSFCellStyle titleStyle = workbook.createCellStyle();
        // 璁剧疆[鏍囬]鏍峰紡
        titleStyle.setFillForegroundColor(HSSFColor.LIGHT_BLUE.index);
        titleStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        titleStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        titleStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        titleStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        titleStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        titleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //鍒涘缓[鏍囬]瀛椾綋
        HSSFFont titleFont = workbook.createFont();
        //璁剧疆[鏍囬]瀛椾綋
        titleFont.setColor(HSSFColor.WHITE.index);
        titleFont.setFontHeightInPoints((short) 24);
        titleFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 鎶奫鏍囬瀛椾綋]搴旂敤鍒癧鏍囬鏍峰紡]
        titleStyle.setFont(titleFont);

        // 鍒涘缓[鍒楅]鏍峰紡
        HSSFCellStyle headersStyle = workbook.createCellStyle();
        // 璁剧疆[鍒楅]鏍峰紡
        headersStyle.setFillForegroundColor(HSSFColor.LIGHT_ORANGE.index);
        headersStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        headersStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        headersStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        headersStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        headersStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        headersStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //鍒涘缓[鍒楅]瀛椾綋
        HSSFFont headersFont = workbook.createFont();
        //璁剧疆[鍒楅]瀛椾綋
        headersFont.setColor(HSSFColor.VIOLET.index);
        headersFont.setFontHeightInPoints((short) 12);
        headersFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 鎶奫鍒楅瀛椾綋]搴旂敤鍒癧鍒楅鏍峰紡]
        headersStyle.setFont(headersFont);

        // 鍒涘缓[琛ㄤ腑鏁版嵁]鏍峰紡
        HSSFCellStyle dataSetStyle = workbook.createCellStyle();
        // 璁剧疆[琛ㄤ腑鏁版嵁]鏍峰紡
        dataSetStyle.setFillForegroundColor(HSSFColor.GOLD.index);
        dataSetStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        dataSetStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        dataSetStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        dataSetStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
        dataSetStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
        dataSetStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        dataSetStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        // 鍒涘缓[琛ㄤ腑鏁版嵁]瀛椾綋
        HSSFFont dataSetFont = workbook.createFont();
        // 璁剧疆[琛ㄤ腑鏁版嵁]瀛椾綋
        dataSetFont.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
        dataSetFont.setColor(HSSFColor.BLUE.index);
        // 鎶奫琛ㄤ腑鏁版嵁瀛椾綋]搴旂敤鍒癧琛ㄤ腑鏁版嵁鏍峰紡]
        dataSetStyle.setFont(dataSetFont);

        //鍒涘缓鏍囬琛�-澧炲姞鏍峰紡-璧嬪��
        HSSFRow titleRow = sheet.createRow(0);
        HSSFCell titleCell = titleRow.createCell(0);
        titleCell.setCellStyle(titleStyle);
        titleCell.setCellValue(titleName);

        // 鍒涘缓鍒楅-澧炲姞鏍峰紡-璧嬪��
        HSSFRow row = sheet.createRow(1);
        for (short i = 0; i < headers.length; i++) {

            @SuppressWarnings("deprecation")
            HSSFCell cell = row.createCell(i);
            cell.setCellStyle(headersStyle);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);

        }

        // 鍒涘缓琛ㄤ腑鏁版嵁琛�-澧炲姞鏍峰紡-璧嬪��
        Iterator<?> it = dataSet.iterator();
        int index = 1;
        while (it.hasNext()) {
            index++;
            row = sheet.createRow(index);   
            Object t = it.next();
            // 鍒╃敤鍙嶅皠锛屾牴鎹甹avabean灞炴�х殑鍏堝悗椤哄簭锛屽姩鎬佽皟鐢╣etXxx()鏂规硶寰楀埌灞炴�у��
            Field[] fields = t.getClass().getDeclaredFields();
            for (short i = 0; i < fields.length; i++) {
                @SuppressWarnings("deprecation")
                HSSFCell cell = row.createCell(i);
                cell.setCellStyle(dataSetStyle);
                Field field = fields[i];
                String fieldName = field.getName();
                String getMethodName = "get"+ fieldName.substring(0, 1).toUpperCase()+ fieldName.substring(1);
                try {
                    @SuppressWarnings("rawtypes")
                    Class tCls = t.getClass();
                    @SuppressWarnings("unchecked")
                    Method getMethod = tCls.getMethod(getMethodName,new Class[] {});
                    Object value = getMethod.invoke(t, new Object[] {});

                    // 濡傛灉鏄椂闂寸被鍨�,鎸夌収鏍煎紡杞崲
                    String textValue = null;
                    if (value instanceof Date) {
                        Date date = (Date) value;
                        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                        textValue = sdf.format(date);
                    } else {
                        // 鍏跺畠鏁版嵁绫诲瀷閮藉綋浣滃瓧绗︿覆绠�鍗曞鐞�
                        textValue = value.toString();
                    }

                    // 鍒╃敤姝ｅ垯琛ㄨ揪寮忓垽鏂璽extValue鏄惁鍏ㄩ儴鐢辨暟瀛楃粍鎴�
                    if (textValue != null) {
                        Pattern p = Pattern.compile("^\\d+(\\.\\d+)?$");
                        Matcher matcher = p.matcher(textValue);
                        if (matcher.matches()) {
                            // 鏄暟瀛楀綋浣渄ouble澶勭悊
                            cell.setCellValue(Double.parseDouble(textValue));
                        } else {
                            // 涓嶆槸鏁板瓧鍋氭櫘閫氬鐞�
                            cell.setCellValue(textValue);
                        }
                    }

                    OutputStream out=null;
                    try {
                        out = new FileOutputStream(resultUrl);
                        workbook.write(out);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally{
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } finally {
                    //娓呯悊璧勬簮
                    try {
                        workbook.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}