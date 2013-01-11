public static Node findIntersect(Node list1, Node list2)
{
	if (list1 == null || list2 == null)
		return null;
	
	if (list1 == list2)
		return list1;
		
	int list1Len = 0;
	Node it1 = list1;
	while (it1 != null)
	{
		list1Len++;
		it1 = it1.next;
	}
	
	int list2Len = 0;
	Node it2 = list2;
	while (it2 != null)
	{
		list2Len++;
		it2 = it2.next;
	}
	
	int lenDiff = Math.abs(list1Len - list2Len);
	it1 = list1;
	it2 = list2;
	
	if (list2Len > list1Len)
	{
		while (lenDiff > 0)
		{
			it2 = it2.next;
			lenDiff--;
		}
	}
	else if (list1Len > list2Len)
	{
		while (lenDiff > 0)
		{
			it1 = it1.next;
			lenDiff;
		}
	}
	
	while (it2 != null and it1 != null)
	{
		if (it2 == it1)
			return it2;
		it1 = it1.next;
		it2 = it2.next;
	}
	
	return null;
}