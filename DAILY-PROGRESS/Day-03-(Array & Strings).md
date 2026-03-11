# Day 03 - Mixed (Strings & Arrays)

## 📌 Today's Problems (NeetCode)

---

### 1. [Valid Anagram](https://neetcode.io/problems/is-anagram)
- **Difficulty:** Easy
- **Approach:** Sorting

#### ✅ Solution:
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < s.length(); i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
```

---

### 2. [Replace Elements with Greatest Element on Right Side](https://neetcode.io/problems/replace-elements-with-greatest-element-on-right-side)
- **Difficulty:** Easy
- **Approach:** Linear Scan

#### ✅ Solution:
```java
class Solution {
    public int[] replaceElements(int[] arr) {
        int j = 0;
        while (j < arr.length) {
            int max = 0;
            for (int i = j + 1; i < arr.length; i++) {
                if (max < arr[i]) max = arr[i];
            }
            arr[j++] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
```

---

### 3. [Is Subsequence](https://neetcode.io/problems/is-subsequence)
- **Difficulty:** Easy
- **Approach:** Two Pointers

#### ✅ Solution:
```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();
    }
}
```
