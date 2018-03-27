package com.p2p.controller.back;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.pojo.Pay;
import com.bank.pojo.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.commons.DEBXInteresUtil;
import com.p2p.commons.DateUtil;
import com.p2p.pojo.Gathering;
import com.p2p.pojo.Invest;
import com.p2p.pojo.LendBeckonmoney;
import com.p2p.pojo.Loan;
import com.p2p.pojo.Page;
import com.p2p.pojo.StayStill;
import com.p2p.pojo.Still;
import com.p2p.pojo.UserMoney;
import com.p2p.service.GatheringService;
import com.p2p.service.InvestService;
import com.p2p.service.StayStillService;
import com.p2p.service.UserMoneyService;
import com.p2p.service.UserService;

@Controller
@RequestMapping("/userMoney")
public class UserMoneyController {

	@Resource(name="userMoneyServiceImpl")
	private UserMoneyService userMoneyService;
	
	@Resource(name="investServiceImpl")
	private InvestService investService;
	
	@Resource(name="userServiceImpl")
	private UserService userService;
	
	@Resource(name="gatheringServiceImpl")
	private GatheringService gatheringService;
	
	@Resource(name="stayStillServiceImpl")
	private StayStillService stayStillService;
	
	private int Total=0;//总数
	private int number=7;//条数
	private int pages=0;//页数
	private int CurrentPage=0;//当前页
	private int checks=0;////查询前后条数
	
	@RequestMapping("userMoney-list")
	public String list(Model model){
		List<UserMoney>list= userMoneyService.list();
	    Total=userMoneyService.count();
		pages=(Total+number-1)/number;//页数
		List<UserMoney>list2= userMoneyService.selectSum();
		
		
		List ll=new ArrayList<>();
		ll.add(Total);
		ll.add(pages);
	
	model.addAttribute("list", list);
	model.addAttribute("ll",ll);
	model.addAttribute("sum",list2);
		return "back/user_money";
	}
	
	
	//分页
			@RequestMapping("userMoney-fy")
			public String  paging(Model model,UserMoney userMoney){
				CurrentPage=userMoney.getId();//当前页
				int c=(CurrentPage-1)*number;//查询前后条数
				Page page1=new Page();
				page1.setFist(c);
				page1.setTow(number);
				page1.setTitle(userMoney.getUsername());
				

				List<UserMoney> list=new ArrayList<>();
				List<UserMoney>list2= new ArrayList<>();
				if(userMoney.getUsername()==""){
					
					 list=userMoneyService.selectpaging(page1);
					 list2=userMoneyService.selectSum();
				}else {
					list=userMoneyService.selectpeople(page1);
					list2=userMoneyService.selectSumMH(page1);
				}

				List<UserMoney> lli=userMoneyService.selectlike(page1);
				if(userMoney.getUsername()==""){
					Total=userMoneyService.count();			
				}else{
					Total=lli.size();	
					}
				pages=(Total+number-1)/number;//页数
				String title1=userMoney.getUsername();
				
							
				List ll=new ArrayList<>();
				ll.add(Total);
				ll.add(pages);
				ll.add(title1);
				
				
				model.addAttribute("sum",list2);
				model.addAttribute("ll",ll);
				model.addAttribute("list",list);
				model.addAttribute("list2",CurrentPage);
				
				return "back/user_money";
				
			}

			//模糊查询
			@RequestMapping("userMoney-mh")
			public String fent(Model model,UserMoney userMoney,HttpServletRequest request){
				
				
				if(userMoney.getUsername()!=""){
					Page page=new Page();
					page.setFist(checks);
					page.setTow(number);
					page.setTitle(userMoney.getUsername());
					List<UserMoney> list=userMoneyService.selectpeople(page);
					List<UserMoney> list2= userMoneyService.selectlike(page);//总条数
					List<UserMoney>list3= userMoneyService.selectSumMH(page);//总金额
					Total=list2.size();
					pages=(Total+number-1)/number;//页数
					String title1=userMoney.getUsername();
					
					
					List ll=new ArrayList<>();
					ll.add(Total);
					ll.add(pages);
					ll.add(title1);
					
					model.addAttribute("sum",list3);
					model.addAttribute("ll",ll);
					model.addAttribute("list",list);
					return "back/user_money";
				}

				return "redirect:/userMoney/userMoney-list";
			}
			
	
			@RequestMapping(value="testsExport",produces = {"application/text;charset=UTF-8"})
			@ResponseBody
			public String exportExcle(UserMoney userMoney,HttpServletRequest request,HttpServletResponse response){
				
				System.out.print("进来了==");
				HSSFWorkbook wb=new HSSFWorkbook();
				HSSFSheet sheet=wb.createSheet("用户资金管理");
				sheet.setDefaultColumnWidth((short) 15);
				HSSFCellStyle style=wb.createCellStyle();
				HSSFRow row=sheet.createRow(0);
				style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
				HSSFCell cell=row.createCell((short) 0);
				
				cell.setCellValue("ID");
				cell.setCellStyle(style);
				cell=row.createCell((short) 1);
				cell.setCellValue("用户名称");
				cell.setCellStyle(style);
				cell=row.createCell((short) 2);
				cell.setCellValue("总资产");
				cell.setCellStyle(style);
				cell=row.createCell((short) 3);
				cell.setCellValue("可用余额");
				cell.setCellStyle(style);
				cell=row.createCell((short) 4);
				cell.setCellValue("收益余额");
				cell.setCellStyle(style);
				cell=row.createCell((short) 5);
				cell.setCellValue("待还余额");
				cell.setCellStyle(style);
				cell=row.createCell((short) 6);
				cell.setCellValue("待收余额");
				cell.setCellStyle(style);
				cell=row.createCell((short) 7);
				cell.setCellValue("冻结余额");
				cell.setCellStyle(style);
				cell=row.createCell((short) 8);
				cell.setCellValue("投资总额");
				cell.setCellStyle(style);
				cell=row.createCell((short) 9);
				cell.setCellValue("借款余额");
				cell.setCellStyle(style);
				cell=row.createCell((short) 10);
				cell.setCellValue("奖励金额");
				cell.setCellStyle(style);
				
				
				Page page=new Page();
				page.setTitle(userMoney.getUsername());
				
				
				List<UserMoney> list=userMoneyService.selectlike(page);
				
				for(short i=0;i<list.size();i++){
					row=sheet.createRow(i+1);
					row.createCell(0).setCellValue(list.get(i).getId());
					row.createCell(1).setCellValue(list.get(i).getUsername());
					row.createCell(2).setCellValue(list.get(i).getAllmoney()+"");
					row.createCell(3).setCellValue(list.get(i).getNeedmoney()+"");
					row.createCell(4).setCellValue(list.get(i).getGainmoney()+"");
					row.createCell(5).setCellValue(list.get(i).getStillmoney()+"");
					row.createCell(6).setCellValue(list.get(i).getGathermoney()+"");
					row.createCell(7).setCellValue(list.get(i).getInvestmoney()+"");
					row.createCell(8).setCellValue(list.get(i).getLendmoney()+"");
					row.createCell(9).setCellValue(list.get(i).getAwordmoney()+"");
					row.createCell(10).setCellValue(list.get(i).getFrozenmoney()+"");

				}
				
				String DateName ="金字塔用户资金管理";
				
                response.setContentType("application/csv;charset=GBK");
				String contextPath = request.getSession().getServletContext().getRealPath("/xls/");
				contextPath = contextPath.replace("\\", "/");
				
				String fileName=contextPath+DateName+".xls";
				
				try {
					FileOutputStream out=new FileOutputStream(fileName);
					wb.write(out);
					wb.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return "失败";
				}
			
				String fName=DateName+".xls";
				
				return fName;

			}
			//去放款界面
			@RequestMapping("hand_money")
			public String handMoney() {
				return "back/hand_money";
			}

			//去核对公司密码
			@RequestMapping("send_Password")
			public @ResponseBody String sendPassword(String password)  throws Exception{
				//判断支付密码
			    //确认的bean
				Users u = new Users();			
				u.setPwd(password);
				u.setUserphone("10000001");
				
				ObjectMapper m = new ObjectMapper();  
				String sendStr = m.writeValueAsString(u);  
				
				BufferedReader reader = null;
				String msg;
				try {  
			        String strMessage = "";  
			        StringBuffer buffer = new StringBuffer();  
			        // 接报文的地址  
			        URL uploadServlet = new URL(  
			               "http://localhost:8080/PaymentP2P/pay/PaymentPasswordTorF");  
			        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
			               .openConnection();  
			        // 设置连接参数  
			        servletConnection.setRequestMethod("POST");  
			        servletConnection.setDoOutput(true);  
			        servletConnection.setDoInput(true);  
			        servletConnection.setAllowUserInteraction(true);  
			        // 开启流，写入XML数据  
			        OutputStream output = servletConnection.getOutputStream();  
			        System.out.println("发送的报文：");  
			        System.out.println(sendStr);  
			        output.write(sendStr.getBytes());  
			        output.flush();  
			        output.close();  
			        
			        
			        // 获取返回的数据  
			        InputStream inputStream = servletConnection.getInputStream();  
			        reader = new BufferedReader(new InputStreamReader(inputStream));  
			        while ((strMessage = reader.readLine()) != null) {  
			           buffer.append(strMessage);  
			        }  
			        msg = buffer.toString();
			        System.out.println("接收返回值密码是否正确:" + msg);
			        
			    
			        
			    } catch (java.net.ConnectException e) {  
			        throw new Exception();  
			    } finally {  
			        if (reader != null) {  
			           reader.close();  
			        }  
			    } 
				
				
				if(msg.equals("true")) {
					
					return "success";
				}
				
				
				return "error";
			}
			
			
			
			//执行放款的一系列操作
			@RequestMapping("discharge_money")
			public @ResponseBody String discharge_money(Integer billcode) throws Exception {
				//获取到订单号
				System.out.println("订单号："+billcode);
				
				//根据订单号获取借款人的借款金额( lend_beckonMoney 所有借款表)
				LendBeckonmoney lendMoney = userMoneyService.selLendMoney(billcode);
				
				if(lendMoney==null) {
					return "error";
				}
				
				//根据订单号获取借款人的还款信息( still 还款表)
				Still still = userMoneyService.dischargeMoney(billcode);
				System.out.println("订单信息："+still.toString());
				
				//根据借款信息算出借款人这期需还的金额
				DEBXInteresUtil dUtil = new DEBXInteresUtil();
				Double allMoney = dUtil.DEBXMTotleInteres(lendMoney.getLendmoney().toString(), lendMoney.getRate().toString(), lendMoney.getLendtime().toString());
				
				//查询所有投资这个标的用户投资信息( invert 投资表)
				List<Invest> investList = investService.selectInvestByBillcode(billcode);
				
				DateUtil dateUtil = new DateUtil();
				//根据投资信息算出每个投资用户这期应收的金额
				for (Invest invest : investList) {
					Double userMoney = dUtil.DEBXMTotleInteres(invest.getInvestmoney().toString(), lendMoney.getRate().toString(), lendMoney.getLendtime().toString());
					
					//根据投资用户id查询投资用户电话号码
					Integer userPhone = userService.getPhoneById(invest.getUserid());
					
					//传输
					Pay p=new Pay();
					p.setCustid(userPhone.toString());//电话
					p.setTransamt(new BigDecimal(userMoney));//要还的金额
					
					ObjectMapper m = new ObjectMapper();  
					String sendStr = m.writeValueAsString(p);  
					
					BufferedReader reader = null;
					String msg;
					try {  
				        String strMessage = "";  
				        StringBuffer buffer = new StringBuffer();  
				        // 接报文的地址  
				        URL uploadServlet = new URL(  
				               "192.168.3.70/PaymentP2P/pay/lendMoney");  
				        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
				               .openConnection();  
				        // 设置连接参数  
				        servletConnection.setRequestMethod("POST");  
				        servletConnection.setDoOutput(true);  
				        servletConnection.setDoInput(true);  
				        servletConnection.setAllowUserInteraction(true);  
				        // 开启流，写入XML数据  
				        OutputStream output = servletConnection.getOutputStream();  
				        System.out.println("发送的报文：");  
				        System.out.println(sendStr);  
				        output.write(sendStr.getBytes());  
				        output.flush();  
				        output.close();  
				        
				        
				        // 获取返回的数据  
				        InputStream inputStream = servletConnection.getInputStream();  
				        reader = new BufferedReader(new InputStreamReader(inputStream));  
				        while ((strMessage = reader.readLine()) != null) {  
				           buffer.append(strMessage);  
				        }  
				        msg = buffer.toString();
				        System.out.println("接收返回值密码是否正确:" + msg);
				        
				    
				        
				    } catch (java.net.ConnectException e) {  
				        throw new Exception();  
				    } finally {  
				        if (reader != null) {  
				           reader.close();  
				        }  
				    } 
					
		    		//修改收款表中的数据( gathering 收款表 )
		    		Gathering gathering = new Gathering(); 
		    		//金额
		    		gathering.setHasmoney(new BigDecimal(userMoney));
		    		gathering.setStilldtate(dateUtil.convert(new Date().toString()));
		    		gathering.setBillcode(billcode.toString());
		    		gatheringService.loanMoney(gathering);
		    		
		    		//修改用户资金表中的数据
		    		UserMoney userMoney2 = new UserMoney();
		    		userMoney2.setUsername(userPhone.toString());
		    		//将总资产和可用余额加上回款的金额
		    		userMoney2.setAllmoney(new BigDecimal(userMoney));
		    		userMoneyService.updateNeedMoney(userMoney2);
				}
				/*------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
				
				//将公司的金额减少
				//公司汇付资金添加(10000001)
	    	    Pay gsPay=new Pay();	    
	    	    gsPay.setCustid("10000001");//电话
	    		gsPay.setTransamt(new BigDecimal(allMoney));//公司纯利息
	    				    
	    		ObjectMapper m = new ObjectMapper();  
				String sendStr = m.writeValueAsString(gsPay);  
				
				BufferedReader reader = null;
				String msg;
	    		try {  
	    	        String strMessage = "";  
	    	        StringBuffer buffer = new StringBuffer();  
	    	        // 接报文的地址  
	    	        URL uploadServlet = new URL(  
	    	               "192.168.3.70/PaymentP2P/pay/gsfk_Money");  
	    	        HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet  
	    	               .openConnection();  
	    	        // 设置连接参数  
	    	        servletConnection.setRequestMethod("POST");  
	    	        servletConnection.setDoOutput(true);  
	    	        servletConnection.setDoInput(true);  
	    	        servletConnection.setAllowUserInteraction(true);  
	    	        // 开启流，写入XML数据  
	    	        OutputStream output = servletConnection.getOutputStream();  
	    	        System.out.println("发送的报文：");  
	    	        System.out.println(sendStr);  
	    	        output.write(sendStr.getBytes());  
	    	        output.flush();  
	    	        output.close();  
	    	        
	    	        
	    	        // 获取返回的数据  
	    	        InputStream inputStream = servletConnection.getInputStream();  
	    	        reader = new BufferedReader(new InputStreamReader(inputStream));  
	    	        while ((strMessage = reader.readLine()) != null) {  
	    	           buffer.append(strMessage);  
	    	        }  
	    	        msg = buffer.toString();
	    	        System.out.println("消息:" + msg);
	    	        
	    	        
	    	        
	    	    } catch (java.net.ConnectException e) {  
	    	        throw new Exception();  
	    	    } finally {  
	    	        if (reader != null) {  
	    	           reader.close();  
	    	        }  
	    	    }
	    		/*------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	    		
	    		
				//修改还款表中的数据( still 还款表 )
				userMoneyService.updateIsWebStill(billcode);
				
				
				//修改逾期借款表中的信息，显示为网站已代还
				StayStill stayStill = new StayStill();
				stayStill.setLendId(billcode);
				stayStill.setDescription("网站已代还");
				stayStillService.updateDescription(stayStill);
				
				
				//添加手动放款表中的数据
				Loan loan = new Loan();
				loan.setUsername(still.getUsername());
				loan.setProduct(still.getTitle());
				loan.setType(still.getType());
				loan.setBillcode(billcode.toString());
				loan.setStage(still.getStage()+1);
				loan.setTime(dateUtil.convert(new Date().toString()));
				userMoneyService.saveLoan(loan);
				
				return "success";
			}
			
			
			
}
