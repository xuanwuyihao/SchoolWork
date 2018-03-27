package com.p2p.controller.finance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.pojo.Cash;
import com.bank.pojo.Netsave;
import com.bank.pojo.Users;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.commons.PhoneVerification;
import com.p2p.pojo.LogLift;
import com.p2p.pojo.LogMoney;
import com.p2p.pojo.LogRecharge;
import com.p2p.pojo.User;
import com.p2p.pojo.UserBankcard;
import com.p2p.pojo.UserInfo;
import com.p2p.pojo.UserMoney;
import com.p2p.service.LogLiftService;
import com.p2p.service.LogMoneyService;
import com.p2p.service.LogRechargeService;
import com.p2p.service.UserBankcardService;
import com.p2p.service.UserInfoService;
import com.p2p.service.UserMoneyService;
import com.p2p.service.UserService;

import sun.net.www.protocol.http.HttpURLConnection;

@Controller
@RequestMapping("/finance/bankcard")
public class BankCardController {

	// 默认运算精度,<span style="color:#ff0000;">保留有效数字6位</span>
	private static final int DEF_DIV_SCALE = 20;
	// RoundingMode.HALF_UP 舍入模式，四舍五入 向上
	private static MathContext mc = new MathContext(DEF_DIV_SCALE, RoundingMode.HALF_UP);

	@Resource(name = "userServiceImpl")
	private UserService userService;
	
	@Resource(name = "userBankcardServiceImpl")
	private UserBankcardService userbankcardService;

	@Resource(name = "userInfoServiceImpl")
	private UserInfoService userInfoService;

	@Resource(name = "logRechargeServiceImpl")
	private LogRechargeService logRechargeService;

	@Resource(name = "logLiftServiceImpl")
	private LogLiftService logLiftService;

	@Resource(name = "userMoneyServiceImpl")
	private UserMoneyService userMoneyService;
	
	@Resource(name="logMoneyServiceImpl")
	private LogMoneyService logMoneyService;
	

	// 判断是否为易支付新用户
	@RequestMapping("isExixt")
	public String isExixt(@RequestParam("phone") String phone) throws Exception {
		// StringBuffer sendStr = new StringBuffer();
		Users user = new Users();
		user.setUserphone(phone);

		ObjectMapper m = new ObjectMapper();
		String sendStr = m.writeValueAsString(user);

		// sendStr.append("测试数据");
		BufferedReader reader = null;
		try {
			String strMessage = "";
			StringBuffer buffer = new StringBuffer();
			// 接报文的地址192.168.3.71
			URL uploadServlet = new URL("http://localhost:8080/PaymentP2P/pay/TrueOrFalseUsers");
			HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet.openConnection();
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
			String msg = buffer.toString();
			System.out.println("接收返回值:" + msg);
			if (msg.equals("false")) {
				return "redirect:/finance/bankcard/openRegister";
			}
			System.out.println("msg：" + msg);
		} catch (java.net.ConnectException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		System.out.println("---------");
		return "redirect:/finance/bankcard/openBinding";
	}

	// 打开易支付注册界面
	@RequestMapping("openRegister")
	public String openRegister() {
		return "front/user/bankRegister";
	}

	// 打开易支付注册详细信息界面
	@RequestMapping("openRegister2")
	public String openRegister2(String username, String idcard, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("idCard", idcard);
		map.put("username", username);
		model.addAttribute("map", map);

		return "front/user/bankRegister2";
	}

	// 易支付注册
	@RequestMapping("cardAdd")
	public String cardAdd(Users user) throws Exception {

		ObjectMapper m = new ObjectMapper();
		String sendStr = m.writeValueAsString(user);
		// sendStr.append("测试数据");
		BufferedReader reader = null;
		try {
			String strMessage = "";
			StringBuffer buffer = new StringBuffer();
			// 接报文的地址
			URL uploadServlet = new URL("http://localhost:8080/PaymentP2P/pay/register");

			HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet.openConnection();
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
			String msg = buffer.toString();
			System.out.println("接收返回值:" + msg);
			if (!msg.equals("false")) {
				
				Subject subject = SecurityUtils.getSubject();
				Session session = subject.getSession();
				UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
				
				userInfo.setRealname(user.getUsername());
				userInfo.setIdcard(user.getIdno());
				System.out.println(userInfo.getId() + " " + userInfo.getRealname() + " " + userInfo.getIdcard());
				userInfoService.update(userInfo);
				
				User u1 = userService.getById(userInfo.getUserId());
				u1.setRealname(userInfo.getRealname());
				u1.setOyh1("0"); //0注册 1未注册
				userService.update(u1);
				
				session.setAttribute("user", u1);
				
				session.setAttribute("userInfo", userInfo);
			}

		} catch (java.net.ConnectException e) {
			throw new Exception();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		return "redirect:/finance/bankcard/openBinding";
	}

	

	// 打开银行卡绑定界面
	@RequestMapping("openBinding")
	public String openBinding(Model model) {
		
		Session session = SecurityUtils.getSubject().getSession();
		
		User user = (User) session.getAttribute("user");
		
		UserInfo userInfo = userInfoService.getByUserId(user.getId());
		
		model.addAttribute("userInfo",userInfo);
		
		return "front/user/cardBinding";
	}

	// 银行卡绑定
	@RequestMapping("binding")
	public String binding(UserBankcard user, String pwd) {
		System.out.println("Y------Y" + user.getBankcard());
		System.out.println("Y------Y" + user.getPlacebank());
		System.out.println("Y------Y" + pwd);
		System.out.println("Y------Y" + user.getUserinfoid());
		user.setBindingtime(new Date());
		user.setStatus("1");
		userbankcardService.save(user);

		Session session = SecurityUtils.getSubject().getSession();
		UserBankcard userBankcard = (UserBankcard) session.getAttribute("userBankcard");
		userBankcard = userbankcardService.getById(user.getId());
		session.setAttribute("userBankcard", userBankcard);

		return "front/user/PersonalCenter";
	}

	// 记录充值
	@RequestMapping("recordRecharge")
	public String recordRecharge(LogRecharge logRecharge, Model model) {

		Session session = SecurityUtils.getSubject().getSession();
		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");
		User user = (User) session.getAttribute("user");

		logRecharge.setUsername(user.getPhone());
		
		UserMoney userMoney = userMoneyService.getByName(user.getPhone());

		UserBankcard userBankcard = userbankcardService.getByUserinfoId(userInfo.getId()+"");

		logRecharge.setBankcard(userBankcard.getBankcard());
		logRecharge.setBanktype(userBankcard.getPlacebank());
		logRecharge.setTime(new Date());
		logRecharge.setStatus("充值失败");
		logRechargeService.save(logRecharge);
		logRecharge = logRechargeService.maxRecharge(logRecharge.getUsername());

		logRecharge.setOyh1(userMoney.getNeedmoney()+"");

		logRecharge.setOyh1(userMoney.getNeedmoney() + "");

		model.addAttribute("logRecharge", logRecharge);
		System.out.println("money:" + logRecharge.getOyh1());
		return "front/user/easyPay";
	}

	// 充值
	@RequestMapping("recharge")
	public @ResponseBody Object recharge(String logRechargeId,Model model) throws Exception {

		System.out.println(logRechargeId);

		

		LogRecharge logRecharge = logRechargeService.getById(Integer.parseInt(logRechargeId));

		Netsave netsave = new Netsave();
		netsave.setOpenaccid(logRecharge.getBankcard());
		netsave.setTransamt(logRecharge.getMoney());
		netsave.setStay1(logRecharge.getUsername());

		LogMoney logMoney = new LogMoney();
		logMoney.setUsername(logRecharge.getUsername());
		logMoney.setType("充值");
		logMoney.setDealmoney(logRecharge.getMoney());
		logMoney.setStates("error");
		
		ObjectMapper m = new ObjectMapper();
		String sendStr = m.writeValueAsString(netsave);

		// sendStr.append("测试数据");
		BufferedReader reader = null;
		try {
			String strMessage = "";
			StringBuffer buffer = new StringBuffer();
			// 接报文的地址
			URL uploadServlet = new URL("http://localhost:8080/PaymentP2P/pay/recharge");
			HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet.openConnection();
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
			String msg = buffer.toString();
			System.out.println("接收返回值:" + msg);

			if (!msg.equals("false")) {
				logRecharge.setStatus("充值成功");

				logRechargeService.update(logRecharge);

				UserMoney userMoney = userMoneyService.getByName(logRecharge.getUsername());

				BigDecimal allmoney1 = userMoney.getAllmoney();
				BigDecimal needmoney1 = userMoney.getNeedmoney();

				Double allmoney2 = (allmoney1.add(netsave.getTransamt(), mc)).doubleValue();
				BigDecimal allmoney3 = getBigDecimalByDouble(allmoney2);
				
				Double needmoney2 = (needmoney1.add(netsave.getTransamt(), mc)).doubleValue();
				BigDecimal needmoney3 = getBigDecimalByDouble(needmoney2);
				
				userMoney.setAllmoney(allmoney3);
				userMoney.setNeedmoney(needmoney3);
				
				userMoneyService.update(userMoney);
				
				logMoney.setStates("success");
				logMoney.setTime(new Date());
				
				logMoneyService.save(logMoney);
				
				return "success";

			}else {
				logMoney.setTime(new Date());
				
				logMoneyService.save(logMoney);
				return "error";
			}
		} catch (java.net.ConnectException e) {
			throw new Exception();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}
	

	// 提现
	@RequestMapping("withdrawals")
	public @ResponseBody String withdrawals(LogLift logLift) throws Exception {

		
		
		System.out.println(logLift.getUsername() + " - " + logLift.getBankcord() + " - " + logLift.getBankcord() + " - "
				+ logLift.getLiftmoney() + " - " + logLift.getLiftfee());

		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		
		User user = (User) session.getAttribute("user");
		UserMoney userMoney = (UserMoney) session.getAttribute("userMoney");
		System.out.println("userMoney.getId()："+userMoney.getId());
		userMoney = userMoneyService.getById(userMoney.getId());
		
		logLift.setUsername(user.getPhone());
		
		LogMoney logMoney = new LogMoney();
		logMoney.setUsername(user.getPhone());
		logMoney.setType("提现");
		logMoney.setDealmoney(logLift.getLiftmoney());
		logMoney.setStates("error");
		
		BigDecimal money = logLift.getLiftmoney();
		BigDecimal pj_rate = new BigDecimal(Double.toString(0.005)); 
        
        //普金收取的服务费
        Double d_pj_chargeMoney=(money.multiply(pj_rate, mc)).doubleValue();
        BigDecimal d_pj_chargeMoney1=getBigDecimalByDouble(d_pj_chargeMoney);
        
        logLift.setLiftfee(d_pj_chargeMoney1);		
		logLift.setLefttime(new Date());
        
        int tf=userMoney.getNeedmoney().compareTo(logLift.getLiftmoney());//返回值0表示相等，-1表示小于，1表示大于 
		
		if(tf==-1) {
			logLift.setLastmoney(new BigDecimal(0));
			logLift.setOyh1("提现失败");
			logLiftService.save(logLift);
			
			logMoney.setTime(new Date());
			logMoneyService.save(logMoney);
			return "moneyLow";
		}

		Cash cash = new Cash();
		cash.setOpenaccid(logLift.getBankcord());
		cash.setTransamt(logLift.getLiftmoney());
		cash.setFee(logLift.getLiftfee());
		cash.setStay1(user.getPhone());

		ObjectMapper m = new ObjectMapper();
		String sendStr = m.writeValueAsString(cash);

		// sendStr.append("测试数据");
		BufferedReader reader = null;
		try {
			String strMessage = "";
			StringBuffer buffer = new StringBuffer();
			// 接报文的地址
			URL uploadServlet = new URL("http://localhost:8080/PaymentP2P/pay/cash");
			HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet.openConnection();
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
			String msg = buffer.toString();
			System.out.println("接收返回值:" + msg);

			if (msg.equals("0")) {				
				logLift.setLastmoney(new BigDecimal(0));
				logLift.setOyh1("提现失败");
				logLiftService.save(logLift);
				logMoney.setTime(new Date());
				logMoneyService.save(logMoney);
				return "error";
				
			} else {
				
				
				userMoney = userMoneyService.getByName(user.getPhone());

				BigDecimal allmoney1 = userMoney.getAllmoney();
				BigDecimal needmoney1 = userMoney.getNeedmoney();

				Double allmoney2 = (allmoney1.subtract(logLift.getLiftmoney(), mc)).doubleValue();
				BigDecimal allmoney3 = getBigDecimalByDouble(allmoney2);
				
				Double needmoney2 = (needmoney1.subtract(logLift.getLiftmoney(), mc)).doubleValue();
				BigDecimal needmoney3 = getBigDecimalByDouble(needmoney2);
				
				userMoney.setAllmoney(allmoney3);
				userMoney.setNeedmoney(needmoney3);
				
				userMoneyService.update(userMoney);
				
				logLift.setLastmoney(new BigDecimal(msg));
				logLift.setOyh1("提现成功");
				logLiftService.save(logLift);
				
				userMoney = userMoneyService.getByName(user.getPhone());
				session.setAttribute("userMoney", userMoney);
				logMoney.setTime(new Date());
				logMoney.setStates("success");
				logMoneyService.save(logMoney);
				return "success";
			}

		} catch (java.net.ConnectException e) {
			throw new Exception();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}

	// 短信
	@RequestMapping("proving")
	public @ResponseBody String proving(String phone) {
		System.out.println("phone："+phone);
		PhoneVerification verification = new PhoneVerification();
		String code = verification.Verification(phone, "SMS_111120006");

		return code;
	}

	// 判断密码是否正确
	public @ResponseBody String isPwd(String phone, String pwd) throws Exception {
		String msg = "";
		Users users = new Users();

		users.setPwd(pwd);
		users.setUserphone(phone);

		ObjectMapper m = new ObjectMapper();
		String sendStr = m.writeValueAsString(users);

		// sendStr.append("测试数据");
		BufferedReader reader = null;
		try {
			String strMessage = "";
			StringBuffer buffer = new StringBuffer();
			// 接报文的地址
			URL uploadServlet = new URL("http://localhost:8080/PaymentP2P/pay/addUsers");

			HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet.openConnection();
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
			System.out.println("接收返回值:" + msg);

		} catch (java.net.ConnectException e) {
			throw new Exception();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		return msg;
	}

	public BigDecimal getBigDecimalByDouble(Double d) {// 把一个Double类型转换成BigDecimal类型2位小数并四舍五入

		BigDecimal b1 = new BigDecimal(d);

		BigDecimal b2 = b1.setScale(2, BigDecimal.ROUND_HALF_UP);

		return b2;

	}

	@RequestMapping("openRecharge")
	public String openRecharge(Model model) throws Exception {
		
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		User user = (User) session.getAttribute("user");
		System.out.println("Session中的用户信息："+user.toString());
		UserInfo userInfo =  userInfoService.getByUserId(user.getId());
		if((userInfo.getRealname()==null||userInfo.getRealname().equals(""))&&(userInfo.getIdcard()==null||userInfo.getIdcard().equals(""))) {
			model.addAttribute("authentication","error");
		}
		Users users = new Users();
		users.setUserphone(user.getPhone());
		ObjectMapper m = new ObjectMapper();
		String sendStr = m.writeValueAsString(users);

		// sendStr.append("测试数据");
		BufferedReader reader = null;
		try {
			String strMessage = "";
			StringBuffer buffer = new StringBuffer();
			// 接报文的地址
			URL uploadServlet = new URL("http://localhost:8080/PaymentP2P/pay/TrueOrFalseUsers");
			HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet.openConnection();
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
			String msg = buffer.toString();
			System.out.println("接收返回值:" + msg);
			if (msg.equals("false")) {
				model.addAttribute("isRegiste","error");
			}
			System.out.println("msg：" + msg);
		} catch (java.net.ConnectException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		
		return "front/user/recharge";
	}
	
	//充值记录
	@RequestMapping("rechargeRecord")
	public @ResponseBody void rechargeRecord(HttpServletResponse response, String page, String limit, String time1, String time2) throws JsonProcessingException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");

		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		User user = (User) session.getAttribute("user");
		
		System.out.println(page+" - "+limit+" - "+time1+" - "+time2);
		// 开始位置
		int x = (Integer.parseInt(page) - 1) * Integer.parseInt(limit);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("line", Integer.parseInt(limit));
		map.put("number", x);
		map.put("phone",user.getPhone());
		map.put("time1", time1);
		map.put("time2", time2);

		int count = logRechargeService.count();
		
		List<LogRecharge> list = logRechargeService.selPhone(map);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("line", count);
		map1.put("number", 0);
		map1.put("phone",user.getPhone());
		map1.put("time1", time1);
		map1.put("time2", time2);
		List<LogRecharge> list2 = logRechargeService.selPhone(map1);
		count = list2.size();
		
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("code", 0);
		data.put("msg", "");
		data.put("count", count);
		data.put("data", list);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonfromList = mapper.writeValueAsString(data);
		System.out.println(jsonfromList);
		try {
			PrintWriter out = response.getWriter();
			 out.print(jsonfromList);
             out.flush();
             out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	//打开提现
	@RequestMapping("openWithdrawals")
	public String openWithdrawals(Model model) throws Exception {
		
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		User user = (User) session.getAttribute("user");
		
		UserInfo userInfo =  userInfoService.getByUserId(user.getId());
		if((userInfo.getRealname()==null||userInfo.getRealname().equals(""))&&(userInfo.getIdcard()==null||userInfo.getIdcard().equals(""))) {
			model.addAttribute("authentication","error");
		}
		Users users = new Users();
		users.setUserphone(user.getPhone());
		ObjectMapper m = new ObjectMapper();
		String sendStr = m.writeValueAsString(users);

		// sendStr.append("测试数据");
		BufferedReader reader = null;
		try {
			System.out.println("22222");
			String strMessage = "";
			StringBuffer buffer = new StringBuffer();
			// 接报文的地址
			URL uploadServlet = new URL("http://localhost:8080/PaymentP2P/pay/TrueOrFalseUsers");
			HttpURLConnection servletConnection = (HttpURLConnection) uploadServlet.openConnection();
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
			String msg = buffer.toString();
			System.out.println("接收返回值:" + msg);
			if (msg.equals("false")) {
				model.addAttribute("isRegiste","error");
			}
			System.out.println("msg：" + msg);
		} catch (java.net.ConnectException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		
		return "front/user/withdrawals";
	}
	
	//提现记录
	@RequestMapping("withdrawalsRecord")
	public @ResponseBody void withdrawalsRecord(HttpServletResponse response, String page, String limit, String time1, String time2) throws JsonProcessingException{

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");

		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		User user = (User) session.getAttribute("user");
		
		System.out.println(page+" - "+limit+" - "+time1+" - "+time2);
		// 开始位置
		int x = (Integer.parseInt(page) - 1) * Integer.parseInt(limit);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("line", Integer.parseInt(limit));
		map.put("number", x);
		map.put("phone",user.getPhone());
		map.put("time1", time1);
		map.put("time2", time2);

		int count = logLiftService.count();
		
		List<LogLift> list = logLiftService.selPhone(map);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("line", count);
		map1.put("number", 0);
		map1.put("phone",user.getPhone());
		map1.put("time1", time1);
		map1.put("time2", time2);
		List<LogLift> list2 = logLiftService.selPhone(map1);
		count = list2.size();
		
		Map<String, Object> data = new LinkedHashMap<>();
		data.put("code", 0);
		data.put("msg", "");
		data.put("count", count);
		data.put("data", list);
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonfromList = mapper.writeValueAsString(data);
		System.out.println(jsonfromList);
		try {
			PrintWriter out = response.getWriter();
			 out.print(jsonfromList);
             out.flush();
             out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		
	} 
}
