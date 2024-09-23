class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] news = Arrays.stream(nums).filter(n -> n > 0).toArray();
        
        Arrays.sort(news);
        int a=news.length;
        int b=1;
        for(int i=0;i<a;i++)
        {
            if(news[i]==b){
                b++;

            }
        }
        return b;
    }
}
