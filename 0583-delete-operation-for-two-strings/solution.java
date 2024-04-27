class Solution {
    public int minDistance(String word1, String word2) {
         int[][] matrix = new int[word1.length()][word2.length()];
         int biggest = 0;
        for (int i = 0; i < word1.length(); i++) {
        	if(word1.charAt(i)==word2.charAt(0))
        	{
        		matrix[i][0] = 1;
        	}
        	else {
				if(i>0)matrix[i][0] = matrix[i-1][0];
			}
        		
		}
        for (int i = 0; i < word2.length(); i++) {
			if(word2.charAt(i)==word1.charAt(0))
        	{
        		matrix[0][i] = 1;
        	}
        	else {
				if(i>0)matrix[0][i] = matrix[0][i-1];
			}
		}
        
        for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if(word1.charAt(i)==word2.charAt(j))
					matrix[i][j] = matrix[i-1][j-1] + 1;
				else matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]) + 0;
			}
		}

         

        biggest = matrix[word1.length()-1][word2.length()-1];
        int y = (word1.length() + word2.length() - 2 * biggest);
        return y;
    }
}
