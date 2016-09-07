package com.leetcode;

import java.util.ArrayList;

/**
 * Created by carl on 2016/9/4.
 *
 *  Implement strStr()
 */
public class leetcode28 {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0) return 0;
        if (haystack.length()==0||needle.length()==0) return -1;

        char hay[]=haystack.toCharArray();
        char find[]=needle.toCharArray();

        ArrayList<Integer> pos=new ArrayList<>();

        for(int i=0;i<hay.length;i++){
            if(hay[i]==find[0]){
                pos.add(i);
            }
        }
        int needllength=needle.length();
        int haystacklength=haystack.length();
        for(Integer a:pos){
            if(a+needllength<=haystacklength){
                if(haystack.substring(a,a+needllength).equals(needle)){
                    return  a;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String hay="a";
        String needle="";
        System.out.println(new leetcode28().strStr(hay,needle));
    }
}

/**
 * Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 */
/*
class Solution {
    public:
    int strStr(string haystack, string needle) {
        int m = haystack.size();
        int n = needle.size();
        for(int i = 0; i <= m-n; i ++)
        {
            int j;
            for(j = 0; j < n; j ++)
            {
                if(haystack[i+j] != needle[j])
                    break;
            }
            if(j == n)
                return i;
        }
        return -1;
    }
};
*/