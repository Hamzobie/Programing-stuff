#include <stdio.h>

int hitung_are(int hektare);
int hitung_m_persegi(int hasil_are);
int hitung_cm_persegi(int hasil_m_persegi);

int main()
{
	int hektare, are, m_persegi, cm_persegi;
	
	printf("Masukan satuan luas dalam satuan hektare :");
	scanf("%d", &hektare);
	
	are = hitung_are(hektare);
	m_persegi = hitung_m_persegi(are);
	cm_persegi = hitung_cm_persegi(m_persegi);
	
	printf("Konversi satuan luas adalah %d hektare sama dengan :", hektare);
	printf("\n %d are \n %d meter persegi \n %d centimeter persegi", are, m_persegi, cm_persegi);
	
	return 0;
}

int hitung_are(int hektare)
{
	int hasil_are;
	hasil_are = hektare * 100;
	
	return hasil_are;
}

int hitung_m_persegi(int hasil_are)
{
	int hasil_m_persegi;
	hasil_m_persegi = hasil_are * 100;
	
	return hasil_m_persegi;
}

int hitung_cm_persegi(int hasil_m_persegi)
{
	int hasil_cm_persegi;
	hasil_cm_persegi = hasil_m_persegi * 10000;
	
	return hasil_cm_persegi;
}