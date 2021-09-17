#include <stdio.h>

int main()
{
	char var1[] = "Informatika UMM";
	char huruf ='i';
	int i=0, hasil;
	
	while (var1[i] != '\0'){
		if(var1[i]==huruf){
			hasil=i+1;
		}
		i++;
	}
	printf("Karakter '%c' pada kalimat '%s' ditemukan pada huruf ke-%d", huruf, var1, hasil);
	
	return 0;
}