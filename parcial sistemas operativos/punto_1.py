import pandas as pd 
import os 

def write_txt():
    
    os.mkdir(r"C:\Users\danie\Desktop\parcial sistemas operativos\punto_1" )
    rute_1 = r"C:\Users\danie\Desktop\parcial\funciones_os.txt"
    
    archivo_1 = open(rute_1, "w")
    


    duple = ["Administrar recursos","ofreser una interfaz de control","Abstraer hardware","Ofreser multitarea","ofreser multiproceso"]

    

    i = 0
    while (i < len(duple)):
    
       index = duple[i]
       archivo_1.writelines(index + "\n")
       i += 1
   
def read_txt():
    print ("hola")

    rute_1 = r"C:\Users\danie\Desktop\parcial\funciones_os.txt"
    

    archivo_1 = open(rute_1, "r")
    list = archivo_1.readlines()

    funciones_so = pd.DataFrame()
    funciones_so["Funciones"] = list
    
    writer = pd.ExcelWriter(r"C:\Users\danie\Desktop\parcial\funciones_os.xlsx")
    funciones_so.to_excel(writer,"funciones_so")
    writer.save()

write_txt()
read_txt()
    

















