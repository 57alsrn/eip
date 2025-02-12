#include <stdio.h>

int main()
{
    int a = 10;
    int *p = &a;
    printf("포인터 p의 값(메모리 주소) >> %p\n", p);  // 포인터가 가리키는 주소 출력
    printf("p가 가리키는 값 >> %d\n", *p);  // 포인터가 가리키는 값 출력
}