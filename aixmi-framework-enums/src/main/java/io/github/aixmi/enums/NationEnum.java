package io.github.aixmi.enums;

public enum NationEnum {
	//
	HAN("han", "汉族"),
	ZHUANG("zhuang", "壮族"),
	MANCHU("manchu", "满族"),
	HUI("hui", "回族"),
	MIAO("miao", "苗族"),
	HMONG("hmong", "维吾尔族"),
	YI("yi", "彝族"),
	TUJIA("tujia", "土家族"),
	MONGOL("mongol", "蒙古族"),
	TIBETAN("tibetan", "藏族"),
	BUYI("buyi", "布依族"),
	DONG("dong", "侗族"),
	YAO("yao", "瑶族"),
	KOREAN("korean", "朝鲜族"),
	BAI("bai", "白族"),
	HANI("hani", "哈尼族"),
	LI("li", "黎族"),
	KAZAKH("kazakh", "哈萨克族"),
	DAI("dai", "傣族"),
	SHE("she", "畲族"),
	LISU("lisu", "僳僳族"),
	GELAO("gelao", "仡佬族"),
	LAHU("lahu", "拉祜族"),
	DONGXIANG("dongxiang", "东乡族"),
	WA("wa", "佤族"),
	SHUI("shui", "水族"),
	NAXI("naxi", "纳西族"),
	QIANG("qiang", "羌族"),
	DU("du", "土族"),
	XIBE("xibe", "锡伯族"),
	MULAM("mulam", "仫佬族"),
	KIRGHIZ("kirghiz", "柯尔克孜族"),
	DAUR("daur", "达斡尔族"),
	JINGPO("jingpo", "景颇族"),
	SALAR("salar", "撒拉族"),
	BLANG("blang", "布朗族"),
	MAONAN("maonan", "毛南族"),
	TAJIK("tajik", "塔吉克族"),
	PUMI("pumi", "普米族"),
	ACHANG("achang", "阿昌族"),
	NU("nu", "怒族"),
	EVENKI("evenki", "鄂温克族"),
	GIN("gin", "京族"),
	JINO("jino", "基诺族"),
	DEANG("deang", "德昂族"),
	UZBEK("uzbek", "乌孜别克族"),
	RUSSIAN("russian", "俄罗斯族"),
	YUGUR("yugur", "裕固族"),
	BONAN("bonan", "保安族"),
	MENBA("menba", "门巴族"),
	OROQIN("oroqin", "鄂伦春族"),
	DRUNG("drung", "独龙族"),
	TATAR("tatar", "塔塔尔族"),
	HEZHEN("hezhen", "赫哲族"),
	LHOBA("lhoba", "珞巴族"),
	GAOSHAN("gaoshan", "高山族"),
	CHUANQING("chuanqing", "穿青人");
	private String code;

	private String message;

	private NationEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}


}
