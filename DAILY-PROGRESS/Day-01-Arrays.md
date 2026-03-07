# Day 01 - Arrays

## 📌 Today's Problems (GeeksForGeeks)

---

### 1. [Subarray with Given Sum](https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Arrays,Java&sortBy=submissions)
- **Difficulty:** Easy
- **Approach:** Sliding Window

#### ✅ Solution:
```java
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, long s) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        long currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > s && start < end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == s) {
                result.add(start + 1);  // 1-indexed
                result.add(end + 1);    // 1-indexed
                return result;
            }
        }

        result.add(-1);
        return result;
    }
}
```

---

### 2. [Missing Number in Array](https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays,Java&sortBy=submissions)
- **Difficulty:** Easy
- **Approach:** Sum Formula

#### ✅ Solution:
```java
class Solution {
    int missingNum(int arr[]) {
       
        int xor=0;
        for(int i=1;i<=arr.length+1;i++){
            xor^=i;
        }
        for(int a:arr){
            xor^=a;
        }return xor;
    }
}
```

---

### 3. [Second Largest](https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays,Java&sortBy=submissions)
- **Difficulty:** Easy
- **Approach:** Single Pass

#### ✅ Solution:
```java
class Solution {
    public int getSecondLargest(int[] arr) {
        
        
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()==1) return -1;
        int len=list.size();
        return list.get(len-2);
    }
}
```
