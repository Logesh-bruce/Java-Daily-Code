# **Day 05 \- Math & Matrix**

## **📌 Today's Problems (LeetCode)**

### **1\. [Sqrt(x)](https://leetcode.com/problems/sqrtx/)**

* **Difficulty:** Easy  
* **Approach:** Math / Built-in Function

#### **✅ Solution:**

class Solution {  
    public int mySqrt(int x) {  
        return (int)Math.sqrt(x);  
    }  
}

### **2\. [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)**

* **Difficulty:** Easy  
* **Approach:** Math / Built-in Function

#### **✅ Solution:**

class Solution {  
    public boolean isPerfectSquare(int num) {  
        int value=(int)Math.sqrt(num);  
        return value\*value==num;  
    }  
}

### **3\. [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)**

* **Difficulty:** Easy  
* **Approach:** Matrix Traversal

#### **✅ Solution:**

class Solution {  
    public int countNegatives(int\[\]\[\] grid) {  
        int count=0;  
        for(int i=0;i\<grid.length;i++){  
            for(int j=0;j\<grid\[i\].length;j++){  
                if(grid\[i\]\[j\]\<0){  
                    count++;  
                }  
            }  
        }  
        return count;  
    }  
}  
