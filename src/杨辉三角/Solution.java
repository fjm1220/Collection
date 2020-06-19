package 杨辉三角;
import java .util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
        {
            return result;
        }
        //第一行固定
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if(numRows == 1){
            return result;
        }
        //第二行也是固定
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if(numRows == 2)
        {
            return result;
        }
        //其他行
        //第i行就有i个元素
        for(int i = 3;i <= numRows;i++){
            //先得到上一行的情况
            List<Integer> preLine = result.get(i-1-1);
            List<Integer> curLine = new ArrayList<>();
            //具体每一行的情况:开头和最后一个都为1;
            curLine.add(1);
            //此处的i,j为i行j列
            //中间的元素(i,j) = (i-1,j-1)+(i-1,j);
            for(int j = 2;j < i;j++)
            {
                curLine.add(preLine.get(j-1-1)+preLine.get(j-1));
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }
}
