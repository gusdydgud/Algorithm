class Solution {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int[] dot : dots) {
            int x = dot[0];
            int y = dot[1];
            
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }
        
        int width = maxX - minX;
        int height = maxY - minY;
        
        return width * height;
    }
}