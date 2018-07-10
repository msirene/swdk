package work.hang.dk.framework.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.omg.CORBA.SystemException;

import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class HttpUtil {
	//private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

	private static CloseableHttpClient closeableHttpClient = null;

	/**
	 * http连接池的总连接数
	 */
	private static int HTTP_MAX_TOTAL_CONNECTION = 60;
	/**
	 * http连接池的总连接数
	 */
	private static int HTTP_MAX_CONNECTION_PER_ROUTE = 20;
	/**
	 * http连接的超时时间
	 */
	private static int HTTP_CONNECTION_TIMEOUT = 5000;
	/**
	 * http连接传输数据的超时时间
	 */
	private static int HTTP_SO_TIMEOUT = 5000;
	/**
	 * http出错后重试次数
	 */
	private static int HTTP_RETRY_COUNT = 3;

	/**
	 * 成功
	 */
	private static int SUCCESS = 200;

	public static String sendGet(String url) throws Exception {
		HttpClient client = getInstance();
		HttpGet httpGet = new HttpGet(url);
//		BufferedReader br = null;
		try {
			HttpResponse response = client.execute(httpGet);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == SUCCESS) {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(response.getEntity(), "utf-8");
				} else {
					httpGet.abort();
					httpGet = null;
					throw new UnexpectedException("error:no content", null);
				}
			} else {
				httpGet.abort();
				httpGet = null;
				throw new UnexpectedException("error: httpResponse status " + statusCode + "!!!", null);
			}
		} finally {
			if (httpGet != null) {
				httpGet.abort();
			}
		}
	}

	public static String postByte(String url, String content, String charset) throws UnexpectedException {
		String result;
		HttpPost post = null;
		try {
			HttpClient hc = getInstance();
			post = new HttpPost(url);
			ByteArrayEntity byteArrayEntity = new ByteArrayEntity(content.getBytes(charset));
			post.setEntity(byteArrayEntity);
			HttpResponse response = hc.execute(post);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == SUCCESS) {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					result = EntityUtils.toString(response.getEntity(), charset);
					return result;
				} else {
					post.abort();
					post = null;
					UnexpectedException ue = new UnexpectedException("error:no content", null);
					//logger.error("", ue);
					throw ue;
				}
			} else {
				post.abort();
				post = null;
				UnexpectedException ue = new UnexpectedException("error: httpResponse status " + statusCode + "!!!", null);
				//logger.error("", ue);
				throw ue;
			}
		} catch (SystemException e) {
			//logger.error("", e);
			throw e;
		} catch (Exception e) {
			UnexpectedException ue = new UnexpectedException("error occurred when send request", e);
			//logger.error("", ue);
			throw ue;
		} finally {
			if (post != null) {
				post.abort();
			}
		}
	}

	public static String post(String url, Map<String, String> params) throws UnexpectedException {
		HttpPost post = null;
		List<NameValuePair> nvps = new ArrayList<>();
		for (Entry<String, String> entry : params.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			nvps.add(new BasicNameValuePair(key, value));
		}
//		BufferedReader br = null;
		try {
			HttpClient hc = getInstance();
			post = new HttpPost(url);
			post.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
			HttpResponse response = hc.execute(post);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == SUCCESS) {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					return EntityUtils.toString(response.getEntity(), "utf-8");
				} else {
					post.abort();
					post = null;
					throw new UnexpectedException("error:no content", null);
				}
			} else {
				post.abort();
				post = null;
				throw new UnexpectedException("error: httpResponse status " + statusCode + "!!!", null);
			}
		} catch (SystemException e) {
			//logger.error("", e);
			throw e;
		} catch (Exception e) {
			UnexpectedException ue = new UnexpectedException("error occurred when send request", e);
			//logger.error("", ue);
			throw ue;
		} finally {
			if (post != null) {
				post.abort();
			}
		}
	}

	public static String postXML(String url, String xml, String charset) throws UnexpectedException {
		String result;
		HttpPost post = null;
		try {
			HttpClient hc = getInstance();
			post = new HttpPost(url);
			StringEntity entityParams = new StringEntity(xml, charset);
			post.setEntity(entityParams);
			post.setHeader("Content-Type", "text/xml;charset=" + charset);
			HttpResponse response = hc.execute(post);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == SUCCESS) {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					result = EntityUtils.toString(response.getEntity(), charset);
					return result;
				} else {
					post.abort();
					post = null;
					UnexpectedException ue = new UnexpectedException("error:no content", null);
					//logger.error("", ue);
					throw ue;
				}
			} else {
				post.abort();
				post = null;
				UnexpectedException ue = new UnexpectedException("error: httpResponse status " + statusCode + "!!!", null);
				//logger.error("", ue);
				throw ue;
			}
		} catch (SystemException e) {
			//logger.error("", e);
			throw e;
		} catch (Exception e) {
			UnexpectedException ue = new UnexpectedException("error occurred when send request", e);
			//logger.error("", ue);
			throw ue;
		} finally {
			if (post != null) {
				post.abort();
			}
		}
	}

	public static String postXML(String url, byte[] content, String charset) throws UnexpectedException {
		String result;
		HttpPost post = null;
		try {
			HttpClient hc = getInstance();
			post = new HttpPost(url);
			ByteArrayEntity entityParams = new ByteArrayEntity(content);
			post.setEntity(entityParams);
			post.setHeader("Content-Type", "text/xml;charset=" + charset);
			HttpResponse response = hc.execute(post);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == SUCCESS) {
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					result = EntityUtils.toString(response.getEntity(), charset);
					return result;
				} else {
					post.abort();
					post = null;
					UnexpectedException ue = new UnexpectedException("error:no content", null);
					//logger.error("", ue);
					throw ue;
				}
			} else {
				post.abort();
				post = null;
				UnexpectedException ue = new UnexpectedException("error: httpResponse status " + statusCode + "!!!", null);
				//logger.error("", ue);
				throw ue;
			}
		} catch (SystemException e) {
			//logger.error("", e);
			throw e;
		} catch (Exception e) {
			UnexpectedException ue = new UnexpectedException("error occurred when send request", e);
			//logger.error("", ue);
			throw ue;
		} finally {
			if (post != null) {
				post.abort();
			}
		}
	}

	private synchronized static HttpClient getInstance() {
		if (closeableHttpClient != null) {
			return closeableHttpClient;
		}
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(HTTP_CONNECTION_TIMEOUT).setSocketTimeout(HTTP_SO_TIMEOUT).build();

		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
		cm.setMaxTotal(HTTP_MAX_TOTAL_CONNECTION);
		cm.setDefaultMaxPerRoute(HTTP_MAX_CONNECTION_PER_ROUTE);

		HttpRequestRetryHandler myRetryHandler = new HttpRequestRetryHandler() {
//			Log log = LogFactory.getLog(HttpRequestRetryHandler.class);

			@Override
			public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
				//logger.warn("retry http request(" + executionCount + ")...");

				if (executionCount >= HTTP_RETRY_COUNT) {
					// Do not retry if over max retry count
					return false;
				}

				if (exception instanceof NoHttpResponseException) {
					return true;
				}

				if (exception instanceof SSLHandshakeException) {
					return false;
				}

				HttpClientContext clientContext = HttpClientContext.adapt(context);
				HttpRequest request = clientContext.getRequest();

				return !(request instanceof HttpEntityEnclosingRequest);
			}
		};

		closeableHttpClient = HttpClients.custom()
				.setRetryHandler(myRetryHandler)
				.setDefaultRequestConfig(requestConfig)
				.setUserAgent("HttpComponents Client 4.5.5")
				.setConnectionManager(cm)
				.build();
		return closeableHttpClient;
	}


}
