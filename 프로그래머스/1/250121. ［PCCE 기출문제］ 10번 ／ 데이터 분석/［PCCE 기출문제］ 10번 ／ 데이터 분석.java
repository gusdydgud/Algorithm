import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answerList = new ArrayList<>();
		String[] meaning = {"code", "date", "maximum", "remain"};
        
		int sortIndex = Arrays.asList(meaning).indexOf(sort_by);
		int extIndex = Arrays.asList(meaning).indexOf(ext);
		
		for(int i=0; i<data.length; i++) {
			if(data[i][extIndex] < val_ext) {
				answerList.add(data[i]);
			}
		}
		
		Collections.sort(answerList, (o1, o2) -> o1[sortIndex] - o2[sortIndex]);
		int[][] answer = new int[answerList.size()][];
	        answerList.toArray(answer);
	    
	    return answer;
    }
}