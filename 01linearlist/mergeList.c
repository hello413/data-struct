/*有两个顺序表LA,LB，其元素均为非递减有序排列，编写算法将它们合并成一个顺序表LC，要求LC也是非递减有序排列。
	例如：
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