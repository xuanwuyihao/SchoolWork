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
		String sheetName="图书列表";
		String titleName="我的图书";
		String[] headers={"用户ID","用户名称","用户姓名","性别","生日","说明"};
		
		List<Test> dataSet=testservice.list();
		String resultUrl="G:\\book.xls";
		String pattern="yyyy-mm-dd";
		ExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);
		return "success";
	}
}
