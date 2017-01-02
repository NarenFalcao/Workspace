import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;

public class Solution {

static ArrayList<Integer> [] seqList;

public static void main(String[] args) {
    try{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s[] = br.readLine().split(" ");

    int numSeq = Integer.valueOf(s[0]);
    int numQ = Integer.valueOf(s[1]);

    int lastAns =0;
    //int[] index = new int[numSeq];

    seqList = new ArrayList[numSeq];    
    for(int i=0; i<seqList.length; i++)
            seqList[i] = new ArrayList<Integer> ();
    //seqList = new int[numSeq][numSeq];


    if(numSeq>=1 && numQ>=1 && numSeq<=100000 && numQ<= 100000){
        while(numQ>0){
            numQ--;

            String str[] = br.readLine().split(" ");

            int n = Integer.valueOf(str[0]);
            int x = Integer.valueOf(str[1]);
            int y = Integer.valueOf(str[2]);

            if(x<= Math.pow(10, 9) && y <= Math.pow(10, 9) && x>=0 && y>=0){
                int z = (x^lastAns)%numSeq;
                switch(n){
                    case 1 : if(z<numSeq)
                                seqList[z].add(y);
                             break;
                    case 2 : int w = y% (seqList[z].size());
                             lastAns = seqList[z].get(w);
                             System.out.println(lastAns);
                             break;

                }   
                }
            }
        }
    }
 catch(Exception e){}   
}
}