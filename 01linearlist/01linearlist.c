#include"linearlist.h"

void unionList(SeqList* La, SeqList Lb)		
{
	ElemType e;
	int La_len = ListLength(*La), Lb_len = ListLength(Lb);
	for (int i = 1; i < Lb_len; i++)
	{
		GetElem(Lb, i, &e);
		if (!LocateElem(*La, e))
		{
			ListInsert(La, ++La_len, e);
		}
	}
}

int ListLength(SeqList La)
{
	return La.last;
}

int LocateElem(SeqList L, ElemType e)//按内容查找
{
	int i = 0;
	while ((i <= L.last)&&L.elem[i]!=e)
	{
		i++;
	}
	if (i <= L.last)
	{
		return (i + 1);
	}
	else
	{
		return (-1);
	}

}

int GetElem(SeqList L, int i, ElemType* e)			//按序号查找
{
	if (L.last == 0 || i<1 || i>L.last)
	{
		return 0;
	}
	*e = L.elem[i - 1];
	return 1;
}

int ListInsert(SeqList* L, int i, ElemType e)		//插入运算
{
	int k;
	if (L->last == MAXSIZE)
	{
		printf("表已满！");
		return 0;
	}
	if (i<1 || i>L->last+2)
	{
		printf("插入位置不合法");
		return 0;
	}
	for (k = L->last - 1; k >= i - 1; k--)
	{
		L->elem[k + 1] = L->elem[k];
	}
	L->elem[i - 1] = e;
	L->last++;
	return 1;
}

int DelList(SeqList* L, int i, ElemType* e)			//删除运算
{
	int k;

	if (i<1 || i>L->last + 1)
	{
		printf("删除位置不合法");
		return 0;
	}
	
	for (k = i - 1; k <= L->last - 1; k++)
	{
		L->elem[k] = L->elem[k+1];
	}
	L->last--;
	return 1;
}