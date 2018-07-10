package work.hang.dk.framework.bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class AppMessageBean extends BaseBean {

	private static final long serialVersionUID = 5767996719111968549L;

	private Map<String, String> msg;

	private TInvoiceBean invoice = null;

	private MessageContent messageContent;

	public AppMessageBean() {
		msg = new HashMap<>();
		messageContent = new MessageContent();
	}

	public void setAppId(String appId) {
		this.msg.put("appId", appId);
	}

	public void setTitle(String title) {
		this.msg.put("title", title);
	}

	public void setType(String type) {
		this.messageContent.setType(type);
		try {
			this.msg.put("body", new ObjectMapper().writeValueAsString(messageContent));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void setContent(String content) {
		this.messageContent.setContent(content);
		try {
			this.msg.put("body", new ObjectMapper().writeValueAsString(messageContent));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void result(String id, boolean success) {
		this.messageContent.setId(id);
		this.messageContent.setSuccess(success);
		try {
			this.msg.put("body", new ObjectMapper().writeValueAsString(messageContent));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public void setSoftToken(String softToken) {
		this.msg.put("softTokenListStr", softToken);
	}

	public Map<String, String> getParam() {
		return this.msg;
	}

	public TInvoiceBean getInvoice() {
		return invoice;
	}

	public void setInvoice(TInvoiceBean invoice) {
		this.invoice = invoice;
	}

	private class MessageContent implements Serializable {
		private String content;
		private String type;
		private String id;
		private boolean success;

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}
	}
}
