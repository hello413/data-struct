/*������˳���LA,LB����Ԫ�ؾ�Ϊ�ǵݼ��������У���д�㷨�����Ǻϲ���һ��˳���LC��Ҫ��LCҲ�Ƿǵݼ��������С�
	���磺
			LA=(2,2,3)		LB=(1,3,3,4)
				LC=(1,2,2,3,3,3,4)*/
#include"linearlist.h"

void mergeList(SeqList* LA, SeqList* LB, SeqList* LC)
{
	int i = 0, j = 0, k = 0, l;
	while (i <= LA->last && i <= LB->last)
	{
		if (LA->elem[i] <= LB->elem[j]) {
			LC->elem[k++] = LA->elem[i++];
		}
		else
		{
			LC->elem[k++] = LB->elem[j++];
		}
	}
	while (i<=LA->last)
	{
		LC->elem[k++]== LA->elem[i++];
	}
	while (j <= LB->last)
	{
		LC->elem[k++] == LB->elem[j++];
	}
	LC->last = LA->last + LB->last + 1;
}