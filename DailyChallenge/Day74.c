#include <stdio.h>
void removeRepeatingAlphabets(char str[])
{
    int y = 1;
    while (1)
    {
        for (int i = 0; i < strlen(str) - 1; i++)
        {
            if (str[i] == str[i + 1])
            {
                for (int j = i; j < strlen(str) - 2; j++)
                {
                    str[j] = str[j + 2];
                }
                y = 0;
                str[strlen(str) - 2] = '\0';
                break;
            }
        }
        if (y == 1)
            break;
        else
            y = 1;
    }
}
int main()
{
    char str[1001];
    scanf("%s", str);
    removeRepeatingAlphabets(str);
    printf("%s", str);
    return 0;
}