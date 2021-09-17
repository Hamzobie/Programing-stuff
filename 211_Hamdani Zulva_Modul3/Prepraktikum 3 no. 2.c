#include <stdio.h>

int main(int argc, char** argv)
{
	int i;
	for(i = 500; i >= 0; i-=2)
	{
		printf("%d \n", i);
	}
	return 0;
}