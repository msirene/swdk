package work.hang.dk.framework.bean.co.invoice.request;

import org.springframework.util.CollectionUtils;
import work.hang.dk.framework.bean.BaseBean;
import work.hang.dk.framework.bean.TInvoiceBean;
import work.hang.dk.framework.bean.TInvoiceDetailBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "business")
public class BusinessRequestCommonFpkj extends BaseBean {
	private static final long serialVersionUID = 3663582256306251706L;
	/**
	 * ID
	 */
	@XmlAttribute(name = "id")
	private String id = "FPKJ";

	/**
	 * 描述
	 */
	@XmlAttribute(name = "comment")
	private String comment = "发票开具";

	/**
	 * 发票内容
	 */
	@XmlElement(name = "REQUEST_COMMON_FPKJ")
	private RequestCommonFpkj fpkj = new RequestCommonFpkj();

	public BusinessRequestCommonFpkj() {

	}

	public BusinessRequestCommonFpkj(TInvoiceBean invoice) {
		// 发票bean转换为参数bean
		CommonFpkjFpt fpkjFpt = fpkj.getFpt();
		fpkjFpt.setFpqqlsh(invoice.getFpqqlsh());
		fpkjFpt.setKplx(invoice.getKplx());
		fpkjFpt.setBmbBbh("13.0");
		fpkjFpt.setZsfs("0");
		fpkjFpt.setTspz("00");
		// 开票时改为代开点的税号
		//fpkjFpt.setXsfNsrsbh(invoice.getXsfNsrsbh());
		fpkjFpt.setXsfNsrsbh(invoice.getEnterprise().getTaxBureauBean().getNsrsbh());
		fpkjFpt.setXsfMc(invoice.getXsfMc());
		fpkjFpt.setXsfDzdh(invoice.getXsfDzdh());
		fpkjFpt.setXsfYhzh(invoice.getXsfYhzh());
		fpkjFpt.setGmfNsrsbh(invoice.getGmfNsrsbh());
		fpkjFpt.setGmfMc(invoice.getGmfMc());
		fpkjFpt.setGmfDzdh(invoice.getGmfDzdh());
		fpkjFpt.setGmfYhzh(invoice.getGmfYhzh());
		fpkjFpt.setKpr(invoice.getKpr());
		fpkjFpt.setSkr(invoice.getSkr());
		fpkjFpt.setFhr(invoice.getFhr());
		fpkjFpt.setYfpDm(invoice.getYfpDm());
		fpkjFpt.setYfpHm(invoice.getYfpHm());
		fpkjFpt.setJshj(invoice.getJshj() == null ? "" : invoice.getJshj().toPlainString());
		fpkjFpt.setHjje(invoice.getHjje() == null ? "" : invoice.getHjje().toPlainString());
		fpkjFpt.setHjse(invoice.getHjse() == null ? "" : invoice.getHjse().toPlainString());
		fpkjFpt.setBz(invoice.getBz());
		fpkjFpt.setSkr(invoice.getSkr());
		fpkjFpt.setFhr(invoice.getFhr());

		fpkj.setFpt(fpkjFpt);

		List<CommonFpkjXmxx> jXmxxs = fpkj.getXmxxs().getXmxxs();

		List<TInvoiceDetailBean> detailBeans = invoice.getList();
		if (!CollectionUtils.isEmpty(detailBeans)) {
			CommonFpkjXmxx xmxx;
			for (TInvoiceDetailBean detailBean : detailBeans) {
				xmxx = new CommonFpkjXmxx();
				xmxx.setFphxz("0");
				xmxx.setSpbm(detailBean.getItemId());
				xmxx.setYhzcbs("1");
				xmxx.setLslbs("1");
				xmxx.setXmmc(detailBean.getXmmc());
				xmxx.setDw(detailBean.getDw());
				xmxx.setGgxh(detailBean.getGgxh());
				xmxx.setXmsl(detailBean.getXmsl() == null ? "" : detailBean.getXmsl().toPlainString());
				xmxx.setXmdj(detailBean.getXmdj() == null ? "" : detailBean.getXmdj().toPlainString());
				xmxx.setXmje(detailBean.getXmje() == null ? "" : detailBean.getXmje().toPlainString());
				xmxx.setSl(detailBean.getSl() == null ? "" : detailBean.getSl().toPlainString());
				xmxx.setSe(detailBean.getSe() == null ? "" : detailBean.getSe().toPlainString());
				jXmxxs.add(xmxx);
			}
		}

		fpkj.getXmxxs().setXmxxs(jXmxxs);
		fpkj.getXmxxs().setSize(jXmxxs.size());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public RequestCommonFpkj getFpkj() {
		return fpkj;
	}

	public void setFpkj(RequestCommonFpkj fpkj) {
		this.fpkj = fpkj;
	}
}
