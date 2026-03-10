# Day 02 - Arrays

## 📌 Today's Problems (LeetCode)

---

### 1. [Score of a String](https://neetcode.io/problems/score-of-a-string)
- **Difficulty:** Easy
- **Approach:** Linear Scan

#### ✅ Solution:
```java
class Solution {
    public int scoreOfString(String s) {
        int a = 0;
        for (int i = 1; i < s.length(); i++) {
            int sa = Math.abs(s.charAt(i) - s.charAt(i - 1));
            a += sa;
        }
        return a;
    }
}
```

---

### 2. [Concatenation of Array](https://neetcode.io/problems/concatenation-of-array)
- **Difficulty:** Easy
- **Approach:** Index Mapping

#### ✅ Solution:
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] con = new int[nums.length * 2];
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            con[i] = nums[i];
            con[len++] = nums[i];
        }
        return con;
    }
}
```

---

### 3. [Contains Duplicate](https://neetcode.io/problems/duplicate-integer)
- **Difficulty:** Easy
- **Approach:** Sorting

#### ✅ Solution:
```java
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) return true;
        }
        return false;
    }
}
```
