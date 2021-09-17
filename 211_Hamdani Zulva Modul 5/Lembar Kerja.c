#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char datUN[50], datPW[50], datKU[50];

void reg();
void openList();
void login();

char *subString(char *someString, int n)
{
	char *new = malloc(sizeof(char)*n+1);
   strncpy(new, someString, n);
   new[n] = '\0';
   return new;
}

FILE *List;//buffer area

int main()
{
	int pilih;
	printf("Menu\n1. Registrasi\n2. Login\n3. Tampilkan semua data\n4. EXIT\nPILIH MENU : ");
	scanf("%d", &pilih);

	switch(pilih){
	case 1:
		reg();
		break;
	case 2:
		login();
		break;
	case 3:
		openList();
		break;
	case 4:
		exit(1);
		break;
	default:
		printf("Menu tidak tersedia!!\n\n");
		break;
	}
	return 0;
}


void reg(){
	char un[50], pw[50];
	
	printf("Input Username : ");
	scanf("%s", un);
	printf("Input Password : ");
	scanf("%s", pw);

	if(strlen(un)<6){
		printf("username harus lebih dari 6 karakter\n\n");
		return reg();
	}else{
		int i;
		for(i=0; i < strlen(un); i++){
			if(!((un[i]>=48 && un[i]<=57) || (un[i]>=65 && un[i]<=90) || (un[i]>=97 && un[i]<=122) || (un[i]==56)))
			{
				printf("Username tidak boleh menggunakan karakter spesial!\n\n");
				return reg();
			}
		}
	}
	
	if(strlen(pw)<8){
		printf("password harus lebih dari 8 karakter\n\n");
		return reg();
	}else{
		int i = 0, small = 0, caps = 0, spec = 0, num = 0;
		while(pw[i]!='\0'){
			if(pw[i]>=48 && pw[i]<=57)
				num++;	
			else if(pw[i]>=65 && pw[i]<=90)
				caps++;
			else if(pw[i]>=97 && pw[i]<=122)
				small++;
			else
				spec++;
			i++;
		}
		if(small == 0 || caps == 0 || spec == 0 || num == 0){
			printf("Password harus terdiri minimal 1 huruf kecil, 1 huruf kapital, 1 angka, dan 1 karakter spesial!\n\n");
			return reg();
		}else{
			//Ngecek palindrome.
			char rev[50];
			strcpy(rev, pw);
			strrev(rev);
			if(strcmp(pw, rev)==0){
				printf("password tidak boleh palindrome!\n\n");
				return reg();
		    }
		}
	}		
	
	int j = 1;
	List = fopen("register.txt", "a+");
	//mengecek username yang sudah ada di file
	while(fscanf(List, "%s %s %s", datUN, datPW, datKU)!=EOF){
		if(strcmp(datUN, un)==0){
			printf("User tidak bisa digunakan!!\n\n");
			main();
		}
		j++;
	}
	
	//mengambil 3 karakter pertama dan mengkapitalisasi
	char b[50];
	strncpy(b, un, 3);
	strupr(b);
	
	//Ini digunakan untuk urutan kode user
	
	fprintf(List, "%s %s %s-%.04d\n", un, pw, b, j);
	
	printf("Username berhasil dibuat");
	printf("\n Username : %s\n Password : %s\n Kode User : %s\n\n", un, pw, b);
	fclose(List);
	
	main();
}


void login(){
	char un[50], pw[50];
	int f1=0;
	printf("Masukkan username : ");
	scanf("%s",un);
	printf("Masukkan pass : ");
	scanf("%s",pw);
	
	List = fopen("register.txt", "r");
	
	while(fscanf(List, "%s %s %s", datUN, datPW, datKU)!=EOF)
	{
		if ((strcmp(datKU, un)==0||strcmp(datUN, un)==0) && strcmp(datPW, pw)==0){
			f1=1;
			break;
		}
	}
	fclose(List);

	if(f1==1){
		printf("Selamat datang %s\n", datUN);
		printf("=== Data anda ===\n");
		printf("Username : %s\n", datUN);
		printf("Kode User : %s\n\n", datKU);
		main();
	}else{
		printf("User atau Password anda salah!\n\n");
		login();
	}
}

void openList(){
	int b = 1;
	List = fopen("register.txt", "r");
	printf("=== LIST DATA ===\n");
	while(fscanf(List, "%s %s %s", datUN, datPW, datKU)!=EOF){
		printf("=== %d ===\nUsername : %s\nKode User : %s\n", b, datUN, datKU);
		b++;
	}
	printf("\n");
	fclose(List);
	main();
}

