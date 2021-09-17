#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main(){
  int i, panjangArray = 20;
  char str[panjangArray];
  bool checker;
  // Perulangan dilakukan jika inputan berupa angka atau checker bernilai true
  do{
    checker = false;
    printf("Input : ");
    gets(str); // Input string arr
    // Pengecekan karakter tiap index inputan string
    for(i = 0; i < panjangArray; i++){
      // Jika inputan arr index i terdapat angka maka checker = true dan perulangan for dihentikan
      // 48 sampai 57 merupakan kode ASCII karakter desimal '0' sampai '9'
      if((str[i] <= 48) && (str[i] >= 57)){
        printf("ERROR : INPUTAN TIDAK BOLEH BERUPA ANGKA 0-9\n");
        checker = true;
        break;
      }
    }
  }while(checker);
  printf("BERHASIL, WES PAHAM YO REKKKKKKKKK");
  
  return 0;
}