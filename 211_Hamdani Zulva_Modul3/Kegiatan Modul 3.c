#include <stdio.h>

int main(int argc, char** argv)
{
	int i, n, total=0;
	int d1, d2, d3;
	int tb1, tb2, tb3;
	
	printf(" >>> INFOTECH STORE <<< \n");
	for(i=1; i<4; i++){
		printf("masukan harga barang %d : ", i);
		scanf("%d", &n);
		total += n;
		d1 = total * 0.10;
		d2 = total * 0.20;
		d3 = total * 0.25; 
	 	tb1= total - d1;
	 	tb2= total - d2;
	 	tb3= total - d3;
	}
	if( total < 100000){
		printf("tidak ada potongan, terima kasih \n \n");
		printf("total bayar anda sebesar : %d \n \n", total);
	} else if (total >= 100000 && total < 300000)
	{
		printf("anda mendapat potongan 10 persen \n \n");
		printf("total harga : %d \n", total);
		printf("diskon : %d \n", d1);
		printf("total bayar anda sebesar : %d \n \n", tb1);
	} else if (total >= 300000 && total < 500000)
	{
		printf("anda mendapat potongan 20 persen \n \n");
		printf("total harga : %d \n", total);
		printf("diskon : %d \n", d2);
		printf("total bayar anda sebesar : %d \n \n", tb2);
	} else 
	{
		printf("anda mendapat potongan 25 persen \n \n");
		printf("total harga : %d \n", total);
		printf("diskon : %d \n", d3);
		printf("total bayar anda sebesar : %d \n \n", tb3);
	}
	printf("selamat berbelanja kembali ;) \n");
	
	return 0;
}