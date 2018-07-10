package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "head")
public class Head extends BaseBean {

	private static final long serialVersionUID = 6260588668144519859L;

	/**
	 * 集成服务id
	 */
	@XmlElement(name = "tran_id")
	private String tranId;

	@XmlElement(name = "channel_id")
	private String channelId;

	@XmlElement(name = "tran_seq")
	private String tranSeq;

	@XmlElement(name = "tran_date")
	private String tranDate;

	@XmlElement(name = "tran_time")
	private String tranTime;

	@XmlElement(name = "expand")
	private List<Expand> expands;

	/**
	 * @return the expands
	 */
	public List<Expand> getExpands() {
		return expands;
	}

	/**
	 * @param expands the expands to set
	 */
	public void setExpands(List<Expand> expands) {
		this.expands = expands;
	}

	/**
	 * @return the tranId
	 */
	public String getTranId() {
		return tranId;
	}

	/**
	 * @param tranId the tranId to set
	 */
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return the tranSeq
	 */
	public String getTranSeq() {
		return tranSeq;
	}

	/**
	 * @param tranSeq the tranSeq to set
	 */
	public void setTranSeq(String tranSeq) {
		this.tranSeq = tranSeq;
	}

	/**
	 * @return the tranDate
	 */
	public String getTranDate() {
		return tranDate;
	}

	/**
	 * @param tranDate the tranDate to set
	 */
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	/**
	 * @return the tranTime
	 */
	public String getTranTime() {
		return tranTime;
	}

	/**
	 * @param tranTime the tranTime to set
	 */
	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

}
