import java .util.*;
class UserArrayList<E>
{
	public static final int DEFAULT_CAPACITY=10;
	int indx=0;
	E[] arr;
	@SuppressWarnings("unchecked")
	UserArrayList(){
		arr=(E[])new Object[DEFAULT_CAPACITY];
	}
	@Override
	public String toString()
	{
		if(indx==0)
			 return "[]";
		String op="[";
		for(int i=0;i<indx-1;i++)
			op=op+arr[i]+", ";
		return op+arr[indx-1]+"]";
	}
	public boolean add(E ele)
	{
		if(arr.length<=size())
		{
			int newCap=newCapacity(arr.length);
			E[] newArr=(E[])new Object[newCap];
			for (int i=0;i<arr.length ;i++ )
			   newArr[i]=arr[i];
			arr=newArr;
		}
		arr[indx++]=ele;
	 return true;
	}
	public int size()
	{
		return indx;
	}
	public E remove(int indx)
	{
		if(indx<0 ||indx>=size())
			 throw new IndexOutOfBoundsException("Wrong index "+indx);
		E ele=arr[indx];
		for (int i=indx;i<arr.length-1 ;i++ ) 
			arr[i]=arr[i+1];
		arr[arr.length-1]=null;
		this.indx--;
	return ele;
	}
	public int indexOf(E ele)
	{
		for (int i=0;i<size() ;i++ )
		   if(arr[i].equals(ele))
		   	  return i;
		return -1;
	}
	public int lastIndexOf(E ele)
	{
		for (int i=size()-1;i>=0 ;i-- )
		   if(arr[i].equals(ele))
		   	  return i;
		return -1;
	}
	public int newCapacity(int oldCap)
	{
		return ((oldCap*3)/2)+1;
	}
	public E set(int indx,E ele)
	{
		if(indx<0 || indx>=size())
			 throw new ArrayIndexOutOfBoundsException("Wrong index "+indx);
		E temp=arr[indx];
		arr[indx]=ele;
	 return temp;
	}
	public E get(int indx)
	{
		if(indx<0 || indx>=size())
			 throw new ArrayIndexOutOfBoundsException("Wrong index "+indx);
		return arr[indx];
	}
	public void addAll(Collection<E> coll)
	{
		E[] newArr=(E[])new Object[10];
		if(arr.length<=(coll.size()+size()))
		{
			int newCap=newCapacity(arr.length);
			newArr=(E[])new Object[newCap];
			if(newArr.length<=(coll.size()+size()))
				{
					int newCap1=newCapacity(newCap);
					newArr =(E[])new Object[newCap1];
				}
		}
		//System.out.println(newArr.length);
		for(int i=0;i<size();i++)
			newArr[i]=arr[i];
			
		Object []objArr=coll.toArray();
		
		for(int i=0,j=size();i<coll.size();i++,j++)
			newArr[j]=(E) objArr[i];
		arr=newArr;
		this.indx+=coll.size();
	}
	public boolean removeAll(Collection<E> coll)
	{
		Object[] objArr=coll.toArray();
		boolean flag=false;
		for (int j=0;j<objArr.length;j++ ) {
			E ele=(E)objArr[j];
			for (int i=0;i<size();i++ )
		 	{
				if(ele==arr[i])
				{
					remove(i);
					flag=true;
				}
		 	}
		}
		return flag;
	}

}
class ArrayListDriver
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	 {
		UserArrayList list=new UserArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		// System.out.println(list.lastIndexOf(20));
		// System.out.println(list.get(0));
		 System.out.println(list);
		ArrayList<Integer>  a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(100);
		a.add(80);
		// ArrayList<Integer>  b=new ArrayList<>();
		// b.add(600);
		// b.add(900);
		// b.add(800);
		// System.out.println(a.removeAll(b));
		// System.out.println(a);

		System.out.println(list.removeAll(a));
		System.out.println(list);
	}
}