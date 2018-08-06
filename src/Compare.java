import java.util.List;

public class Compare {

	static public  int getGreater( List<Integer> a, List<Integer> b )
	{
		int i=-2;
		for(int j=0;j<a.size();j++)
		{
			if(a.get(j)>=b.get(j) && i!=0)
				i=1;
			else if(a.get(j)<b.get(j) && i!=1)
			  i=0;
			else
				return -1;
		}
			
		return i;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
