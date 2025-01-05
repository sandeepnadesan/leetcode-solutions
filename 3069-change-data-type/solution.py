import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(students)
    c = {'grade': int}
    df=df.astype(c)
    return df
