
public class Solution2
{
	public int maxBlock(String str)
	{
		int stLen = str.length();
		int maxBlock = 0;
		int block = 1;
		char ch;
		char current;
		if(stLen == 0)
			return 0;
		ch = str.charAt(0);
		for(int i = 1; i < stLen; i++)
		{
			current = str.charAt(i);
			if(current == ch)
				block++;
			else
			{
				if(block > maxBlock)
					maxBlock = block;
				block = 1;
				ch = current;
			}
		}
		if(block > maxBlock)
				maxBlock = block;
		return maxBlock;
	}
	public static void main(String[] args)
	{
		Solution2 s2=new Solution2();
		System.out.println(s2.maxBlock("aaabbbcd"));
	}
}
	