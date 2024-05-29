int numSteps(char* s) 
{
    int res = 0;
    int i = strlen(s) - 1;
    while (i > 0) {
        if (s[i] == '1') {
            res += 2;
            i--;
            while (i >= 0 && s[i] == '1') {
                res++;
                i--;
            }
            if (i > 0)
                s[i] = '1';
        } else {
            res++;
            i--;
        }
    }
    return res;
}
