package erweima;


import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;




public class demo {


	//生成二维码
	public static void main(String[] args) {
		int width=300;
		int height =300;
		String format="png";
		String content = "小书房、、、、这外号有点怪！！！"; 
		
		//定义二维码的参数
		HashMap code = new HashMap();
		code.put(EncodeHintType.CHARACTER_SET, "utf-8");
		code.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.Q); //指定等级M(有Q,H,L,M)
		code.put(EncodeHintType.MARGIN, 2);   //定义边框宽度，默认是5
		
		
		//生成二维码
		try {
			
		BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,code);
		
		//保存路径
		Path file = new File("G:/爱壁纸/txn3.png").toPath(); //定义路径
		
		MatrixToImageWriter.writeToPath(bitMatrix, format, file);


		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		


	}
	




}