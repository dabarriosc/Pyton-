import pandas as pd

duple = ["Administrar recursos","ofreser una interfaz de control","Abstraer hardware","Ofreser multitarea","ofreser multiproceso"]

funciones_so = pd.DataFrame()
funciones_so["Funciones"] = duple

funciones_so.to_excel("hola.xlsx")

print(funciones_so)