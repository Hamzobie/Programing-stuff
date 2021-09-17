#include <stdio.h>
#define SIZE 3
int main()
{
	char karakter[SIZE];
	int i;
	
	printf("Masukan 3 karakter sembarang :");
	
	for(i=0;i<=(SIZE);i=i+1)
	{
		scanf("%c", &karakter[i]);
	}
	
	printf("Karakter dalam urutan terbalik :");
	for(i=SIZE-1;i>=0;i=i-1)
	{
		printf("%c \t", karakter[i]);
	}	
	
	printf("\n");
	printf("%c \t", karakter[SIZE]);
	
	return 0;
}