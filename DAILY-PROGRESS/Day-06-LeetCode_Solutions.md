# **Day 06 - Arrays & Sorting**

## **📌 Today's Problems (LeetCode)**

### **1. [Check if Array is Good](https://leetcode.com/problems/check-if-array-is-good/)**
 
* **Difficulty:** Easy
* **Approach:** Sorting + Validation

#### **✅ Solution:**

```java
class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <= 1) return false;
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == nums[i+1] || nums[i] + 1 != nums[i+1]){
                return false;
            }
        }
        if(nums[0] != 1) return false;
        if(nums[nums.length - 2] == nums[nums.length - 1]) return true;
        return false;
    }
}
```

#### **🧠 Explanation:**
- Sort the array first.
- A "good" array must start at `1`, have consecutive elements from `1` to `n`, and end with `n` appearing exactly **twice** (the last two elements must be equal).
- Loop through all elements except the last two; each must be exactly 1 more than the previous (no duplicates, no gaps).
- Finally, check the last two elements are equal (the duplicate `n`).

---

### **2. [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)**

* **Difficulty:** Easy
* **Approach:** Boolean Array (Marking)

#### **✅ Solution:**

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean a[] = new boolean[nums.length + 1];
        for(int num : nums){
            a[num] = true;
        }
        for(int i = 1; i < nums.length + 1; i++){
            if(a[i] == false){
                list.add(i);
            }
        }
        return list;
    }
}
```

#### **🧠 Explanation:**
- Create a boolean array of size `n+1`, all initialized to `false`.
- Mark `a[num] = true` for every number present in `nums`.
- Iterate from `1` to `n`; any index still `false` means that number is missing — add it to the result list.
- **Time:** O(n) | **Space:** O(n)

---

### **3. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)**

* **Difficulty:** Easy
* **Approach:** Brute Force (Nested Loop)

#### **✅ Solution:**

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j] & j != i){
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}
```

#### **🧠 Explanation:**
- For every element `nums[i]`, count how many other elements `nums[j]` are strictly smaller.
- The `j != i` check skips comparing an element with itself.
- Store the count in `arr[i]` and reset `count` for the next element.
- **Time:** O(n²) | **Space:** O(n)

---

## **📊 Summary Table**

| # | Problem | Difficulty | Approach | Time | Space |
|---|---------|------------|----------|------|-------|
| 1 | Check if Array is Good | Easy | Sort + Validate | O(n log n) | O(1) |
| 2 | Find All Disappeared Numbers | Easy | Boolean Marking | O(n) | O(n) |
| 3 | Smaller Numbers Than Current | Easy | Brute Force | O(n²) | O(n) |
