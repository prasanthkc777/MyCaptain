# -*- coding: utf-8 -*-
"""
Created on Mon Jun 28 15:36:15 2021

@author: new
"""
import requests
import pandas as pd
import sqlite3
import lxml.html

r = requests.get("https://www.w3schools.com/html/html_tables.asp")

we3 = lxml.html.fromstring(r.text) #lxml is used to parse html content.

table = we3.get_element_by_id("customers")

table.getchildren() # we get the output as list which are table rows(tr)

len(table.getchildren()) # one is header and rest 6 are the table contents

table.getchildren()[0].getchildren() # this can be checked in the source code under the first set of <tr> tag

table.getchildren()[0].text_content() # header of the table


print(table.getchildren()[6].getchildren()[0].text_content())# last row, 1st element
print(table.getchildren()[6].getchildren()[1].text_content())#last row, 2nd element
print(table.getchildren()[6].getchildren()[2].text_content())#last row, 3rd element

data = {
    "Company"   :[],
    "Contact"   :[],
    "Country"   :[],    
}
for row in table.getchildren()[1:7]:
    data["Company"].append(row.getchildren()[0].text_content())
    data["Contact"].append(row.getchildren()[1].text_content())
    data["Country"].append(row.getchildren()[2].text_content())


we3_table = pd.DataFrame(data)
we3_table

for i in we3_table.itertuples():
    print(i)
    
for q in we3_table.itertuples(): #we dont want the Index as displayed above.
    print(q[1:])

conn = sqlite3.connect(":memory:") # database(stored in variable conn) is created temprorarily in memory
cursor = conn.cursor()
cursor.execute("""
    CREATE TABLE we3(Company, Contact, Country)
""")
for row in we3_table.itertuples():
    insert_table = """
    INSERT INTO we3(Company, Contact, Country) \
    VALUES (?,?,?)
"""
    cursor.execute(insert_table, row[1:])
#conn.close()
conn.commit()

retrieving = conn.execute("SELECT company, contact, country FROM we3")
for row in retrieving:
   print("Company = ", row[0])
   print("Contact = ", row[1])
   print("Country = ", row[2], "\n")


conn.close()    
    

                