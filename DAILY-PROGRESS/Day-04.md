# Day 04 - Strings & Arrays  

## 📌 Today's Problems (NeetCode)
 
---

### 1. [Append Characters to String to Make Subsequence](https://neetcode.io/problems/append-characters-to-string-to-make-subsequence)
- **Difficulty:** Medium
- **Approach:** Two Pointers

#### ✅ Solution:
```java
class Solution {
    public int appendCharacters(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < t.length() && t.charAt(j) == s.charAt(i)) j++;
        }
        return t.length() - j;
    }
}
```

---

### 2. [Length of Last Word](https://neetcode.io/problems/length-of-last-word)
- **Difficulty:** Easy
- **Approach:** Split String

#### ✅ Solution:
```java
class Solution {
    public int lengthOfLastWord(String s) {
        String[] d = s.split(" ");
        return d[d.length - 1].length();
    }
}
```

---

### 3. [Max Consecutive Ones](https://neetcode.io/problems/max-consecutive-ones)
- **Difficulty:** Easy
- **Approach:** Linear Scan

#### ✅ Solution:
```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
```
