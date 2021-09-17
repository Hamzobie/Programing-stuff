#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main()
{
	int i, Panjang = 20;
	char namadepan[Panjang], namabelakang[Panjang], nim[Panjang];
	bool checker;
	printf("Masukan nama depan : ");
	gets(namadepan);
	printf("Masukan nama belakang : ");
	gets(namabelakang);

	do{
    checker = false;
    printf("NIM : ");
    gets(nim);
	
    for(i = 0; i < Panjang; i++){
      if(strlen(nim) < 14 ){
        printf("\nNim harus berjumlah 15 digit\n");
		checker = true;
        break;
      }
    }
	}while(checker);
  	  printf("Selamat %s, data kamu berhasil dibuat \n", namadepan);
  	  printf("==================\n");
  	  strcat(namadepan, namabelakang);
      printf("Nama Lengkap : %s \n", namadepan);
      printf("Nim : %s \n", nim);
      printf("==================\n");
	return 0;
	
}