#include<stdio.h>
#define n 3
int main()
{
int a[n][n],b[n*n],c[n*n],i,j,k=0,l=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("\n Enter elements of 2D array : ");
scanf("%d",&a[i][j]);
}
}
printf("\n Given 2D array : \n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d ",a[i][j]);
}
printf("\n");
}
printf("\n Row wise \n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[k]=a[i][j];
k++;
}
}
printf("\n Column wise \n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
c[l]=a[j][i];
l++;
}
}
}