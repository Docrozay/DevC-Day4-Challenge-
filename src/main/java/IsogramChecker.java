
import java.util.HashSet;

class IsogramChecker {

    /**
     * Determine if a word or phrase is an isogram.
     *
     * @param phrase string variable
     * @return True or False
     */

    boolean isIsogram(String phrase) {

        String alphas = phrase.replaceAll("\\P{L}+","").toLowerCase();
		HashSet<String> letters = new HashSet<>();

		for(int i=0; i<alphas.length(); i++) {
			boolean already = letters.add(String.valueOf(alphas.charAt(i)));
			if(!already) return false;
		}
        return true;
    }
}
