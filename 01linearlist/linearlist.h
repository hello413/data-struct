#ifndef _LIST_H_
#define _LIST_H_

#include<stdio.h>
#pragma warning(disable:4996)


#define OK  1
#define ERROR 0
#define MAXSIZE 20
typedef int ElemType;
typedef struct
{
	ElemType elem[MAXSIZE];
	int last;
} SeqList;


int LocateElem(SeqList L, ElemType e);
void unionL(SeqList* La, SeqList Lb);
int GetElem(SeqList L, int i, ElemType* e);
int DelList(SeqList* L, int i, ElemType* e);
int ListInsert(SeqList* L, int i, ElemType e);



#endif // !_LIST_H_
