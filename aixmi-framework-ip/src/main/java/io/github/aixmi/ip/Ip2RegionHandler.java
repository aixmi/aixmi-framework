package io.github.aixmi.ip;

import lombok.extern.slf4j.Slf4j;
import org.lionsoul.ip2region.DataBlock;
import org.lionsoul.ip2region.DbConfig;
import org.lionsoul.ip2region.DbMakerConfigException;
import org.lionsoul.ip2region.DbSearcher;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/**
 * @author mcqj
 * @date 2020-12-30 下午 17:10
 */
@Slf4j
public class Ip2RegionHandler {

	private static DbSearcher dbSearcher = null;

	static {
		DbConfig config = null;
		try {
			config = new DbConfig();
			URL resource = Ip2RegionHandler.class.getClassLoader().getResource("ip2region.db");
			String path = resource.getPath();
			dbSearcher = new DbSearcher(config, path);
		} catch (DbMakerConfigException | FileNotFoundException e) {
			log.warn("ip2region 初始化失败");
		}
	}

	public static DataBlock getAddressInfo(String ip) {
		if (dbSearcher == null) {
			return null;
		}
		try {
			return dbSearcher.memorySearch(ip);
		} catch (IOException e) {
			log.warn("获取ip地址信息失败");
			return null;
		}
	}
}
