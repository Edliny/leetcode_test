package cn.tedu.cn.tedu.leetcode;
/**
 *最富有客户的资产总量：
 * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 *
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/richest-customer-wealth
 */
public class RichestAccount {
    public static void main(String[] args){
        int[][] accounts={{1,2,3},{5,2,1},{5,6}};
        int maxSum=maximumWealth(accounts);
        System.out.println(maxSum);
    }

    private static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int i=0;i<accounts.length;i++){
            int n=0;
            for (int j=0;j<accounts[i].length;j++){
                n+=accounts[i][j];
            }
            if(n>max) max=n;
        }
        return max;
    }
}
