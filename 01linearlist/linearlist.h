#ifndef _LIST_H_
#define _LIST_H_

#include<stdio.h>
#pragma warning(disable:4996)


#define OK  1
#define ERROR 0
#define MAXSIZE 20		//线性表的最大长度
typedef char ElemType;
typedef struct
{
	ElemType elem[MAXSIZE];		//线性表占用的数组空间
	int last;		//记录最后一个元素在数组elem中的位置
} SeqList;


int LocateElem(SeqList L, ElemType e);
void unionList(SeqList* La, SeqList Lb);
int GetElem(SeqList L, int i, ElemType* e);
int DelList(SeqList* L, int i, ElemType* e);
int ListInsert(SeqList* L, int i, ElemType e);



#endif // !_LIST_H_
