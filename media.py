import requests
import inflect
import os

base_url = 'https://www.google.com/logos/fnbx/animal_sounds/'
engine = inflect.engine()

animal_names = ['african-grey-parrot','alligator','ape','bat','bee',
'buffalo','camel','cat','rooster','cow','crow','dog','duck','elephant',
'frog','giraffe','horse','leopard','lion','moose','owl',
'penguin','pig','rat','rattlesnake','rhinoceros','sheep','tiger',
'wolf','zebra','antelope','falcon','panda','rabbit','robin']

def download_file(extension):
	for animal_name in animal_names:
		try:
			file = requests.get(base_url+animal_name+extension,allow_redirects=True)
			open(animal_name+extension,'wb').write(file.content)
			print "DOWNLOADED: "+animal_name+extension
		except:
			print "ERROR WHILE DOWNLOADING "+animal_name+extension

def alphabet_java_cases():
	i = 97
	j = 0
	while i<123:
		code = "case "+str(j)+":"+'\n'+'\t'+'object = new Object("{}",{},{})'.format(" ","R.drawable."+str(chr(i)),"R.raw."+str(chr(i)))+";"
		print code
		i = i+1
		j = j+1			
			
					
def number_java_cases():
	for i in range(0,52):
		code = "case "+str(i)+":"+'\n'+'\t'+'object = new Object("{}",{},{})'.format(engine.number_to_words(i),"R.drawable."+engine.number_to_words(i).replace('-',''),"R.raw."+engine.number_to_words(i).replace('-',''))+';'+'\n'+'\t'+'break;'
		print code

def siri_record_alphabets():
	for i in range(97,123):
		command = '''say -o "{}" "{}"'''.format(str(chr(i))+'.aiff',chr(i))
		os.system(command)
		
def siri_record_numbers(x,y):
	for i in range(x,y):
		command = '''say -o "{}" "{}"'''.format(str(i)+'.aiff',str(i))
		os.system(command)
		
