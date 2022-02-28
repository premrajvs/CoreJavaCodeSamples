import java.util.HashMap;

public class Day1 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        int[] ret = twoSum(nums, target);
    }

    public static int[] twoSum_fast_highMemory(int[] nums, int target) {
        HashMap<Integer, Integer> collection = new HashMap<Integer, Integer>();
        collection.put(nums[0],0);
        for(int i=1;i<nums.length;i++)
        {
            int ibalance = target - nums[i];
            if(collection.containsKey(ibalance))
            {
                if(i==1)
                    return new int[]{0,i};
                else
                    return new int[]{i,collection.get(ibalance)};
            }
            collection.put(nums[i],i);
        }
        return null;
    }
    
    public int[] twoSum_slow_lowMemory(int[] nums, int target) {
        int icolumncount = nums.length;
        int iConstant = icolumncount;
        int iStartingColumn = 0;
        //System.out.println("Column Count :"+icolumncount);
        for(int i=0;i<icolumncount;i++) {
            for (int j = i+1; j < iConstant; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{0,0};
    }
}
