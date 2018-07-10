package work.hang.dk.framework.bean;

import work.hang.dk.framework.entity.TTaxBureau;

import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TTaxBureauBean extends TTaxBureau {
	/**
	 * 证书的字节流
	 */
	private byte[] credentialsContent;

	private String credentialsPassword;

	private List<Fpdksfzpzb> fpdksfzpzbList;

	/**
	 * 登记序号
	 */
	private String djxh;

	private String entCount;

	private String invCount;

	public void clearCertainData() {
		this.credentialsContent = null;
		this.credentialsPassword = null;
		this.fpdksfzpzbList = null;
		this.setSealContent(null);
	}

	public byte[] getCredentialsContent() {
		return credentialsContent;
	}

	public void setCredentialsContent(byte[] credentialsContent) {
		this.credentialsContent = credentialsContent;
	}

	public String getCredentialsPassword() {
		return credentialsPassword;
	}

	public void setCredentialsPassword(String credentialsPassword) {
		this.credentialsPassword = trim(credentialsPassword);
	}

	public String getDjxh() {
		return djxh;
	}

	public void setDjxh(String djxh) {
		this.djxh = trim(djxh);
	}

	public List<Fpdksfzpzb> getFpdksfzpzbList() {
		return fpdksfzpzbList;
	}

	public void setFpdksfzpzbList(List<Fpdksfzpzb> fpdksfzpzbList) {
		this.fpdksfzpzbList = fpdksfzpzbList;
	}

	public String getEntCount() {
		return entCount;
	}

	public void setEntCount(String entCount) {
		this.entCount = entCount;
	}

	public String getInvCount() {
		return invCount;
	}

	public void setInvCount(String invCount) {
		this.invCount = invCount;
	}
}
