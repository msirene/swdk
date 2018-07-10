package work.hang.dk.framework.bean;

import work.hang.dk.framework.entity.TPDFAndImage;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TPDFAndImageBean extends TPDFAndImage {


	/**
	 * pdf文件通过转换成字节流用base64加密后的字符串
	 */
	private String pdfFileStr;

	/**
	 * pdf图片通过转换成字节流用base64加密后的字符串
	 */
	private String pdfImageStr;

	/**
	 * @return the pdfFileStr
	 */
	public String getPdfFileStr() {
		return pdfFileStr;
	}

	/**
	 * @param pdfFileStr the pdfFileStr to set
	 */
	public void setPdfFileStr(String pdfFileStr) {
		this.pdfFileStr = pdfFileStr;
	}

	/**
	 * @return the pdfImageStr
	 */
	public String getPdfImageStr() {
		return pdfImageStr;
	}

	/**
	 * @param pdfImageStr the pdfImageStr to set
	 */
	public void setPdfImageStr(String pdfImageStr) {
		this.pdfImageStr = pdfImageStr;
	}
}
