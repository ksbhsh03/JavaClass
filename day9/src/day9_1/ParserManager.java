package day9_1;
interface Parseable{
	public abstract void parse(String fileName);
}
 class ParserManager {
public static Parseable getParser(String type) {
	if(type.contentEquals("XML")) {
		return new XMLParser();
	}else {
		Parseable p = new HTNLParser();
		return p;
	}
}
}
