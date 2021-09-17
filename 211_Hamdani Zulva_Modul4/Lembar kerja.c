#include <stdio.h>
#define a 3

int main()
{
	int n,i,j;
	float d,x[a][a];
	
	printf("Masukan ordo matriks yang diinginkan (2x2 atau 3x3) : ");
	scanf("%d", &n);
	
	if(n>=2&&n<=3){
	printf("\nmasukan angka angka matriks : \n");	
	for (i=0;i<n;i++){
		for (j=0;j<n;j++){
			printf("masukan index [%d] [%d] :", i,j);
			scanf("%f", &x[i][j]);
		}
	}
	printf("\nhasil inputan : ");
	for (i=0;i<n;i++){
		printf("\n");
		for (j=0;j<n;j++)
			printf("%.1f \t \t", x[i][j]);
	}
	printf("\n \n");
	if(n == 2){
		d = (x[0][0]*x[1][1])-(x[0][1]*x[1][0]);
	}
	else if(n == 3){
		float jumlah_a = ((x[0][0]*x[1][1]*x[2][2])+(x[0][1]*x[1][2]*x[2][0])+(x[0][2]*x[1][0]*x[2][1]));
		float jumlah_b = (-(x[0][2]*x[1][1]*x[2][0])-(x[0][1]*x[1][0]*x[2][2])-(x[0][0]*x[1][2]*x[2][1]));		
		d = jumlah_a+jumlah_b;
	}
	
	printf("Nilai determinan yang dihasilkan adalah : %.2f \n", d);
	}
	else{
		printf("maaf masukan anda salah");
	}
	return 0;		
}