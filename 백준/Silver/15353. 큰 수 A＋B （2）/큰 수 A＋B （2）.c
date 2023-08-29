#include <stdio.h>
#include <string.h>

#define MAX_LENGTH 1000005

// 두 큰 정수를 더하는 함수
void addBigIntegers(char *num1, char *num2, char *result) {
    int len1 = strlen(num1);
    int len2 = strlen(num2);

    // 더 긴 정수의 길이 + 1 만큼의 공간을 할당
    int maxLength = len1 > len2 ? len1 : len2;
    int carry = 0;

    for (int i = 0; i < maxLength; i++) {
        int digit1 = i < len1 ? num1[len1 - i - 1] - '0' : 0;
        int digit2 = i < len2 ? num2[len2 - i - 1] - '0' : 0;

        int sum = digit1 + digit2 + carry;
        carry = sum / 10;
        result[maxLength - i] = (sum % 10) + '0';
    }

    result[maxLength + 1] = '\0';

    if (carry) {
        result[0] = carry + '0';
    } else {
        // carry가 없는 경우 맨 앞의 자릿수는 필요하지 않음
        for (int i = 0; i <= maxLength; i++) {
            result[i] = result[i + 1];
        }
    }
}

int main() {
    char num1[MAX_LENGTH], num2[MAX_LENGTH], result[MAX_LENGTH + 1];

    // 두 큰 정수 입력 받기
    scanf("%s %s", num1, num2);

    // 큰 정수 덧셈 수행
    addBigIntegers(num1, num2, result);

    // 결과 출력
    printf("%s\n", result);

    return 0;
}