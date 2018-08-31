import pandas as pd
import numpy as np 
import matplotlib.pyplot as plt 
data=pd.read_csv('/home/monib/Downloads/Paytm_Wallet_Txn_History_Csv_Jul2018_7835892348 (1).csv')
data=data.fillna(0)
#data.groupby(data['Date'])['Debit'].sum().sort_values()
d=data[['Credit','Date']][data['Activity']=='Bonus Added']
#print(d)
data['Date'] = pd.to_datetime(data['Date'])
df=data.groupby(data['Date'].dt.strftime('%B'))['Debit'].sum()
df.to_csv('/home/monib/Downloads/Paytm_Debit.csv')
df1=data.groupby(data['Date'].dt.strftime('%B'))['Credit'].sum()
df1.to_csv('/home/monib/Downloads/Paytm_Credit.csv')
d['Date'] = pd.to_datetime(d['Date'])
df2=d.groupby(d['Date'].dt.strftime('%B'))['Credit'].sum()
df2.to_csv('/home/monib/Downloads/Paytm_Cashback.csv')
df3=df2.mean()
meandata=[df3]*12
debit_sum=df.sum()
cashback_sum=df2.sum()
cashback_per=(cashback_sum/debit_sum)*100
print("Total cashback")
print(cashback_sum)
print("Total Debit")
print(debit_sum)
print("Cashback Percentege")
print(cashback_per)
#print(data['Debit'])
#print(data['Credit'])
#print(data['Debit'].sum())
#print(data['Credit'].sum())
##print(df['March'])
plt.figure(figsize=(11,11))
plt.title("Paytm") 
plt.xlabel("Month",size=15) 
plt.ylabel("Amount",size=15) 
#Simple Plot
plt.plot(df2.index,df2)
plt.plot(df.index,df)
mean=df2.mean()
plt.plot(df2.index,meandata)
#plt.plot(df.index,mean_debit)

#mean cashback plot
plt.legend(['Cashback', 'Debit','Mean Cashback'], loc=2) 
plt.style.use('fast')
##print(df2.mean())
##print(df.mean())
plt.savefig('paytmfig.pdf', format='pdf')