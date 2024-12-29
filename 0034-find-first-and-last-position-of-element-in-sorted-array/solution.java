class Solution {    
    public int start(int []nums,int t){
        int n=nums.length;
        int l=0;
        int r=n-1;
        int val=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==t){
                val=mid;
                r=mid-1;
                System.out.println(r);
                
            }
            else if(nums[mid]>t){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return val;
    }
    public int end(int []nums,int t){
        int n=nums.length;
        int l=0;
        int r=n-1;
        int val=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==t){
                val=mid;
                l=mid+1;
                System.out.println(val);
                
            }
            else if(nums[mid]>t){
                r=mid-1;
                
            }
            else{
                l=mid+1;
            }
            
        }
        return val;
    }




    public int[] searchRange(int[] nums, int t) {
        int st=start(nums,t);
        int end=end(nums,t);
        int ans[]=new int [2];
        ans[0]=st;
        ans[1]=end;
        return ans;
    }
}

