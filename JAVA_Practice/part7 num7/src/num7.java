import java.util.*;

class HV {
	public static Vector<String> htv(HashMap<String, String> h) {
		Vector<String> v = new Vector<String>();
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key=it.next();
			String value=h.get(key);
			v.add(value);
		}
		return v;
	}
}

public class num7 {

	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		Vector<String> v = HV.htv(h);
		for (int n = 0; n < v.size(); n++)
			System.out.println(v.get(n));
	}

}
