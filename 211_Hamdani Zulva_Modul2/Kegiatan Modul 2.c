#include <stdio.h>

float kmu_usd(int idr){  //kmu = konversi mata uang
	float hasil;
	float usd = 0.000068;
	hasil = idr * usd ;
	
	return hasil;
}

float kmu_eur(int idr){
	float hasil;
	float eur = 0.000058;
	hasil= idr*eur;
	
	return hasil;
}

float kmu_rm(int idr){
	float hasil;
	float rm = 0.00028;
	hasil = idr*rm;
	
	return hasil;
}


int main(int argc, char** argv)
{
	float n_usd, n_eur, n_rm;
	const int idr_A = 9688;
	const int idr_B = 7856;
	const int idr_C = 8612021;
	printf("NIM : 202010370311211 \n \n");
	
	n_usd=kmu_usd(idr_A);
	n_eur= kmu_eur(idr_A);
	n_rm= kmu_rm(idr_A);
	printf("Konversi Rupiah A adalah %d rupiah sama dengan : \n %.2f dolar \n %.2f euro \n %.2f ringgit \n \n", idr_A, n_usd, n_eur, n_rm);

	n_usd=kmu_usd(idr_B);
	n_eur= kmu_eur(idr_B);
	n_rm= kmu_rm(idr_B);
	printf("Konversi Rupiah B adalah %d rupiah sama dengan : \n %.2f dolar \n %.2f euro \n %.2f ringgit \n \n", idr_B, n_usd, n_eur, n_rm);
	
	n_usd=kmu_usd(idr_C);
	n_eur= kmu_eur(idr_C);
	n_rm= kmu_rm(idr_C);
	printf("Konversi Rupiah A adalah %d rupiah sama dengan : \n %.2f dolar \n %.2f euro \n %.2f ringgit \n \n", idr_C, n_usd, n_eur, n_rm);
	
	return 0;
}