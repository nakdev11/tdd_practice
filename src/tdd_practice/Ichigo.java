package tdd_practice;

import java.util.Arrays;
import java.util.List;

public class Ichigo {

	private String hinsyu;
	private String size;
	private double weight;

	private List<String> hinsyuList = Arrays.asList("あまおう", "とちおとめ", "もういっこ");
	private List<String> sizeList = Arrays.asList("S", "M", "L", "LL");

	public Ichigo(String hinsyu, String size) throws Exception {
		if (hinsyuList.contains(hinsyu) && sizeList.contains(size)) {
			this.hinsyu = hinsyu;
			this.size = size;
			return;
		}
			throw new IllegalArgumentException("品種またはサイズが対象外です");
	}

	public Ichigo(String hinsyu, double weight) {
		this.hinsyu = hinsyu;
		if (weight >= 1 && weight < 10) {
			this.size = "S";
		}
	}

	public String getHinsyu() {
		return hinsyu;
	}

	public String getSize() {
		return size;
	}

	public String getIchigoToString() {
		return this.hinsyu + ": " + this.size;
	}

}
