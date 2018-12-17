package com.lswd.youpin.web.utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;



public class GetImag {
	 public static void decodeBase64ToImage(String base64, String path,  
	            String imgName) {  
	        BASE64Decoder decoder = new BASE64Decoder();  
	        try {  
	            FileOutputStream write = new FileOutputStream(new File(path  
	                    + imgName));  
	            byte[] decoderBytes = decoder.decodeBuffer(base64);  
	            write.write(decoderBytes);  
	            write.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	 
	 
	 
	 public static String encodeImgageToBase64(URL imageUrl) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理  
	        ByteArrayOutputStream outputStream = null;

		 try {
			 BufferedImage bufferedImage = ImageIO.read(imageUrl);
			 outputStream = new ByteArrayOutputStream();
			 ImageIO.write(bufferedImage, "jpg", outputStream);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

		 // 对字节数组Base64编码
	        BASE64Encoder encoder = new BASE64Encoder();  
	        return encoder.encode(outputStream.toByteArray());// 返回Base64编码过的字节数组字符串  
	    }  
	  
	    /** 
	     * 将本地图片进行Base64位编码 
	     *  
	     * @param imgUrl 
	     *            图片的url路径，如http://.....xx.jpg 
	     * @return 
	     */  
	    public static String encodeImgageToBase64(BufferedImage bufferedImage) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
	        ByteArrayOutputStream outputStream = null;  
	        try {
	            outputStream = new ByteArrayOutputStream();  
	            ImageIO.write(bufferedImage, "jpg", outputStream);  
	        } catch (MalformedURLException e1) {  
	            e1.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        // 对字节数组Base64编码  
	        BASE64Encoder encoder = new BASE64Encoder();  
	        return encoder.encode(outputStream.toByteArray());// 返回Base64编码过的字节数组字符串  
	    }








}
