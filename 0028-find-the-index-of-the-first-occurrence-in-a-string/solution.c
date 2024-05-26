int strStr(char * haystack, char * needle){
int i,j,flag;
for(i=0;haystack[i];i++)
{
    if(haystack[i]==needle[0] && strlen(haystack)-i>=strlen(needle))
    {   flag=0;
        for(j=0;needle[j];j++) if(needle[j]!=haystack[i+j]) flag=1;
        if(flag==0) return i;
    }
}
return -1;
}
