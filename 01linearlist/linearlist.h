#ifndef _LIST_H_
#define _LIST_H_

#include<stdio.h>
#pragma warning(disable:4996)


#define OK  1
#define ERROR 0
#define MAXSIZE 20		//���Ա����󳤶�
typedef char ElemType;
typedef struct
{
	ElemType elem[MAXSIZE];		//���Ա�ռ�õ�����ռ�
	int last;		//��¼���һ��Ԫ��������elem�е�λ��
} SeqList;


int LocateElem(SeqList L, ElemType e);
void unionList(SeqList* La, SeqList Lb);
int GetElem(SeqList L, int i, ElemType* e);
int DelList(SeqList* L, int i, ElemType* e);
int ListInsert(SeqList* L, int i, ElemType e);



#endif // !_LIST_H_
