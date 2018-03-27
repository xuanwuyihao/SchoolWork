package com.ht.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.base.ExportExcel;
import com.ht.model.Test;
import com.ht.service.TestService;

@Controller
@RequestMapping("export")
public class ExportController {

	@Resource(name="testServiceImpl")
	private TestService testservice;
	
	@RequestMapping("testExport")
	@ResponseBody
	public String exportExcle(){
		String sheetName="ͼ���б�";
		String titleName="�ҵ�ͼ��";
		String[] headers={"�û�ID","�û�����","�û�����","�Ա�","����","˵��"};
		
		List<Test> dataSet=testservice.list();
		String resultUrl="G:\\book.xls";
		String pattern="yyyy-mm-dd";
		ExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);
		return "success";
	}
}
