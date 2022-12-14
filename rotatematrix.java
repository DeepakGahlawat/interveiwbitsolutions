public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> A) {
	    int n;
	    
	    if (A == null)
	        return;
	    
	    n = A.size();
	    
	    if (n == 0)
	        return;
	    
	    int layers = n;
	    int row1, col1, row2, col2;
	    int num;
	    int temp;
	    int first, last;
	    
	    for (int layer = 0; layer < layers / 2; layer++) {
	        
	        first = layer;
	        last = n - layer - 1;
	        
	        for (int i = first; i < last; i++) {
	            
	            int offset = i - layer;
	            
	            int top = A.get(first).get(i);
	            
	            A.get(first).set(i, A.get(last - offset).get(first));
	            
	            A.get(last - offset).set(first, A.get(last).get(last - offset));
	            
	            A.get(last).set(last - offset, A.get(i).get(last));
	            
	            A.get(i).set(last, top);
	        }
	        
	    }
	    
	}
}