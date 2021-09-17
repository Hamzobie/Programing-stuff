#include <stdio.h>
#include <string.h>

int main()
{
	char var1[]="Informatika UMM";
	char huruf = 'i';
	char* hasil;
	hasil = strchr(var1, huruf);
	
	while(hasil !=NULL)
	{
		printf("Karakter '%c' pada kalimat '%s' ditemukan pada huruf ke-%d", huruf, var1, hasil-var1+1);
		hasil=strchr(hasil+1,huruf);
	}
	
	return 0;
}