char* reverseVowels(char* a) {
    char x[100000];
    int b=0;
    int n= strlen(a);

    for(int i=n-1;i>=0;i--){
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
            x[b]=a[i];
            b++;
        }
    }
    int l=0;
    for(int i=0;i<n;i++){
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
            a[i]=x[l];
            l++;
        }
    }

    return a;
}
