#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void reg();
void openlist();
void login();
void chpw();
void delacc();

char datUN[50], datPW[50], datKU[50];
FILE *fdat;

int main()
{
	int input;
	printf("Menu User\n1. Registrasi\n2. Masuk\n3. Tampilkan semua data\n4. EXIT\nMASUKKAN PILIHAN : ");
	scanf("%d", &input);

	switch(input){
	case 1:
		reg();
		break;
	case 2:
		login();
		break;
	case 3:
		openlist();
		break;
	case 4:
		exit(1);
		break;
	default:
		printf("Menu tidak tersedia!\n\n");
		break;
}
 return 0;
}
void reg(){
	char un[50], pw[50];
	
	printf("Masukan Username : ");
	scanf("%s", un);

	if(strlen(un)<6){
		printf("username minimal terdiri dari 6 karakter atau lebih\n\n");
		main();
	}else{
		int i;
		for(i=0; i < strlen(un); i++){
			if(!((un[i]>=48 && un[i]<=57) || (un[i]>=65 && un[i]<=90) || (un[i]>=97 && un[i]<=122) || (un[i]==56)))
			{
				printf("Username tidak boleh menggunakan karakter spesial!\n\n");
				main();
			}
		}
	}
	
	printf("Masukan Password : ");
	scanf("%s", pw);
	
	if(strlen(pw)<8){
		printf("password minimal terdiri dari 8 karakter\n\n");
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
			printf("Password harus minimal terdiri dari 1 huruf kecil, 1 huruf kapital, 1 angka, dan 1 karakter spesial!\n\n");
			main();
		}else{
			//Ngecek palindrome.
			char rev[50];
			strcpy(rev, pw);
			strrev(rev);
			if(strcmp(pw, rev)==0){
				printf("password tidak boleh berbentuk palindrome\n\n");
				main();
		    }
		}
	}
	
	int ju = 1;
	fdat = fopen("FileUser.txt", "a+");
	//mengecek username yang sudah ada di file
	while(fscanf(fdat, "%s %s %s", datUN, datPW, datKU)!=EOF){
		if(strcmp(datUN, un)==0){
			printf("Username telah dipakai!!\n\n");
			main();
		}
		ju++;
	}
 	
 	char ku[50];
 	strncpy(ku, un, 3);
 	strupr(ku);
	fprintf(fdat, "%s\n%s\n%s-%.04d\n", un, pw, ku, ju);
	
	printf("Username berhasil dibuat");
	printf("\n Username : %s\n Password : %s\n Kode User : %s-%.04d\n\n", un, pw, ku, ju);
	fclose(fdat);
	main();	
}

void login(){
	char un[50], pw[50];
	int v=0;
	int i;
	
	printf("Masukan Username : ");
	scanf("%s", un);
	printf("Masukan Password : ");
	scanf("%s", pw);
	
	fdat=fopen("FileUser.txt","r+");
	
	while(fscanf(fdat, "%s %s %s", datUN, datPW, datKU) !=EOF){
		if((strcmp(datUN, un)==0 || strcmp(datKU, un)==0) && strcmp(datPW, pw)==0)
			v=1;
			break;
	}
	if(v==1){
		printf("Selamat datang %s\n", datUN);
		printf("=== Data anda ===\n");
		printf("Username : %s\n", datUN);
		printf("Kode User : %s\n\n", datKU);
		
		printf("MENU :\n1.Ganti Password\n2.Hapus Akun\nPILIHAN :");
		scanf("%d", &i);
		switch(i)
		{
		case 1:
			chpw();
			break;
		case 2:
			delacc();
		default:
			break;
		}
	}else{
		printf("Masukan User atau Password anda salah!\n\n");
		login();
	}
}

void chpw(){
	char c[2], newpw[50], oldpw[50];
	char *buffer;
	char *ptr;
	
	buffer = (char *)malloc(1000*sizeof(char));
   	memset(buffer, 0, 1000*sizeof(char));
	ptr = buffer;
	
	printf("Apakah anda yakin ingin mengganti pasword (y/n) : ");
	scanf("%s", c);

	if(strcmp(c, "y")==0){
	fdat = fopen("FileUser.txt", "r");	
		printf("Masukan Password lama : ");
		scanf("%s", oldpw);
		printf("Masukan Password baru : ");
		scanf("%s", newpw);
	if(strlen(newpw)<8){
		printf("password minimal terdiri dari 8 karakter\n\n");
		return reg();
	}else{
		int i = 0, small = 0, caps = 0, spec = 0, num = 0;
		while(newpw[i]!='\0'){
			if(newpw[i]>=48 && newpw[i]<=57)
				num++;	
			else if(newpw[i]>=65 && newpw[i]<=90)
				caps++;
			else if(newpw[i]>=97 && newpw[i]<=122)
				small++;
			else
				spec++;
			i++;
		}
		if(small == 0 || caps == 0 || spec == 0 || num == 0){
			printf("Password harus minimal terdiri dari 1 huruf kecil, 1 huruf kapital, 1 angka, dan 1 karakter spesial!\n\n");
			main();
		}else{
			char rev[50];
			strcpy(rev, newpw);
			strrev(rev);
			if(strcmp(newpw, rev)==0){
				printf("password tidak boleh berbentuk palindrome\n\n");
				main();
		    }
		}
	}

		while(fscanf(fdat, "%s %s %s", datUN, datPW, datKU)!=EOF){
			strcat(datUN, "\n");
			strcat(datPW, "\n");
			strcat(datKU, "\n");
			strcat(newpw, "\n");
			if(strcmp(datPW, oldpw)==0){
				strcpy(ptr, datUN);
				ptr += strlen(datUN);
				strcpy(ptr, newpw);
				ptr += strlen(newpw);
				strcpy(ptr, datKU);
	   			ptr += strlen(datKU);
			}else{
				strcpy(ptr, datUN);
				ptr += strlen(datUN);
				strcpy(ptr, datPW);
				ptr += strlen(datPW);
				strcpy(ptr, datKU);
	   			ptr += strlen(datKU);
			}
				
		}
		fclose(fdat);
	
		fdat = fopen("FileUser.txt", "w+");
		fprintf(fdat, "%s", buffer);
		fclose(fdat);	
 		printf("\n\n--=Berhasil!=--\n\n");
 	
		main();
	}else if(strcmp(c, "n")==0){
		main();
	}
	
}


void openlist() {
	int u = 1;
	fdat = fopen("FileUser.txt", "r");
	printf("===-LIST USER-===\n");
	while(fscanf(fdat, "%s %s %s", datUN, datPW, datKU)!=EOF){
		printf("======= %d =======\nUsername : %s\nKode User : %s\n", u, datUN, datKU);
		u++;
	}
	printf("\n");
	fclose(fdat);
	main();
}

void delacc(){
	char un[50], pw[50], ku[50];
	char *buffer;
	char *ptr;
		
	printf("Masukan Username : ");
	scanf("%s", un);
	printf("Masukan Password : ");
	scanf("%s", pw);
	printf("Masukan Kode User: ");
	scanf("%s", ku);
	
	buffer = (char *)malloc(1000*sizeof(char));
	memset(buffer, 0, 1000*sizeof(char));
	ptr = buffer;
	fdat = fopen("FileUser.txt", "r");
	while(fscanf(fdat, "%s %s %s", datUN, datPW, datKU)!=EOF){
		if(!(strcmp(datUN, un)==0 && strcmp(datPW, pw)==0 && strcmp(datKU, ku)==0)){
				strcat(datUN, "\n");
				strcat(datPW, "\n");
				strcat(datKU, "\n");
				strcpy(ptr, datUN);
				ptr += strlen(datUN);
				strcpy(ptr, datPW);
				ptr += strlen(datPW);
				strcpy(ptr, datKU);
			   	ptr += strlen(datKU);
		}
	}
	fclose(fdat);
	
	fdat = fopen("FileUser.txt", "w+");
	fprintf(fdat, "%s\n", buffer);
	fclose(fdat);	
 	printf("\n\n--=Berhasil!=--\n\n");
 	
	main();
}